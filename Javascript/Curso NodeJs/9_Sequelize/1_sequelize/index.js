const express = require('express')
const exphbs = require('express-handlebars')
const connection = require('./db/conection')

const User = require('./model/User')
const Address = require('./model/Address')

const port = 3010

const app = express()

//O professor também falou de preparação de queries para se proteger de sql injection

const hbs = exphbs.create({
    partialsDir : ['views/partials']
})

app.use(express.urlencoded({
    extended:true
}))
app.use(express.json())
app.engine('handlebars',hbs.engine)
app.set('view engine' ,'handlebars')
app.use('/public',express.static('public'))



// app.listen(port,()=>{
//     console.log(`App rodando na porta  ${port}`)
// })

app.get('/',async (req,res)=>{

    const users = await User.findAll({raw: true})

    res.render('home',{users})
})

app.get('/usuario/criar',(req,res)=>{
    res.render('addusuario')
})

app.post('/usuario/criar', async (req,res)=>{
    const name = req.body.nome
    const occupation = req.body.ocupacao
    let newsletter = req.body.newsletter

    if(newsletter === 'on'){
        newsletter = true
    }
    else{
        newsletter = false
    }

    await User.create({name,occupation,newsletter})

    res.status(201).redirect('/')
    
})

app.get('/usuario/:id',async (req,res)=>{

    const id = req.params.id
    let promocao = ''

    const user = await User.findOne( {raw : true ,where : {id:id} } )

    if(user.newsletter === 1 ){
        promocao = 'Quer receber Promoções '
    }
    else{
        promocao = 'Não quer receber Promoções'
    }

    res.status(201).render('usuario',{user,promocao})
})

app.post('/usuario/delete/:id',async (req,res)=>{
    const id = req.params.id

     await User.destroy({where:{id:id}})

     res.status(201).redirect('/')
})

app.get('/usuario/edit/:id', async(req,res)=>{
    const id = req.params.id

    try {
        const user = await User.findOne( {include : Address ,where : {id:id} } )
        res.render('usuarioedit',{user :user.get({plain:true})})
    } catch (error) {
        console.log(error)
    }

    // res.render('usuarioedit',{user})

})

app.post('/usuario/edit', async (req,res)=>{
    const id = req.body.id
    const name = req.body.nome
    const occupation = req.body.ocupacao
    let newsletter = req.body.newsletter

    if(newsletter === undefined){
        newsletter = false
    }
    else{
        newsletter = true
    }

    const userData = {
        id,
        name,
        occupation,
        newsletter
    }

    await User.update(userData,{where : {id:id} })

    res.redirect('/')
    

})

app.post('/endereco/criar', async(req,res)=>{
    const UserId = req.body.UserId
    const street = req.body.street
    const number = req.body.number
    const city = req.body.city

    const address = {
        UserId,
        street,
        number,
        city
    }

    await Address.create(address)

    res.redirect(`/usuario/edit/${UserId}`)

})

app.post('/endereco/deletar', async(req,res)=>{
    const id = req.body.idendereco
    const iduser = req.body.idusuario
    
    await Address.destroy({where :{id:id}})

    console.log(`id: ${id} iduser${iduser}` )

    res.redirect(`/usuario/edit/${iduser}`)

})

connection.sync().then(()=>{
     app.listen(port,()=>{
        console.log(`App rodando na porta  ${port}`)
     })
}).catch(erro =>{console.log(`erro encontrado ${erro}`)})
 


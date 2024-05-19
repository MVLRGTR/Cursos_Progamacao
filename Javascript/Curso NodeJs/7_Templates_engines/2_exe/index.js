const express = require('express')
const exphbs = require('express-handlebars')
const port = 3010

const app = express()

const hbs = exphbs.create({
    partialsDir : ['views/partials']
})

app.engine('handlebars', hbs.engine)
app.set('view engine', 'handlebars')

app.use('/public',express.static('public'))

app.listen(port,()=>{
    console.log(`App funcionado na porta : ${port}`)
})

const produtos = [
    {
        id: '1',
        nome: 'Chave de fenda',
        preco: '5.89',
        descricao: 'Essa é uma chave utilizada para tirar parafusos com o formato fenda.'
    },
    {
        id: '2',
        nome: 'Jogo Chave de boca',
        preco: '55.66',
        descricao: 'Esse é um jogo de chaves utilizado para apertar ou soltar porcas e parafusos com diferentes tamanhos de cabeça.'
    },
    {
        id: '3',
        nome: 'Martelo',
        preco: '35.89',
        descricao: 'Esse é um martelo utilizado para bater ou ajustar pregos e outros objetos em superfícies.'
    }
    
]

app.get('/',(req,res)=>{
    res.render('home',{produtos})
})

app.get('/produto/:id',(req,res)=>{
    const id_produto = req.params.id
    var validador = false

    for(const valor of produtos){
        if(valor.id === id_produto){
            validador = true
            res.render('produtodetalhes',{valor})
        }
    }

    if(validador === false){
        res.status(404).render('404')
    }
})

app.use((req,res)=>{
    res.status(404).render('404')
})
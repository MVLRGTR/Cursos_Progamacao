const express = require('express')
const app = express()

app.use(
    express.urlencoded({
        extended:true
    }),
)
app.use(express.json())



app.listen(3000,()=>{
    console.log('App escutando na porta 3000')
})

//rotas
app.get('/',(req,res)=>{
    res.json({
        message:"Primeira rota criada com sucesso"
    })
})
app.post('/',(req,res)=>{
    const name = req.body.name
    const price = req.body.price
    
    if(!name){
        res.status(422).json({message: 'O nome não pode ser vazio !!!'})
        return
    }

    res.status(201).json({
        massage : `Produto ${name} com o preço R$:${price} criado com sucesso`
    })
})
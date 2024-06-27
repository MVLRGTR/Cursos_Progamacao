const express = require('express')
const app = express()
const port = 5000

const path = require('path')
const basepath = decodeURIComponent(path.resolve('templates'))

const rotausuario = require('./usuarios/rotausuario.js')
const rotaprodutos = require('./produtos/rotaprodutos.js')

app.use(
    express.urlencoded({
        extended:true
    })
)
app.use(express.json())
app.use('/public',express.static('public'))

app.use('/usuario',rotausuario)
app.use('/produtos',rotaprodutos)

app.get('/',(req,res)=>{
    res.status(200).sendFile(`${basepath}/index.html`)
})

app.use(function(req,res,next){
    res.status(404).sendFile(`${basepath}/404.html`)
})

app.listen(port ,()=>{
    console.log(`Escutando na porta ${port}`)
})
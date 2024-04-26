const express = require('express')
const app = express()
const morgan = require('morgan')
const bodyParser = require('body-parser')



const rotaProdutos = require('./routes/produtos')
const rotaPedidos = require('./routes/pedidos')
const rotaUsuarios = require('./routes/usuarios')


app.use(morgan('dev')) //ele atualiza no terminal o tipo de requisição , executando um callback antes de chamar as rotas
app.use('/uploads',express.static('uploads')) //torno o diretorio uploads publico
app.use(bodyParser.urlencoded({extended:false})) // siginifica que todos os dados são interpretados como strings e array e não podem ser objetos complexos
app.use(bodyParser.json()) //informe que será utilizado  o formato json no server 
app.use((req,res,next)=>{
    res.header('Access-Control-Allow-Origin','*') //informo aqui que minha api e publica para quem quiser acessar
    res.header(
        'Access-Control-Allow-Header'
        ,'Origin ,X-Requrested-With ,Content-Type ,Accept , Authorization') //estou adicionando os cabeçalhos CORS  na minha API , o que será aceito na requisição
    
    if(req.method === 'OPTIONS'){
        res.header('Access-Control-Allow-Methods' ,'PUT , POST , PATCH , DELETE, GET')
        return res.status(200).send({})
    }
    next()
})



app.use('/produtos', rotaProdutos)
app.use('/pedidos', rotaPedidos)
app.use('/usuarios',rotaUsuarios)


app.use((req,res,next)=>{
    const erro = new Error('Não encontrado a rota especificada')
    erro.status = 404
    next(erro)
})
app.use((erro,req,res,next)=>{
    res.status(erro.status || 500)
    return res.send({
        erro:{
            mensagem: erro.message
        }
    })
})


module.exports = app
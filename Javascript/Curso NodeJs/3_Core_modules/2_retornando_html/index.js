const http = require('http')

const port = 3001

const server = http.createServer((req,res)=>{
    res.statusCode = 200
    res.setHeader('Contenty-Type','text/html')
    res.end('<h1>Olá este é mau primeiro server no curso com html</h1><p>Testando atualização</p>')
})

server.listen(port,()=>{
    console.log(`servidor rodando na porta ${port}`)
})
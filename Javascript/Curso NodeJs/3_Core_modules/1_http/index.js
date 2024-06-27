const http = require('http')

const port = 3001

const server = http.createServer((req,res)=>{
    res.write('Olá Mundo')
    res.end()
})

server.listen(port,()=>{
    console.log(`servidor rodando na porta ${port}`)
})
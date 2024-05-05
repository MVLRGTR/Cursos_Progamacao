const http = require('http')
const fs = require('fs')
const url = require('url')
const port = 3001

const server = http.createServer((req,res)=>{
    const urlInfo = url.parse(req.url,true)
    const nome = urlInfo.query.nomeusuario

    if(!nome){ 
        fs.readFile('index.html',function(erro,data){
            res.writeHead(200 , {'Content-Type' : 'text/html'})
            res.write(data)
            return res.end()
        })
    }
    else{
        
        const nameline = nome + ',\r\n'

        fs.appendFile('arquivo.txt',nameline,function(erro,data){
            res.writeHead(302,{
                location: '/'
            })
            return res.end()
        })
    }
})

server.listen(port,()=>{
    console.log(`servidor rodando na porta ${port}`)
})

 
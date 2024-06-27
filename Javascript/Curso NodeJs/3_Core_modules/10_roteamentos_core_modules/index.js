const http = require('http')
const fs = require('fs')
const url = require('url')
const port = 3001

const server = http.createServer((req,res)=>{
    const query = url.parse(req.url,true)
    const filename = query.pathname.substring(1)
    console.log('entrou aqui :',filename)

    if(filename.includes('html')){ 
        if(fs.existsSync(filename)){
            fs.readFile(filename,function(erro,data){
                res.writeHead(200 , {'Content-Type' : 'text/html'})
                res.write(data)
                return res.end()
            })
        }
        else{
            fs.readFile('404.html',function(erro,data){
                res.writeHead(404 , {'Content-Type' : 'text/html'})
                res.write(data)
                return res.end()
            })
        }
    }
    
})

server.listen(port,()=>{
    console.log(`servidor rodando na porta ${port}`)
})

 
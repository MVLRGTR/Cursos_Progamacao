const http = require('http')
const url = require('url')

const port = 3001

const server = http.createServer((req,res)=>{

    const urlInfo = url.parse(req.url,true)
    const nome_res = urlInfo.query.nomeusuario

    res.statusCode = 200
    res.setHeader('Contenty-Type','text/html')
    
    if(!nome_res){
        res.end('<h1>Preencha o seu nome</h1><form method="GET"><input type="text" name="nomeusuario"/><input type="submit" value="enviar"/></form>')
    }else{
        res.end(`<H1>SEJA BEM VINDO ${nome_res}!</h1>`)
    }

})

server.listen(port,()=>{
    console.log(`servidor rodando na porta ${port}`)
})
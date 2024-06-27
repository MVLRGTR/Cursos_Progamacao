import express from 'express'
import { truncate } from 'fs';
const app = express()
const port = 3010
import path from 'path'


const basepath = decodeURIComponent(path.resolve('templates'));

const checkaut = function(req,res,next){
    req.authStatus = true
    if(req.authStatus){
        console.log('Usuario logado ,pode continuar !!!')
        next()
    }
    else{
        console.log('Usiario não logado , por favor verifique seu login !!!')
    }


}

app.use(checkaut)

app.listen(port, () => {
    console.log(`App funcionando na porta ${port} com basepath em ${basepath}`);
});

app.get('/', (req, res) => {
    res.status(200).sendFile(`${basepath}/index.html`);
});
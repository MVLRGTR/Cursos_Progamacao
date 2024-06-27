import express, { urlencoded } from 'express'
import { truncate } from 'fs';
const app = express()
const port = 3010
import path from 'path'


const basepath = decodeURIComponent(path.resolve('templates'));


app.use(
    express.urlencoded({
        extended:true
    })
)

app.use(express.json())

app.listen(port, () => {
    console.log(`App funcionando na porta ${port} com basepath em ${basepath}`);
})


app.get('/users/add',(req,res)=>{
    res.sendFile(`${basepath}/userform.html`)
})

app.get('/users/:id', (req, res) => {
    const id = req.params.id

    console.log('Estamos Buscando o Usuario :',id)

    res.status(200).sendFile(`${basepath}/users.html`);
})

app.post('/users/save',(req,res)=>{
    console.log(req.body)

    const nome = req.body.name
    const idade = req.body.age

    console.log(`O nome do usuario é ${nome} e a sua idade é ${idade} anos`)

    res.status(200).sendFile(`${basepath}/userform.html`)
})

app.get('/', (req, res) => {
    res.status(200).sendFile(`${basepath}/index.html`);
})
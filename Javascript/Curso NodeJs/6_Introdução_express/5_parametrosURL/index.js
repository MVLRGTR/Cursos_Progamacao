import express from 'express'
import { truncate } from 'fs';
const app = express()
const port = 3010
import path from 'path'


const basepath = decodeURIComponent(path.resolve('templates'));





app.listen(port, () => {
    console.log(`App funcionando na porta ${port} com basepath em ${basepath}`);
})

app.get('/users/:id', (req, res) => {
    const id = req.params.id

    console.log('Estamos Buscando o Usuario :',id)

    res.status(200).sendFile(`${basepath}/users.html`);
})

app.get('/', (req, res) => {
    res.status(200).sendFile(`${basepath}/index.html`);
})
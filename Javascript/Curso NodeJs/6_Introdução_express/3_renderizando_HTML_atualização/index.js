import express from 'express'
const app = express()
const port = 3010
import path from 'path'


const basepath = decodeURIComponent(path.resolve('templates'));

app.listen(port, () => {
    console.log(`App funcionando na porta ${port} com basepath em ${basepath}`);
});

app.get('/', (req, res) => {
    res.status(200).sendFile(`${basepath}/index.html`);
});
const express = require('express')
const truncade = require('fs')
const app = express()
const port = 3010
const routeruser = require('./users')
const path = require('path')
const basepath = decodeURIComponent(path.resolve('templates'));

app.use(
    express.urlencoded({
        extended:true
    })
)
app.use(express.json())



app.listen(port, () => {
    console.log(`App funcionando na porta ${port}`);
})

app.use('/users',routeruser)

app.get('/', (req, res) => {
    res.status(200).sendFile(`${basepath}/index.html`);
})
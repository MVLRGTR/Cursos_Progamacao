const express = require('express')
const exphbs = require('express-handlebars')
const connection = require('./db/connection')
const port = 3010

const Task = require('./models/Task')
const taskroutes = require('./routes/Taskroutes')

const app = express()
app.use(express.urlencoded({
    extended:true
}))
app.use(express.json())
app.use('/public',express.static('public'))


const hbs = exphbs.create({
    partialsDir : ['views/partials']
})
app.engine('handlebars',hbs.engine)
app.set('view engine' ,'handlebars')


connection.sync().then(()=>{
    app.listen(port,()=>{
        console.log(`App rodando na prota :${port}`)
    })
}).catch(erro =>{console.log(`erro encontrado ${erro}`)})

app.use('/task',taskroutes)
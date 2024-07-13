const express = require('express')
const exphbs = require('express-handlebars')
const connectionDb = require('./db/connection')

//rotas
const ProductRouter = require('./routes/ProductsRoutes')

const app = express()

const hbs = exphbs.create({
    partialsDir : ['views/partials']
})
app.engine('handlebars',hbs.engine)
app.set('view engine','handlebars')

//read body
app.use(
    express.urlencoded({
        extends:true
    })
)

app.use(express.json())
app.use(express.static('public'))
app.use('/products',ProductRouter)
app.listen(3000)
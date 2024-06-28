require('dotenv').config()
const express = require('express')
const routes = require('./routes')

const server = express()

server.use(express.json())

server.use(routes)

server.listen(process.env.PORT,()=>{
    console.log(`App rodando na porta : ${process.env.PORT}`)
})

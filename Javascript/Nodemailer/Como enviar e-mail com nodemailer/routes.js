const express = require('express')
const { sendEmail} = require('./controllers/email')

const routes =  express()

routes.post('/send',sendEmail)


module.exports = routes
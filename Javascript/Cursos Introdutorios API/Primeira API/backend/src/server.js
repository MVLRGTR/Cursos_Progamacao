const app = require('./app')
require('dotenv').config()
const PORTA =process.env.PORTA || 3333
// console.log('PORTA:', process.env.PORTA);


app.listen(PORTA,()=> console.log(`Server is running or port ${PORTA}`))
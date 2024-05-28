const mysql = require('mysql')

const pool = mysql.createPool({
    connectionLimit: 10,
    host :'localhost',
    user :'novo',
    password:'senha12345@',
    database:'nodemysql'
})

module.exports = pool
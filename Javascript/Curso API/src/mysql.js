// const mysql = require('mysql')

// var pool = mysql.createPool({
//     host: "127.0.0.1", 
//     port: "3131",
//     user: "novod",
//     password: "Senha123456",
//     database: "ecommerce"
// })

// exports.pool = pool

const mysql = require('mysql')
require('dotenv').config()
console.log('Host', process.env.MYSQL_HOST)


var pool = mysql.createPool({
    connectionLimit: 100,
    host: process.env.MYSQL_HOST,
    port: process.env.MYSQL_PORT,
    user: process.env.MYSQL_USER,
    password: process.env.MYSQL_PASSWORD,
    database: process.env.MYSQL_DB
})

exports.execute = (query, params = []) => {
    return new Promise((resolve, reject) => {
        pool.query(query, params, (error, results, fields) => {
            if (error) {
                reject(error)
            }
            else {
                resolve(results)
            }
        })

    })
}

exports.pool = pool
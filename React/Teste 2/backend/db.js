import mysql from "mysql"

export const db = mysql.createConnection({
    host:"127.0.0.1", 
    port:'3306',
    user:"novo",
    password:"Senha12345",
    database:"crud_react"
})
const {Sequelize} = require ('sequelize')

const sequelize = new Sequelize('nodesequelizemvc','novo','senha12345@',{
    host:'localhost',
    dialect:'mysql'
})

try{
    sequelize.authenticate()
    console.log('Conexão feita com sucesso')
}
catch(erro){
    console.log(erro)
}
module.exports = sequelize
const {Sequelize} = require('sequelize')

const sequelize = new Sequelize('nodesequelize2','novo','senha12345@',{
    host:'localhost',
    dialect:'mysql'
})

// try{
//     sequelize.authenticate()
//     console.log('Conexão feita com sucesso utilizando o sequelize !!!')
// }catch(erro){
//     console.log(`Não foi possivel realizar a conexão erro : ${erro}`)
// } esse metodo faz um ping apenas no banco de dados 

module.exports = sequelize
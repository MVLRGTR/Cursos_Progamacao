const mongoose = require('mongoose')

async function main(){
    await mongoose.connect('mongodb://localhost:27017/mongooseAdptacao')
    console.log('Conexão ao MongoDb realizada com sucesso Utilizando mongoose !!!')
}

try{
    main()
}catch(erro){
    console.log(erro)
}   

module.exports = mongoose
const {MongoClient} = require('mongodb')

const uri = "mongodb://localhost:27017/mongodbconnection"

const client =  new MongoClient(uri)

async function runDb(){
    try{
        await client.connect()
        console.log("Conectando ao MongoDb")
    }catch(erro){
        console.log('Erro :',erro)
    }
}

runDb()

module.exports =  client
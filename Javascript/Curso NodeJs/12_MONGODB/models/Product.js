const connection = require('../db/connection')
const {ObjectId} = require('mongodb')

class Product {
    constructor(name,ImageUrl,price,description){
        this.name = name
        this.ImageUrl = ImageUrl
        this.price = price
        this.description = description
    }

    save(){
        const product = connection.db().collection('products').insertOne({
            name: this.name,
            ImageUrl : this.ImageUrl,
            price: this.price,
            description: this.description

        })
        return product
    }

    static GetProducts(){
        const products =  connection.db().collection('products').find().toArray()
        return products
    }

    static async GetProductById(id){
        const product = await connection.db().collection('products').findOne({_id: new ObjectId(id)}) //o id no mongodb e um objeto e precisa de um operador proprio 
        return product
    }
}

module.exports = Product
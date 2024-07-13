const Product = require('../models/Product')

module.exports = class ProductController{
    static async ShowProducts(req,res){
        const ProductsAll = await Product.find().lean()
        res.render('products/all',{ProductsAll})
    }

    static CreateProduct(req,res){
        res.render('products/create')
    }

    static async CreateProductPost(req,res){

        const name = req.body.name
        const ImageUrl = req.body.ImageUrl
        const price = req.body.price
        const description = req.body.description

        const product = new Product({name,ImageUrl,price,description})

        console.log(`name : ${name} , ImageUrl:${ImageUrl}, price :${price} , description : ${description}`)
        
        await product.save() //Salvando o objeto no banco , com o metodo proprio do mongoose

        res.redirect('/products')

    }

    static async GetProduct(req,res){
        const id = req.params.id
        const product = await Product.findById(id).lean()
        res.render('products/product',{product})
    }

    static async RemoveProduct(req,res){
        const id = req.params.id
        await Product.deleteOne({_id:id})
        res.redirect('/products')
    }

    static async EditProduct(req,res){
        const id = req.params.id

        const product =  await Product.findById(id).lean()
        console.log(`Product : ${JSON.stringify(product, null, 2)}`)
        res.render('products/edit',{product})

    }

    static async EditProductPost(req,res){
        const id = req.body.id
        const name = req.body.name
        const ImageUrl = req.body.ImageUrl
        const price= req.body.price
        const description= req.body.description
        

        const product = {name,ImageUrl,price,description}

        await Product.updateOne({_id:id},product)

        res.redirect('/products')
    }
}
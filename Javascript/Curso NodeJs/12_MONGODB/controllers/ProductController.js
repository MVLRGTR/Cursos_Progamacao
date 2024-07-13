const Product = require('../models/Product')

module.exports = class ProductController{
    static async ShowProducts(req,res){
        const ProductsAll = await Product.GetProducts()
        res.render('products/all',{ProductsAll})
    }

    static CreateProduct(req,res){
        res.render('products/create')
    }

    static CreateProductPost(req,res){

        const name = req.body.name
        const ImageUrl = req.body.ImageUrl
        const price = req.body.price
        const description = req.body.description

        const product = new Product(name,ImageUrl,price,description)
        
        product.save() //Salvando o objeto no banco , com o metodo criado na classe

        res.redirect('/products')

    }

    static async GetProduct(req,res){
        const id = req.params.id
        const product = await Product.GetProductById(id)
        res.render('products/product',{product})
    }

    static async RemoveProduct(req,res){
        const id = req.params.id
        await Product.RemoveProductById(id)
        res.redirect('/products')
    }

    static async EditProduct(req,res){
        const id = req.params.id

        const product =  await Product.GetProductById(id)

        res.render('products/edit',{product})

    }

    static async EditProductPost(req,res){
        const ProductReq = {
            id : req.body.id,
            name : req.body.name,
            ImageUrl : req.body.ImageUrl,
            price: req.body.price,
            description: req.body.description
        }

        const ProductUpdate = new Product(ProductReq.name,ProductReq.ImageUrl,ProductReq.price,ProductReq.description)

        await ProductUpdate.EditProductById(ProductReq.id)

        res.redirect('/products')
    }
}
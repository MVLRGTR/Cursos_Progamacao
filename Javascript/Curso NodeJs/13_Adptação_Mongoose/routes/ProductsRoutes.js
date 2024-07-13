const express = require('express')
const router = express.Router()
const ProductController =  require('../controllers/ProductController')

router.get('/create',ProductController.CreateProduct)
router.post('/create',ProductController.CreateProductPost)

router.get('/:id',ProductController.GetProduct)

router.get('/edit/:id',ProductController.EditProduct)
router.post('/edit',ProductController.EditProductPost)

router.post('/remove/:id',ProductController.RemoveProduct)

router.get('/',ProductController.ShowProducts)

module.exports = router 
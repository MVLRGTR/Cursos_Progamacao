const express = require('express')
const router = express.Router()

const multer = require('multer')
const login = require('../../middleware/login')

const ProdutosControllers = require('../../controllers/produtos-controllers')

const storage = multer.diskStorage({
    destination:function(req,file,cb){
        cb(null,'./uploads/')
    },
    filename: function(req,file,cb){
        // cb(null,new Date().toISOString() + file.originalname)
        let data = new Date().toISOString().replace(/:/g, '-') + '-'
        cb(null, data + file.originalname )
    }
})
const fileFilter = (req,file,cb)=>{
    if(file.mimetype==='image/jpeg' || file.mimetype === 'image/png'){
        cb(null,true)
    }
    else{
        cb(null,false)
    }
}
const upload  = multer({
    storage: storage,
    limits:{
        fileSize:1024*1024*5
    },
    fileFilter: fileFilter
})


router.get('/',ProdutosControllers.getProdutos )

router.get('/filtro',ProdutosControllers.getProdutosQuery)

router.post('/',login.obrigatorio,upload.single('produto_image'),ProdutosControllers.postProdutos)

router.get('/:id_produto', ProdutosControllers.getIdProdutos)

router.patch('/',login.obrigatorio, ProdutosControllers.patchProdutos)

router.delete('/',login.obrigatorio, ProdutosControllers.deleteProdutos)

module.exports = router
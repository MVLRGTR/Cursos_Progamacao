const express = require('express')
const router = express.Router()
const login = require('../../middleware/login')
const CategoriasControllers = require('../../controllers/categoria-controller')

router.get('/',CategoriasControllers.getCategorias)

router.post('/',login.obrigatorio,CategoriasControllers.postCategorias)

router.get('/:id_categoria',CategoriasControllers.getIdCategoria)

// router.patch('/',)

router.delete('/',login.obrigatorio,CategoriasControllers.deleteCategoria)

module.exports = router
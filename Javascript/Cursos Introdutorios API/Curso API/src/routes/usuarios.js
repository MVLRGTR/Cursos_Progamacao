const express = require('express')
const router = express.Router()
const UsuariosControllers = require('../../controllers/usuarios-controllers')


router.post('/cadastro', UsuariosControllers.postCadastro)

router.post('/login',UsuariosControllers.postlogin)

module.exports = router


const express = require('express')
const router = express.Router()
const taskController = require('./controllers/taskController')
const usuarioMiddleware = require('./middlewares/usuariomiddleware')

router.get('/usuario',taskController.getAll)
router.post('/usuario', usuarioMiddleware.validatebody,taskController.CadastraUsuarios)
router.delete('/usuario/:id',taskController.DeletaUsuario)
router.put('/usuario/:id',taskController.UpdateUsuario)

module.exports = router


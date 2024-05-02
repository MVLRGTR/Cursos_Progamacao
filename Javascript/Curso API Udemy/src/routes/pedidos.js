const express = require('express')
const PedidosControllers = require('../../controllers/pedidos-controller')
const router = express.Router()

router.get('/',PedidosControllers.getPedidos )

router.post('/',PedidosControllers.postPedidos)

router.get('/:id_pedido',PedidosControllers.getIdPedidos)

router.patch('/', PedidosControllers.pacthPedidos)

router.delete('/', PedidosControllers.deletePedidos)

module.exports = router
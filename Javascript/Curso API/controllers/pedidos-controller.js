const mysql = require('../src/mysql')

exports.getPedidos = async (req, res, next) => {

    const query = `select  i_idpedidos_pedidos , i_quantidade_pedidos ,i_idproduto_produtos , s_nome_produtos ,i_preco_produtos from pedidos  
        inner join produtos on produtos.i_idproduto_produtos = pedidos.produtos_i_idproduto_produtos`

    try {
        result = await mysql.execute(query)
        const response = {
            quantidade: result.length,
            pedidos: result.map((elemento) => {
                var id = elemento.i_idpedidos_pedidos
                return {
                    id_pedido: elemento.i_idpedidos_pedidos,
                    quantidade: elemento.i_quantidade_pedidos,
                    produto: {
                        id_produto: elemento.i_idproduto_produtos,
                        nome: elemento.s_nome_produtos,
                        preco: elemento.i_preco_produtos
                    },
                    request: {
                        tipo: "GET",
                        descricao: 'Retornando Todos os Pedidos',
                        url: 'http://localhost:3555/pedido/' + id
                    }
                }
            })
        }


        res.status(201).send({ message: 'Retornando Todos os Pedidos', response })

    }
    catch (error) {
        if (error) { return res.status(500).send({ erro: error }) }
    }
}

exports.postPedidos = async (req, res, next) => {
    const pedido = {
        id_produto: req.body.id_produto,
        quantidade: req.body.quantidade
    }

    const query = 'INSERT INTO pedidos (produtos_i_idproduto_produtos,i_quantidade_pedidos) VALUES (?,?)'

    try {
        const result = await mysql.execute(query, [pedido.id_produto, pedido.quantidade])
        const response = {
            PedidoCriado: {
                Id_pedido: result.insertId,
                Produto: pedido.id_produto,
                Quantidade: pedido.quantidade
            },
            request: {
                tipo: 'POST',
                descricao: 'Insere um pedido',
                url: 'http://localhost:3555/pedidos'
            }
        }

        res.status(201).send({ Message: 'Pedido criado com sucesso', response })
    }
    catch (erro) {
        if (erro) { return res.status(500).send({ erro: erro }) }
    }
}

exports.getIdPedidos = async (req, res, next) => {
    const id_pedido = req.params.id_pedido

    try {
        const result = await mysql.execute('SELECT * FROM pedidos WHERE i_idpedidos_pedidos = ? ', [id_pedido])

        if (result.length === 0) {
            return res.status(404).send({ Message: `Não foi encontrado nenhum pedido com esse ID:${id_pedido}` })
        }

        const response = {
            ProdutoRetornado: {
                Id_produto: result[0].i_idpedidos_pedidos,
                Nome: result[0].produtos_i_idproduto_produtos,
                Preco: result[0].i_quantidade_pedidos
            },
            request: {
                tipo: 'GET',
                descricao: 'Retorna um pedido por id',
                url: 'http://localhost:3555/pedidos/' + result[0].i_idpedidos_pedidos
            }
        }

        res.status(202).send({ message: 'Pedido retornado com sucesso', response })
    }
    catch (erro) {
        if (erro) { return res.status(500).send({ erro: erro }) }
    }
}

exports.pacthPedidos = async (req, res, next) => {
    const pedido = {
        id: req.body.id_pedido,
        id_produto: req.body.id_produto,
        quantidade: req.body.quantidade
    }

    const query = 'UPDATE pedidos SET produtos_i_idproduto_produtos = ?, i_quantidade_pedidos = ? WHERE i_idpedidos_pedidos = ?'

    try {
        const result = await mysql.execute(query, [pedido.id_produto, pedido.quantidade, pedido.id])
        if (result.affectedRows === 0) {
            return res.status(404).send({ Message: `Sua solicitação não pode ser executada , por favor verifique a sua requisição` })
        }
        const response = {
            PedidoAtualizado: {
                Id_pedido: pedido.id,
                Id_produto: pedido.id_produto,
                Quantidade: pedido.quantidade
            },
            request: {
                tipo: 'PATCH',
                descricao: 'Atualiza um pedido',
                url: 'http://localhost:3555/pedido/' + pedido.id
            }
        }

        res.status(202).send({ message: 'Pedido atualizado com sucesso', response });
    }
    catch (erro) {
        if (erro) { return res.status(500).send({ erro: erro }) }
    }
}

exports.deletePedidos = async (req, res, next) => {
    const id = req.body.id

    const query = 'DELETE FROM pedidos WHERE i_idpedidos_pedidos = ?'

    try {
        const result = await mysql.execute(query, [id])

        if (result.affectedRows === 0) {
            return res.status(404).send({ Message: `Sua solicitação não pode ser executada , por favor verifique a sua requisição` })
        }

        const response = {
            message: 'Pedido Deletado com sucesso',
            request: {
                tipo: 'POST',
                descricao: 'Insere um pedido',
                url: 'http://localhost:3555/pedidos',
                body: {
                    nome: 'String',
                    preco: 'Number'
                }
            }
        }

        res.status(202).send(response)
    }
    catch (erro) {
        if (erro) { return res.status(500).send({ erro: erro }) }
    }
}
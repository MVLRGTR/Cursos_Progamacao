const mysql = require('../src/mysql')
require('dotenv').config()

exports.getProdutos = async (req, res, next) => {
    try {
        const result = await mysql.execute('SELECT * FROM produtos')
        const response = {
            quantidade: result.length,
            produtos: result.map((elemento) => {
                var id = elemento.i_idproduto_produtos
                return {
                    id_produto: elemento.id_produto_produtos,
                    nome: elemento.s_nome_produtos,
                    preco: elemento.i_preco_produtos,
                    UrlImage: elemento.s_image_produto,
                    request: {
                        tipo: "GET",
                        descricao: 'Retornando Todos os Produtos',
                        url: process.env.URL_API + 'produtos' + id
                    }
                }
            })
        }
        res.status(201).send({ message: 'Retornando Todos os Produtos', response })
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}

exports.getProdutosQuery = async (req, res, next) => {
    let nome = ''

    if(req.query.nome){
        nome = req.query.nome
    }

    try {
        const result = await mysql.execute(`SELECT * FROM produtos WHERE categoriaId = ? AND s_nome_produtos LIKE '%${nome}%' `, [req.query.categoriaId])
        console.log(nome)
        if (result.length === 0) {
            return res.status(404).send({ Message: `Não foi encontrado nenhum produto co essa query` })
        }

        const response = {
            ProdutoRetornado: {
                Id_produto: result[0].i_idproduto_produtos,
                Nome: result[0].s_nome_produtos,
                Preco: result[0].i_preco_produtos,
                UrlImage: result[0].s_image_produto
            },
            request: {
                tipo: 'GET',
                descricao: 'Retorna um produto por id',
                url: process.env.URL_API + 'produtos' + result[0].i_idproduto_produtos
            }
        }

        res.status(201).send({ message: 'Produto retornado com sucesso', response })
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}

exports.postProdutos = async (req, res, next) => {
    const query = 'INSERT INTO produtos (s_nome_produtos ,i_preco_produtos,s_image_produto,categoriaId) VALUES (?,?,?,?)'
    try {
        const result = await mysql.execute(query, [req.body.nome, req.body.preco, req.file.path, req.body.categoria])
        const response = {
            ProdutoCriado: {
                Id_produto: result.insertId,
                Nome: req.body.nome,
                Preco: req.body.preco,
                UrlImage: req.file.path
            },
            request: {
                tipo: 'POST',
                descricao: 'Insere um produto',
                url: process.env.URL_API + 'produtos'
            }
        }

        res.status(201).send({ Message: 'Produto criado com sucesso', response })
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}

exports.getIdProdutos = async (req, res, next) => {
    const id_produto = req.params.id_produto

    try {
        const result = await mysql.execute('SELECT * FROM produtos WHERE i_idproduto_produtos = ? ', [id_produto])

        if (result.length === 0) {
            return res.status(404).send({ Message: `Não foi encontrado nenhum produto com esse ID:${id_produto}` })
        }

        const response = {
            ProdutoRetornado: {
                Id_produto: result[0].i_idproduto_produtos,
                Nome: result[0].s_nome_produtos,
                Preco: result[0].i_preco_produtos,
                UrlImage: result[0].s_image_produto
            },
            request: {
                tipo: 'GET',
                descricao: 'Retorna um produto por id',
                url: process.env.URL_API + 'produtos' + result[0].i_idproduto_produtos
            }
        }

        res.status(201).send({ message: 'Produto retornado com sucesso', response })

    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }

}

exports.patchProdutos = async (req, res, next) => {
    const produto = {
        id: req.body.id,
        nome: req.body.nome,
        preco: req.body.preco,
    }
    const query = 'UPDATE produtos SET s_nome_produtos = ? , i_preco_produtos = ? WHERE i_idproduto_produtos = ?'
    try {
        const result = await mysql.execute(query, [produto.nome, produto.preco, produto.id])

        if (result.affectedRows === 0) {
            return res.status(404).send({ Message: `Sua solicitação não pode ser executada , por favor verifique a sua requisição` })
        }

        const response = {
            ProdutoAtualizado: {
                Id_produto: result.insertId,
                Nome: produto.nome,
                Preco: produto.preco
            },
            request: {
                tipo: 'PATCH',
                descricao: 'Atualiza um produto',
                url: process.env.URL_API + 'produtos' + produto.id
            }
        }
        res.status(202).send({ message: 'Produto atualizado com sucesso', response })
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }

}

exports.deleteProdutos = async (req, res, next) => {

    const id = req.body.id

    try {
        const result = await mysql.execute('DELETE FROM produtos WHERE i_idproduto_produtos = ?', [id])

        if (result.affectedRows === 0) {
            return res.status(404).send({ Message: `Sua solicitação não pode ser executada , por favor verifique a sua requisição` })
        }

        const response = {
            message: 'Poduto Deletado com sucesso',
            request: {
                tipo: 'POST',
                descricao: 'Insere um produto',
                url: process.env.URL_API + 'produtos',
                body: {
                    nome: 'String',
                    preco: 'Number'
                }
            }
        }

        res.status(202).send(response)
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}
const mysql = require('../src/mysql')
require('dotenv').config()


exports.getCategorias = async (req, res, next) => {
    try {
        const result = await mysql.execute('SELECT * FROM categorias')
        const response = {
            quantidade: result.length,
            produtos: result.map((elemento) => {
                var id = elemento.i_idproduto_produtos
                return {
                    id_categoria: elemento.id_categoria,
                    nome: elemento.nome,
                    request: {
                        tipo: "GET",
                        descricao: 'Retornando Todas as Categorias',
                        url: process.env.URL_API + 'categorias'
                    }
                }
            })
        }
        res.status(201).send({ message: 'Retornando Todas as categoria', response })
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}

exports.postCategorias = async (req, res, next) => {
    const query = 'INSERT INTO categorias (nome) VALUES (?)'

    try {
        if (req.body.nome === undefined || req.body.nome === '') {
            return res.status(404).send({ Message: `Por favor verique sua requisição !!!` })
        }
        const result = await mysql.execute(query, [req.body.nome])
        const response = {
            CategoriaCriada: {
                Id_categoria: result.insertId,
                Nome: req.body.nome,
            },
            request: {
                tipo: 'POST',
                descricao: 'Insere uma categoria',
                url: process.env.URL_API +'categorias'
            }
        }

        res.status(201).send({ Message: 'Categoria criada com sucesso', response })
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}

exports.getIdCategoria = async (req, res, next) => {
    const id_categoria = req.params.id_categoria

    try {
        const result = await mysql.execute('SELECT * FROM categorias WHERE id_categoria = ? ', [id_categoria])

        if (result.length === 0) {
            return res.status(404).send({ Message: `Não foi encontrado nenhuma categoria com esse ID:${id_categoria}` })
        }

        const response = {
            ProdutoRetornado: {
                Id_categoria: result[0].id_categoria,
                Nome: result[0].nome,
            },
            request: {
                tipo: 'GET',
                descricao: 'Retorna uma categoria por id',
                url: process.env.URL_API + 'categoria' + result[0].id_Categoria
            }
        }

        res.status(201).send({ message: 'Categoria retornada com sucesso', response })

    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}

// exports.patchProdutos = async (req, res, next) => {
//     const produto = {
//         id: req.body.id,
//         nome: req.body.nome,
//         preco: req.body.preco,
//     }
//     const query = 'UPDATE produtos SET s_nome_produtos = ? , i_preco_produtos = ? WHERE i_idproduto_produtos = ?'
//     try {
//         const result = await mysql.execute(query, [produto.nome, produto.preco, produto.id])

//         if (result.affectedRows === 0) {
//             return res.status(404).send({ Message: `Sua solicitação não pode ser executada , por favor verifique a sua requisição` })
//         }

//         const response = {
//             ProdutoAtualizado: {
//                 Id_produto: result.insertId,
//                 Nome: produto.nome,
//                 Preco: produto.preco
//             },
//             request: {
//                 tipo: 'PATCH',
//                 descricao: 'Atualiza um produto',
//                 url: process.env.URL_API+'produtos' + produto.id
//             }
//         }
//         res.status(202).send({ message: 'Produto atualizado com sucesso', response })
//     }
//     catch (erro) {
//         return res.status(500).send({ erro: erro })
//     }

// }

exports.deleteCategoria = async(req, res, next) => {

    const nome = req.body.nome

    try {
        const result = await mysql.execute('DELETE FROM categorias WHERE nome = ?', [nome])
        
        if (result.affectedRows === 0) {
            return res.status(404).send({ Message: `Sua solicitação não pode ser executada , por favor verifique a sua requisição` })
        }

        const response = {
            message: 'Categoria Deletada com sucesso',
            request: {
                tipo: 'POST',
                descricao: 'Insere uma categoria',
                url: process.env.URL_API+'categorias',
                body: {
                    nome: 'String',
                }
            }
        }

        res.status(202).send(response)
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}
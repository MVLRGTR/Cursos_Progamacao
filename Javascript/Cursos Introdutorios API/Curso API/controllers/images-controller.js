const mysql = require('../src/mysql')
require('dotenv').config()


exports.getImages = async (req, res, next) => {
    try {
        const result = await mysql.execute('select * from images_produto')
        const response = {
            quantidade: result.length,
            Images: result.map((elemento) => {
                var id = elemento.id_image
                return {
                    id_image: elemento.id_image,
                    id_produto: elemento.id_produto,
                    UrlImage: elemento.caminho,
                    request: {
                        tipo: "GET",
                        descricao: 'Retornando Todas as Imagens',
                        caminho: process.env.URL_API + elemento.caminho
                    }
                }
            })
        }
        res.status(201).send({ message: 'Retornando Todas as imagens', response })
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}

exports.postProdutoImage = async (req, res, next) => {
    const query = 'INSERT INTO images_produto (id_produto,caminho) VALUES (?,?)'
    try {
        try{
            const url = req.file.path
        }
        catch(erro){
            return res.status(404).send({ Message: `Verifique o arquivo encaminhado !!! ` })
        }
    
        const result = await mysql.execute(query, [req.params.id_produto, req.file.path])

        
        const response = {
            Image_Inserida: {
                Id_image: result.insertId,
                Produto_id: req.params.id_produto,
                UrlImage: req.file.path
            },
            request: {
                tipo: 'GET',
                descricao: 'Mostrar Todas as imagens',
                url: process.env.URL_API + 'images'
            }
        }

        res.status(201).send({ Message: 'Image Inserida com sucesso',response })
    }
    catch(erro) {
        return res.status(500).send({ erro2: erro })
    }
}

exports.deleteProdutoImages = async (req, res, next) =>{

    const id = req.body.id
    const query ='DELETE FROM images_produto WHERE id_produto = ?'

    try {
        const result = await mysql.execute(query, [id])
        
        if (result.affectedRows === 0) {
            return res.status(404).send({ Message: `Sua solicitação não pode ser executada , por favor verifique a sua requisição` })
        }

        const response = {
            message: 'Image Deletada com sucesso',
            request: {
                tipo: 'POST',
                descricao: 'Insere uma Image',
                url: process.env.URL_API+'images',
                // body: {
                //     i: 'String',
                //     preco: 'Number'
                // }
            }
        }

        res.status(202).send(response)
    }
    catch (erro) {
        return res.status(500).send({ erro: erro })
    }
}
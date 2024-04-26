const mysql = require('../src/mysql')
const bcrypt = require('bcrypt')
const jwt = require('jsonwebtoken')

exports.postCadastro = async (req, res, next) => {

    const query = 'SELECT * FROM usuarios WHERE s_email_usuarios = ?'
    const queryc = 'INSERT INTO usuarios (s_email_usuarios,s_senha_usuarios) VALUES (?,?)'

    try {
        var result = await mysql.execute(query, [req.body.email])
        console.log('result', result)
        if (result.length > 0) {
            return res.status(409).send({ message: `O email ${req.body.email} já existe !!!` })
        }

        const senhaHash = await bcrypt.hash(req.body.senha, 10);

        result = await mysql.execute(queryc, [req.body.email, senhaHash])
        const response = {
            mesage: 'Usuario Criado com sucesso',
            usuarioCriado: {
                id_usuario: result.insertId,
                email: req.body.email
            }
        }
        return res.status(201).send({ response })
    }
    catch (erro) {
        if (erro) { return res.status(500).send({ erro: erro }) }
    }
}

exports.postlogin = async (req, res, next) => {

    const query = 'SELECT * FROM usuarios WHERE s_email_usuarios = ?'

    try {
        var result = await mysql.execute(query, [req.body.email])
        
        if (result.length < 1) {
            return res.status(401).send({ message: 'Credencias invalidas !!!' })
        }
        const comparador = await bcrypt.compare(req.body.senha, result[0].s_senha_usuarios)
        
        if (comparador) {
            let token = jwt.sign({
                id_usuario: result[0].id_usuario_usuarios,
                email: result[0].s_email_usuarios
            },
                process.env.JWT_KEY, { expiresIn: "1h" })
            
                return res.status(200).send({
                mensage: 'Autenticado com sucesso !!!',
                token: token
            })

        }
        else{
            return res.status(401).send({ message: 'Credencias invalidas !!!' })
        }
    }
    catch (erro) {
        if (erro) { return res.status(500).send({ erro: erro }) }
    }
}
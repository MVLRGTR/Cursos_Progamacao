const connection = require('./connection')

const getAll = async () =>{
    // const usuarios = await connection.execute('SELECT * FROM usuarios')
    // return usuarios[0]
    const [usuarios] = await connection.execute('SELECT * FROM usuarios')
    return usuarios
}

const CadastraUsuarios = async ({nome,email,telefone}) =>{
    // console.log(usuario)
    // const [nome,email,fone]  = usuario
    //const nome  = dados.nome
    //const email  = dados.email
    //const telefone  = dados.telefone

    const dateUTC = new Date(Date.now()).toUTCString()

    const query = 'INSERT INTO usuarios(nome,email,fone,data) VALUES(?,?,?,?)'
    const  [createUsuario] = await connection.execute(query,[nome,email,telefone,dateUTC])
    return {insertID : createUsuario.insertId}
}

const DeletaUsuario = async (id)=>{
    const query = 'DELETE FROM usuarios WHERE id = ?'
    const deletarUsuario = await connection.execute(query,[id])
    return deletarUsuario
}

const UpdateUsuario = async (id,{nome,email,telefone})=>{
    const query = 'UPDATE usuarios SET nome = ? , email = ? , fone = ? WHERE id = ?'
    const updateUsuario = await connection.execute(query,[nome,email,telefone,id])
    return updateUsuario
}

module.exports = {
    getAll,
    CadastraUsuarios,
    DeletaUsuario,
    UpdateUsuario
}




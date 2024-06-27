const { response } = require('../app')
const TaskModel = require('../models/taskModels')


const getAll = async (request,response) =>{
    const task = await TaskModel.getAll()
    return response.status(200).json(task)
}

const CadastraUsuarios = async (request,response) =>{
    const Createtask = await TaskModel.CadastraUsuarios(request.body)
    return response.status(201).json(Createtask)
}

const DeletaUsuario = async(request,response)=>{
    const {id} = request.params
    await TaskModel.DeletaUsuario(id)
    return response.status(204).json()
}

const UpdateUsuario = async(request,response)=>{
    const {id} = request.params
    await TaskModel.UpdateUsuario(id, request.body)
    return response.status(204).json()
}

module.exports={
    getAll,
    CadastraUsuarios,
    DeletaUsuario,
    UpdateUsuario
}
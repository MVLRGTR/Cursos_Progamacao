const { where } = require('sequelize')
const Task = require('../models/Task')

module.exports = class Taskcontoller {
    static createtask(req,res){
        res.render('tasks/create')
    }

    static async createtasksave(req,res){

        const task = {
            title : req.body.title,
            description : req.body.description,
            done : false
        }
        //aqui teriamos validações 
        //Processamento de dados

        await Task.create(task)

        res.redirect('/task/all')
    }

    static async showtask(req,res){

        const tasks = await Task.findAll({raw:true})

        res.render('tasks/all',{tasks})
    }

    static async deletetask(req,res){
        const id =  req.body.idtask

        await Task.destroy({where : {id:id}})

        res.redirect('/task/all')

    }

    static  async edittask(req,res){
        const id = req.params.idtask
        let check = ''

        try{
            const task = await Task.findOne({raw : true ,where : {id:id} })
            
            if(task.done===1){
                check = 'checked'
            }

            res.render('tasks/edittask',{task,check})

        }
        catch(erro){
            console.log(erro)
            return
        }

    }

    static async edittasksave(req,res){
        const id = req.body.id
        const check = req.body.done
        let donevalue = 0

        if(check === 'on'){
            donevalue = 1
        }

        const taskdata ={
            title : req.body.title,
            description : req.body.description,
            done : donevalue
        }

        await Task.update(taskdata,{where : {id:id}})

        res.redirect('/task/all')
    }

    static async donetoggle(req,res){
        const id = req.body.idtask
        let done  = 0

        const task = await Task.findOne({raw : true ,where : {id:id} })

        if(task.done === 0){
            done = 1
        }


        await Task.update({done},{where:{id:id}})

        res.redirect('/task/all')

    }
   
}
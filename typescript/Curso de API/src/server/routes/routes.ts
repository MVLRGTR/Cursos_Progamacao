import Router from 'express'
import {StatusCodes} from 'http-status-codes'
import { CidadesController } from '../controllers/controller'


const router =  Router() //Isso aqui faz com eu consiga definir rotas separadamente e passar o router dentro do meu servidor 


router.get('/', (req, res) => {
    return res.send('Olá , DEV !')
})

router.post('/cidades',CidadesController.createValidation, CidadesController.create)


export {router} 
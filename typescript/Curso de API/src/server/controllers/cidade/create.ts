import { Request, Response, RequestHandler } from "express"
import { StatusCodes } from "http-status-codes"
import * as yup from 'yup'
import { validation } from "../../shared/middlewares/validations"

interface ICidade {
    nome: string,
    estado: string,
}
interface Ifilter {
    filter?: string
}


export const createValidation = validation((getSchema) => ({
    body: getSchema<ICidade>(yup.object().shape({
        nome: yup.string().required().min(3),
        estado: yup.string().required().min(3)
    })),
    query: getSchema<Ifilter>(yup.object().shape({
        filter: yup.string().required().min(3)
    }))
}))


export const create: RequestHandler = async (req, res) => { //PASSO A INTERFACE TIPANDO ELA JÁ NA REQUISIÇÃO COM O BODY

    console.log(req.body)

    return res.send('Create funcionando !')
}
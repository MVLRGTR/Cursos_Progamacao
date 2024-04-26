import { RequestHandler } from "express"
import * as yup from 'yup'

type Tproperty = 'body' | 'header' | 'params' | 'query'
type Tgetschema = <T>(schema : yup.Schema<T>)=> yup.Schema<any>
type TallSchemas = Record<Tproperty, yup.Schema<any>>
type TgetAllSchemas = (getschema:Tgetschema) => Partial<TallSchemas>
type Tvalidation = (getAllschemas : TgetAllSchemas) => RequestHandler




export const validation: Tvalidation = (getAllschemas) => async (req, res, next) => {
    const schemas = getAllschemas(schema => schema)
    const errosResult :Record<string,Record<string,string>> ={} 

    Object.entries(schemas).forEach(([key, schema]) => {
        try {
            schema.validateSync(req[key as Tproperty], { abortEarly: false })
            // return next()
        }
        catch (err) {
            const yupErro = err as yup.ValidationError
            const ValidationErrors: Record<string, string> = {}

            yupErro.inner.forEach(error => {
                if (error.path === undefined) return
                ValidationErrors[error.path] = error.message
            })
            errosResult[key] = ValidationErrors
        }
    })

    if(Object.entries(errosResult).length === 0){
        return next()
    }
    else{
        return res.status(400).json({erros:errosResult})
    }

}

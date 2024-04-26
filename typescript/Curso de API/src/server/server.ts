import express from 'express'
import { router } from './routes/routes'
import 'dotenv/config' 
import './shared/services/translationsYup' //chamo no inicio do servidor as traduções do yup mas que no momento não está funcionando

const server = express()
server.use(express.json())  //aqui eu informo para meu servidor trabalha com json , acredito que se aplica também para os outros tipos de dados , na verdade esse comando precisa ser passado em rotas
server.use(router)  // a estrutura antiga serve.get , serve.post para cada endpoint , agora eu tenho o router que faz isso , definindo separadamente cada endpoint



export { server }

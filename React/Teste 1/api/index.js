import dotenv from 'dotenv'
dotenv.config()
console.log('PORTA:', process.env.PORTA);

import express from "express"
import cors from "cors"
import useRoutes from './routes/usuarios.js'

const app = express() //Aqui, você está chamando a função express() para criar uma instância do aplicativo Express. Esta instância é usada para configurar e controlar o seu servidor web.
app.use(express.json())// Este comando registra um middleware para o aplicativo Express. O middleware express.json() é usado para fazer o parsing do corpo das requisições HTTP com formato JSON. Isso permite que você acesse os dados enviados no corpo das requisições POST, PUT, PATCH, etc., em formato JSON.
app.use(cors())//Este comando registra outro middleware para o aplicativo Express. O pacote cors é usado para lidar com solicitações Cross-Origin Resource Sharing (CORS). CORS é um mecanismo de segurança que controla o acesso a recursos de um domínio diferente. Este middleware configura as políticas CORS no seu servidor para permitir solicitações de diferentes origens.
app.use("/",useRoutes)
app.listen(8800)//Finalmente, este comando inicia o servidor Express na porta 8800. O método listen() informa ao servidor para escutar por conexões HTTP na porta especificada (neste caso, a porta 8800). Quando um cliente faz uma requisição para o seu servidor na porta especificada, o Express irá rotear essa requisição para a rota correta, de acordo com as configurações que você definiu.


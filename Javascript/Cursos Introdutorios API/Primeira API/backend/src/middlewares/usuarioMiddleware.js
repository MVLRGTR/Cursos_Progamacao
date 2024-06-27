const validatebody = (request,response,next)=>{
    const {body} = request;

    if(body.nome === undefined || body.email === undefined || body.telefone === undefined){
        return response.status(400).json({message:'Erro por indefinição de variáveis'})
    }

    if(body.nome === '' || body.email === ''|| body.telefone === ''){
        return response.status(400).json({message:'Nenhum dos valores pode ser vazio'})
    }

    next()
}

module.exports={
    validatebody,
}
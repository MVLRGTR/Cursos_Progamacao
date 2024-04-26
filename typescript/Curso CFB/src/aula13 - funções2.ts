//conceito que já apliquei na aula anterior, de valores defaulte para entrada de parametros em funções
//a interrogação me diz que posso ter um retorno undefined

function novoUser(user:string,pass:string,nome?:string):void{
    console.log(`User : ${user}`)
    console.log(`Pass : ${pass}`)
    console.log(`Nome : ${nome}`)
}


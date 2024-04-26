let amigo1 = {nome:'Lucas',
sexo:'m',
peso:94.5,
falar(somar_peso = 0){
    this.peso += somar_peso
    if(somar_peso>0){
        console.log(`${this.nome} engordou ${somar_peso}kg `)
    }
    else if(somar_peso<0){
        console.log(`${this.nome} emagreceu ${somar_peso}kg `)
    }
    else{
        console.log(`${this.nome} continua com o mesmo peso`)
    }
}
}

amigo1.falar(-15)

console.log(`${amigo1.nome} tem o atual peso de ${amigo1.peso}kg`)
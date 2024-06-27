function soma(n1=0,n2=0){ //Caso não seja passado nenhum valor o progama entende 0 como o padrão e não gera um erro na função
    return n1+n2
}
console.log(soma(10,18))


function add(v){ // Esse função modifica uma variavél que está do lado de fora dela
    valor+=v
}

let valor = 0
console.log(valor)

add(10)
console.log(valor)

add(15)
console.log(valor)
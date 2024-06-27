
// function soma(...valores){
//     tamanhovet = valores.length
//     res = 0

//     for(let i = 0 ; i < tamanhovet ; i++){
//         res+=valores[i]
//     }
//     return res
// }

function soma(...valores){
    let res = 0 

    for (i of valores){
        res+=i
    }
    
    return res
}

console.log(soma(2,3,4,5,6,8,7,9))

//Esse tipo de estrutura me permite somar variados valores com a mesma função e também deixar em aberto a quantidade de valores 
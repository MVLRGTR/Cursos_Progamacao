const lista = [
    {
        nome : 'Jose',
        idade : 13
    },
    {
        nome : 'Carlos',
        idade : 15
    },
    {
        nome : 'Maria',
        idade : 17
    },
    {
        nome : 'Vanessa',
        idade : 18
    },
    {
        nome : 'Gabriela',
        idade : 19
    },
    {
        nome : 'Andre',
        idade : 21
    },
    {
        nome : 'Gustavo',
        idade : 23
    }
]

// for(let i = 0 ; i < lista.length ; i++){
//     console.log(lista[i])
// }

// lista.forEach((obj) => console.log(obj))

let soma = 0

const somaIdade = (obj) =>{
    soma +=obj.idade
}

lista.forEach(somaIdade)

console.log("Soma idades Arrays : ",soma)

//diferente do map o forEach não retorna nada ele simplesmente faz uma alteração no array atual.
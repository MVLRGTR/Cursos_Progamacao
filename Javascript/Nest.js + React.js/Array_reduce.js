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
    },
    {
        nome : 'Flavio',
        idade : 38
    },
    {
        nome : 'Amanda',
        idade : 27
    },
    {
        nome : 'Casagrande',
        idade : 37
    }
]

const pessoa = {
    jose : {
        idade: 54
    },
    joao: {
        idade: 65
    },
    maria: {
        idade: 23
    }
}

// const pessoas = lista.reduce((acc,objeto) =>{
//     return {
//         ...acc,
//         [objeto.nome] : {
//             idade: objeto.idade
//         }
//     }
// } ,{})

const funcReduce = (acc,objeto) =>{
    return {
        ...acc,
        [objeto.nome] : {
            idade: objeto.idade
        }
    }
}

const pessoas = lista.reduce(funcReduce,{
    julio :{
        idade : 60
    }
})


console.log(pessoas)


//o reduce tem um acumulador e o objeto propriamente dito , a cada passagem do reduce eu adiciono o acumulador que começa com {} 
//e monto a minha estrutura igual a const pessoa acima 
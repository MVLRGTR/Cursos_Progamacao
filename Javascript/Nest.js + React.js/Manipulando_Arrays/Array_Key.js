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

const funcReduce = (acc,objeto) =>{
    return {
        ...acc,
        [objeto.nome] : {
            idade: objeto.idade
        }
    }
}


// console.log(Object.keys(lista[0]))

const pessoas = lista.reduce(funcReduce,{})

const keys = Object.keys(pessoas)

const listaDeVolta = keys.map((key) => ({nome  : key , idade : pessoas[key].idade}))

console.log(pessoas)
console.log(keys)
console.log(listaDeVolta)

//o key serve para agente fazer a manipulação dos objetos pela key própriamente dita 
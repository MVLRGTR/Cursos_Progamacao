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
    },
    {
        nome : 'Carla',
        idade : 60
    }
]

const resultadoSome = lista.some((obj) => obj.idade > 50)
const resultadoEvery = lista.every((obj) => obj.idade < 70)

console.log(resultadoSome)
console.log(resultadoEvery)

//o some funciona como um teste boleano que caso um componente da minha lista seja true ele retorna true e finaliza o processo 
//o evry funciona também com um teste boleano , mas todos na lista tem que ser true para ele dar o retorno true , caso um elemento não obedeça a condição ele retorna falso
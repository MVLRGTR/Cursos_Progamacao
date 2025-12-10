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
    }
]

// const converteObjeto = (objeto) => {
//     return objeto.nome;
// }

// const converteObjeto = (objeto) => {
//     return {
//         nome : objeto.nome,
//         idade : objeto.idade,
//         nomeIdade:`${objeto.nome} com idade de ${objeto.idade}`
//     }
// }

const converteObjeto = (objeto) => {
    return {
       ...objeto, // aqui eu coloco todas as informações anteriores mas a linha de baixo no array
        nomeIdade:`${objeto.nome} com idade de ${objeto.idade}`
    }
}

console.log(lista.map(converteObjeto));

//o map converte um array em outro filtrado com as condições , ou seja ele não altera o array original mas cria uma cópia transformada
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

const NovasPessoas = lista.find((pessoa) => pessoa.idade > 18)

console.log(NovasPessoas)

//diferente do filter o find fazbusca o primeiro com a condição e reetorna.
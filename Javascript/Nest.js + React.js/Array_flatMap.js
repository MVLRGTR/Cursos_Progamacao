const lista = [
    {
        nome : 'Jose',
        idade : 13,
        cartoes : ['3214' , '8569']
    },
    {
        nome : 'Carlos',
        idade : 15,
        cartoes : ['3274' , '8548']
    },
    {
        nome : 'Maria',
        idade : 17,
        cartoes : ['3214' , '8569']
    },
    {
        nome : 'Vanessa',
        idade : 18,
        cartoes : ['3896' , '8525']
    },
    {
        nome : 'Gabriela',
        idade : 19,
        cartoes : ['3475' , '8789']
    },
    {
        nome : 'Andre',
        idade : 21,
        cartoes : ['3745' , '8947']
    },
    {
        nome : 'Gustavo',
        idade : 23,
        cartoes : ['3454' , '8129']
    },
    {
        nome : 'Flavio',
        idade : 38,
        cartoes : ['3214' , '8569']
    },
    {
        nome : 'Amanda',
        idade : 27,
        cartoes : ['3214' , '8569']
    },
    {
        nome : 'Casagrande',
        idade : 37,
        cartoes : ['3974' , '8769']
    }
]

const lcartoes = lista.map((cartao) => cartao.cartoes)
console.log(lcartoes)

const flatCartoes = lista.flatMap((cartao) => cartao.cartoes)
console.log(flatCartoes)

//na implementação com o map eu tenho um array de array de cartões , e para não ter esse resultado eu utilizo o flatMap que vai me retornar somente um array com todos os cartões
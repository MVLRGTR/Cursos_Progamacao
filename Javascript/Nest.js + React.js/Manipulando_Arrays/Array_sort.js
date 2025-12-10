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

lista.sort((a,b)=>{
    if(a.idade < b.idade){
        return -1
    }else if(a.idade > b.idade){
        return 1;
    }
    return 0;
})

console.log(lista)

lista.sort((a,b) => {
    if(a.nome.toUpperCase() < b.nome.toUpperCase()){
        return -1
    }else if(a.nome.toUpperCase() > b.nome.toUpperCase()){
        return 1
    }
    return 0
})

console.log("Lista organizada por nome : ", lista)

//o sort é utilizado para fazer a ordenação dos arrays sendo que o -1 representa que o elemento tem que vir antes do outra e a logica inversa para 1
//o sort modifica a lista atual 
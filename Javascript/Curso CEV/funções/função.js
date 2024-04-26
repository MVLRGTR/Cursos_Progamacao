function n_par_ou_impar(numero){
    if(numero%2==0){
        return 'numero par'
    }
    else{
        return 'numero impar'
    }
}

num = 26

console.log(`${num} é um `,n_par_ou_impar(num))
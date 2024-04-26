let n = 0
let max = 11
impares = 0

// while(n<max){
//     console.log(n)
//     n++
//     if(n>10){
//         break
//     }
// }
// console.log('Fim do Progama')


//O ocmando Break ele faz sair diretamente do bloco do progama , enquanto o continue pula uma instrução como veremos abaixo ,ou seja no nosso caso quando o continue é encontrado ele para de executar todo o código abaixo dele e volta pata o topo do bloco pulando a interação atual

for(let i = 0 ; i < max ; i++){
    if(i%2===0){
        continue
        //aqui eu testo se o número é par , e caso ele seja o progama não executa impares++ e o que está baixo e vai para a proxima iteração do código no nosso loop for
    }
    
    impares++
    if(console.log(i)){
        console.log(i)
    }
}

console.log('Numeros pares na coleção '+impares)

//em resumo o break interrompe o loop e o continue pula para a próxima iteração
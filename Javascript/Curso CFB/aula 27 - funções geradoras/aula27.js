// nesse tipo de função cada vez que ela é chamada ao encontrar o yield a função retorna o que ela processou até aquele momento , e a outra vez que ela for chamada ela vai retornar a proxima iteração da função , podemos dizer que aqui se trata do inicio de progamação assincrona com javascript

// function* cores(){
//     yield 'Vermelho'
//     yield 'Verde'
//     yield 'Azul'
//     yield 'Branco'
// }
// const iteracao=cores()
// console.log(iteracao.next().value)
// console.log(iteracao.next().value)
// console.log(iteracao.next().value)
// console.log(iteracao.next().value)

function* perguntas(){
    const nome = yield "Qual o seu nome ?"
    const idade = yield "Qual a sua idade ?"
    const esporte = yield "Qual seu esporte favorito ?"
    return 'Seu nome é '+nome+' e a sua idade é '+idade+' e seu esporte favorito é '+esporte
}


const itp = perguntas()
console.log(itp.next().value)
console.log(itp.next('Fabio').value)
console.log(itp.next('29').value)
console.log(itp.next('Corrida').value)



function* gerador(){
    let n = 0
    while(true){
        yield n++
    }
}
const iterador = gerador()
for(let i = 0 ; i<=10 ;i++){
    console.log(iterador.next().value)
}
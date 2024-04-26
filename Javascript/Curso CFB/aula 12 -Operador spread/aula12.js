// let n1 = [10,20,30,40,55]
// let n2 = [11,22,33,44,55,66,77,88,99,111]
// let n3 = [n1,n2] // nesse comando eu simplesmente copio um array dentro do outro
// console.log('n1: '+n1)
// console.log('n2: '+n2)
// console.log('n3: '+n3)

const jogador1 = {nome:'Bruno' , energia:100 , vidas:3,magia:150}
const jogador2 = {nome:'Mario' , energia:100 , vidas:5,velocidade:80}
// const jogador3 = {jogador1,jogador2} //com esse comando eu junto apenas od dados do jogador um e dois no terceiro.
const jogador3 = {...jogador1,...jogador2}//Nesse caso eu estou concatenando as informações de jogador 1 2 em tres

console.log(jogador3)

//Outra grande utilização do operador spread e quando tenho dentro de um array valores que serão passados para um função exemplo abaixo :

const soma=(v1,v2,v3) =>{
    return v1+v2+v3
}
let valores=[1,5,4,5]
console.log(soma(...valores))//Mesmo que eu tenha mais valores no array ele sempre vai pegar no nosso caso os valores somente desjados para a função


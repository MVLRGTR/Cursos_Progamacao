var vagas = [1, 2, 3, 4, 5, 6, 7]
console.log(`Nosso vetor é ${vagas}`)

vagas[7] = 11 /*Se a posição informada não existir ele adiona esse posição juntamente com o seu valor*/

console.log(`Nosso vetor agora é ${vagas}`)

vagas.push(89) /*Metodo interno para adicionar o valor no final do vetor */
console.log(`O tamnho do nosso vetor é  ${vagas.length} posições`)   /*Retorna o tamanho do vetor */
vagas.sort()  /*Coloca todos os valores em ordem crescente */

console.log(`Noso vetor arrumando é ${vagas}`)

for (var i = 0; i < vagas.length; i++) {
    console.log(`A posição ${i + 1} do nosso vetor é ${vagas[i]}`)
}

p=vagas.indexOf(89)  /*Me mostra em que posição está o número 7 e caso ele não exista no vetor o valor -1 será retornado */
console.log(p+1)
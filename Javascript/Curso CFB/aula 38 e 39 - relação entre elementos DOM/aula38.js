const caixa1 = document.querySelector('#caixa1')
const cursos = [...document.querySelectorAll(".curso")]
const c1_2 = document.querySelector('#c1_2')

// console.log(caixa1.children[0])
// console.log(caixa1.children)
// console.log(caixa1.firstElementChild)
// console.log(caixa1.lastElementChild)
// console.log(document.getRootNode())

// console.log(caixa1.hasChildNodes())
// if(cursos[0].children.length > 0){
//     console.log('Possui filhos')
// }
// else{
//     console.log('Não possui filhos')
// }
// console.log(caixa1.firstElementChild.innerHTML='Teste de mudança com metodo inner')

console.log(c1_2.parentNode.parentNode.parentNode.children[4])
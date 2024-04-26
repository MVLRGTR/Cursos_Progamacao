let num = [10,20,30,40,50,60,70,80,90]

for(let i = 0 ; i < num.length ; i ++){
    console.log(num[i])
}

//For tipo in que tem o mesmo efeito do for acima , ou seja o n assume a posição de cada elemento do array num

for(n in num){
    console.log(n)
}

//For tipo in igual o de cima só que agora eu faço com ele imprima o elemento de cada posição do array

for(n in num){
    console.log(num[n])
}

console.log('Fim dos for in \n')

//For tipo off onde o mesmo ja assume diretamente o valor dos elementos para serem impressos

for(n of num){
    console.log(n)
}


//-----------------------------------------------------------------------------------------------------------------

// const objetos = document.getElementsByTagName('p')
// // for(n of objetos){
// //     n.innerHTML = 'Curso'
// // }

// for(n in objetos){
//     objetos[n].innerHTML = 'Curso '+(++n)
// }
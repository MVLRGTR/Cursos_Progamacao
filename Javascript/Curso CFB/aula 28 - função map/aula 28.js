//utilizamos o map prioritariamente para poder percorrer coleções , pois ele percorrer a coleção por completo , diferentemente do for que é mais utilizado para percorrer coleções até determinado ponto
//map(elemento , indice, array de operação) os trés parametros é a sua propria representação

// const cursos = ['HTML' , 'CSS' , 'Javascript' ,'C++' ,'C#' , 'Python' ,'PHP']

// cursos.map((elemento ,indice)=>{
//     indice+=1
//     console.log('O elemento em questão e '+elemento+' e a sua posição é '+indice)
// })


// let div = cursos.map((elemento ,indice)=>{
//     return "<div>"+elemento+"</div>"
// })
// console.log(div)

//------------------------------------------------------------------------------------------------------------------------------------------------------------------

let elementos = document.getElementsByTagName('div') //Para eu poder iterar sobre o array crio uma função variavel let e abaixo faço oi spread desse array
elementos=[...elementos] //AQUI COMO JÁ FOI DITO CRIO O SPREAD DENTRO DE UM ARRAY PARA PODER MANIPULAR OS ELEMENTOS DENTRO DELE

elementos.map((elementos,indice)=>{
    console.log(elementos.innerHTML+' Sua posição no vetor é '+indice)
    
})
 
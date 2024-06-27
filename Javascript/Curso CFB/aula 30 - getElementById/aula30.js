// const dc1 = document.getElementById('c1')
// console.log(dc1)
// console.log(dc1.id)
// console.log(dc1.innerHTML)
// dc1.innerHTML ='CFB Cursos modififcado'

const divs = document.querySelectorAll('div')
const divarray = [...divs]
console.log(divarray)
for ( n of divarray){
    console.log(n.innerHTML='CFB Cursos')
}

//Fazendo a mesma função do for so que com  a função map

divarray.map((elemento)=>{
    elemento.innerHTML = 'CFB Cursos com a função MAP'
})

//----------------------------------------------


//Obtendo elementos através id dos mesmo
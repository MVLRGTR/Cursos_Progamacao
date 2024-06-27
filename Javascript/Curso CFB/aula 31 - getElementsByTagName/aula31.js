//Diferente do getelementbyid que somento retorna o elemento HTML enquanto o getelementbytagname retorna uma coleção de elemetnos HTML

const dc1=document.getElementById('c1')
const dc2=document.getElementById('c2')
const dc3=document.getElementById('c3')
const dc4=document.getElementById('c4')
const dc5=document.getElementById('c5')
const dc6=document.getElementById('c6')

const arrayElementos = [dc1,dc2,dc3,dc4,dc5,dc6]
//const colecaoHTML = document.getElementsByTagName
const colecaoHTML = [...document.getElementsByTagName('div')]//Aqui eu transformo o HTMLColletion em array possibilitando muitos mais metedos para eu poder trabalha

console.log(arrayElementos) //Temos aqui um retorno array
console.log(colecaoHTML)    //Aqui temos o retorno coleção sendo um HTMLColletion que foi tranformado em um array

//Quando usamos array temos todos o metodos de array (map,slice e etc) enquando no HTML Colletion temos muito menos funções, por isso é indicado a conversão para Array 



colecaoHTML.map((elemento)=>{
    console.log(elemento)
})
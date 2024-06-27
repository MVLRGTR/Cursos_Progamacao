// //Posso Faze o addEventListener de duas formas , uma e diretamente no HTML com o onclick na propria tag ou armazenando essa tag em uma variavel e escutar a mesma para isso conforme o exemplo abaixo
// const elementoclick = document.querySelector('#c1')

// elementoclick.addEventListener('click',alerta =(elemento)=>{
//     // console.log(elemento.target)//aqui eu pego exatamento o elemento que disparou o evento , nesse caso não faz diferença pois eu coloquei em elemento click somente  c1
//     // alert('você clicou aqui')

//     const elemento_tag = elemento.target
//     elemento_tag.classList.add('destaque')

// })



const elementosclick = [...document.querySelectorAll('.curso')]

elementosclick.map((element)=>{
    element.addEventListener('click',alerta=()=>{
        element.classList.add('destaque')
        console.log(element.innerHTML+' foi clicado')
    })
})//Aqui eu fico escutando qual elemento vai ser clicado e quando isso acontece eu troco as cores dele utilizando classlist ,vale lembrar que aqui eu estou trabalhando com array , diferente doi exemplo feito acima que precisa ser usado ainda alguns passos para se chegar na tag em si
const  caixa1 = document.querySelector('#caixa1')
const c1 = document.querySelector('#c1')
const curso = [...document.querySelectorAll('.curso')]  //aqui aplico o metodo spread do proprio java script

// caixa1.addEventListener('click',()=>{console.log('clicou')})
//No cenario atual caso eu clique em qualquer div o envento será acionado , funciona parecido como uma bolha onde a div caixa1 propaga o envento para todas as divs abaixo , de forma simples , caso eu clique no html ou no css e assim por diante ele disparar o evento click mesmo que a tag não tenha sido progamada.


caixa1.addEventListener('click',(evt)=>{
    console.log(evt.target)       //o target me diz quem disparou o evento
})

cursos.map((elemento)=>{          //Aqui pego todos os cursos e adiciono o stop neles todos de uma vez só
    elemento.addEventListener('click',(evt)=>{
        evt.stopPropagation()
    })
})

c1.addEventListener('click',(evt)=>{
    evt.stopPropagation()           //esse comando faz com que pare a propagação que vem da div caixa quando eu clico nesse componente
})
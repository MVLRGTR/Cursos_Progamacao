const caixa1 = document.querySelector('#caixa1')
const caixa2 = document.querySelector('#caixa2')
const btn = document.querySelector('#btn')
const btnr = document.querySelector('#btnr')
const cursos = [...document.querySelectorAll('.curso')]


cursos.map((elemento)=>{
    elemento.addEventListener('click',alerta =()=>{
        elemento.classList.toggle('destaque')//Esse metodo é executado da seguinte maneira , se o elemento tiver a classe ele remove e caso ele não tenha ele adiciona , ou seja é um liga e desliga a cada vez que é acionado
    })
})

const copiar =()=>{
    const destaqueElemento = [...document.querySelectorAll('.destaque')]
    destaqueElemento.map((elementoadicao)=>{
        caixa2.appendChild(elementoadicao)
    })
}

const remover = () =>{
    const destaqueElemento = [...document.querySelectorAll('.destaque')]
    destaqueElemento.map((elemeremocao)=>{
        caixa1.appendChild(elemeremocao)
    })
}

btn.addEventListener('click',copiar)
btnr.addEventListener('click',remover)

//Dentro do querySelectorAll também posso usar a seguinte sintaxe ...('.curso:not(.destaque)') seleciono somente a classe curso que não tem a classe destaque
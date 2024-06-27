function adicionar(){
    let d1 = document.getElementById('d1')
    let d2 = document.getElementById('d2')
    let d3 = document.getElementById('d3')
    let d4 = document.getElementById('d4')

    d1.innerHTML = "CFB Curso 1"
    d2.innerHTML = "CFB Curso 2"
    d3.innerHTML = "CFB Curso 3"
    d4.innerHTML = "CFB Curso 4"
}

botao = document.getElementById('mud')

botao.addEventListener('click',adicionar)


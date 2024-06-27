//  function aluno(nome,nota){
//     this.nome=nome
//     this.nota=nota
//     //o this nesse caso faz com que eu consiga trabalhar a variavel nome dentro da minha função para receber um valor da variavel nome sem precisar que elas tenham nomes diferentes
//     console.log('o nome do aluno é '+nome+' e sua nota é '+nota)
// }
// aluno('Marcos',100)
// aqui mostrando o usso basico do this que se da para ter o mesmo nome de variavel dentro uma função


function aluno(nome,nota){
    this.nome = nome
    this.nota = nota

    this.dados_anonimo=function(){
        setTimeout(function(){
            this.nome = 'x'
            this.nota = 50
            console.log(this.nome)
            console.log(this.nota)
        },2000)
        // se olharmos com calma iremos perceber que a função timeout criou outra instancia do this para a função setTimout , impossibilitando nos acessarmos o primeiro this.nome e nota
    }


    this.dados_arrow=function(){
        setTimeout(()=>{
            console.log(this.nome)
            console.log(this.nota)
        },2000)
        // Para contornar esse problema usamos uma arrow function que faz agora refenrencia a variavel correta no caso o primeiro this
        //Ele usa no caso o contexto lexico do root que é a função aluno e não tomando como base a função setTimout
    }
}

const aluno1 = new  aluno('Marcos',100)
aluno1.dados_anonimo()
aluno1.dados_arrow()
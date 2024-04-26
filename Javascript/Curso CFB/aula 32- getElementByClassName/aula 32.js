// da mesma maneira que a tag apendida anteiormente ele tras um retorno HTMLColletion e é interessante a conversão para array
//Outra coisa aprendida nessa aula também foi a questão do curso1 e curso c1 onde que no segunto modelo posso chamar no apenas .curso sem colocar o c1  e quando quiser uma configuração especifica .curso c1 ou apenas .c1 e como se indntificacemos duas classes
//const todoscursos=document.getElementsByClassName('curso')

const todoscursos=[...document.getElementsByClassName('curso')]
const cursoc1=[...document.getElementsByClassName('c1')]
const cursoc2=[...document.getElementsByClassName('c2')]
const cursoEspecial = document.getElementsByClassName('curso')[9]//Utilizo isso quando quero pegar somente um elemento da minha classe

console.log(todoscursos)
console.log(cursoc1)
console.log(cursoc2)

todoscursos.map((elemento)=>{
    elemento.classList.add('destaque') //aqui eu adiciona e sobreponho a classe em detrimento da classe destaque que tenho o !important na sua composição
})



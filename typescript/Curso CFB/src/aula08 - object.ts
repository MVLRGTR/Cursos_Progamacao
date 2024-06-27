/*Esse tipo de dado é muito util quando estamos trabalhando com funções pois ao inves de passar cada variavel separadamente eu passo tudo junto em dados por exemplo */

let dados={
    nome:'Douglas Nascimento',
    idade:25,
    status:'Ativo',
    ola:()=>{
        console.log('oi pessoal')
    },
    info:(pessoa:string)=>{
        console.log('A pessoa selecionada foi '+pessoa)
    }
}

console.log(typeof(dados))
console.log(dados)
console.log(dados.nome)
console.log(dados.status)

/*Nesse formato consigo operar somente o dado escolhido */

dados.nome = 'Joilson'

console.log(dados.nome)
dados.ola()
dados.info('Carlos Alberto')
dados.info(dados.nome)
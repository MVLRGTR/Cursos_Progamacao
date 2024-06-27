console.log(process.argv)

const args = process.argv.slice(2) //separar o terceiro argumento
const argsidade = process.argv.slice(3) //seperao a idade seguindo a mesma logica anterior 

console.log(args)
console.log(argsidade)

const nome = args[0].split('=')[1] //Dividir a string aonde tem o igual e depois pego o indice 1 aonde fica o nome
const idade = argsidade[0].split('=')[1]

console.log('Nome :', nome)
console.log('Idade :',idade)
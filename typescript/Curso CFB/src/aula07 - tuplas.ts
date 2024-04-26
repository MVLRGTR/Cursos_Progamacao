/*Diferentemente do exemplo da aula anterior as tuplas eu trabalho com tipos de dados diferentes , mas agora eu preciso especificar cada posição e o tipo de dado */
/*No caso abaixo eu obrigatoriamente preciso ter um par de dado com string e number e somente isso , caso eu precise de mais dados eu terei que adicionar na criação da tupla */
let coisas:[string,number,boolean]=['Bruno',22,true]
coisas[1]=56
coisas.push('Carlos',38,false)/*Apesar de conseguir adicionar a tupla esse valor eu não consigo acessalo atraves do seu indice pois a tuplo so tem 3 espaços */
console.log(coisas)


let coisa2:readonly[string,number,boolean]=['Nolasco',33,false]
console.log(coisa2)/*Todos os metodos para coisas2 deixaram de existir porque transformei ele em uma variavel apenas de leitura */

/*let numeros:string|number [] Aqui so posso ter valores number ou string mas não os dois juntos */

let numeros:(String|number)[] =[20,30,40,50,'BrunoCFB']
numeros.push(10)
numeros.unshift(22)
console.log(numeros)

/*Readonly array e um vetor travado aonde não é possivel inserir ou retirar valores do mesmo após sua criação , somente a leitura*/

let numeros_ro:ReadonlyArray<number>=[100,200,300,400]
console.log(numeros_ro)

/*Também posso utilizar o redonly em qualquer variavel em typescript e torna ela somente uma variavel de leitura */
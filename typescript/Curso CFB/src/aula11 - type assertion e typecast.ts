let nvalor:number
let svalor:string
let uvalor:unknown

uvalor=10
//  nvalor=uvalor não consigo fazer essa associação de forma direta de um valor unknown para number , para isso isso tenho que usar o type assertion
//  pode parecer estranho mas é verdade ,svalor é entendido como um valor number e não string , ou seja tomando o tipo number do unknown
//  o typeassertion serve apenas para variavel unknown e também não pode ser entendido como uma conversão de tipo
//  Isso aqui não representa uma conversão de tipo da variavél em questão
nvalor = <number>uvalor
svalor = <string>uvalor
svalor+=10

console.log(typeof(uvalor))
console.log(uvalor)

console.log(typeof(nvalor))
console.log(nvalor)

console.log(typeof(svalor))
console.log(svalor)

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------
//aqui eu demostro que svalor recebe o tipo de variavel do uvalor que é number 
svalor = <string>uvalor
svalor+=10

console.log('O tipo de svalor é:'+typeof(svalor))
console.log(svalor)

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Para de fato fazer uma conversão tenho que chamar o metodo Number.parseInt para isso

nvalor = Number.parseInt(svalor)
console.log('O tipo da variavél nvalor é: '+typeof(nvalor)+' e os eu valor é : '+nvalor)

//Para fazer de forma ao contrario também é possivel
svalor = nvalor.toString()//Por ser um valor number ele ja tem o metodo number integrado
console.log('o valor que svalor recebeu da conversão nvalor é :'+svalor+' e o seu tipo é :'+typeof(svalor))
const x = 10
const y = 'Jõao'
const z = [1,2]

console.log(x,y,z)

//contagem de impressões
console.count(`o valor de x é:${x}, contagem`)
console.count(`o valor de x é:${x}, contagem`)
console.count(`o valor de x é:${x}, contagem`)
console.count(`o valor de x é:${x}, contagem`)
console.count(`o valor de x é:${x}, contagem`)

//variavel entre string , interpolação
console.log('O nome dele %s ,e ele é progamador',y)

//Função que é executada após um tempo
setTimeout(()=>{
    console.log('Clear')
},4000)
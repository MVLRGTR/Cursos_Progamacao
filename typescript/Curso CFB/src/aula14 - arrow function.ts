//Uma coisa importante é que uma arrow function não pode ser chamada antes da sua criação diferente de uma função comun criada com o function
//sempre que o código e compilado ele eleva a function , fazendo assim a possibilidade de eu chamar ela antes da sua 'criação'
// teste()
// function teste():void{
//     console.log('teste')
// }

const teste=(txt?:string):void=>{
    console.log(txt)

}
teste('Curso de typescript')
teste('Curso de React')

const soma2=(n11:number,n22:number):number=>{
    return n11+n22
}
console.log(soma2(22,33))


//-----------------------------------------------------------------------------------------------------------------------------------------------------------
const somaarray=(n1:number[]):number=>{
    let n:number=0
    let resarray:number=0

    for(n of n1){
        resarray+=n
    }
    return resarray
}
console.log(somaarray([2,3,4,5,6]))

//-----------------------------------------------------------------------------------------------------------------------------------------------------------
//O código acima agora com o foreach e função de callback
//o for each vai fazer com que a cada passagem elemento assuma um valor do array n1
const fsomaarray=(n1:number[]):number=>{
    let n:number=0

    n1.forEach((elementos)=>{
        n+=elementos
    })

    return n
}

console.log(`função com foreach :${fsomaarray([2,3,4,5,6])}`)








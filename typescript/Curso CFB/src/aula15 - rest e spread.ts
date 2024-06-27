// o parametro rest para que eu possa somar avalores variados de entrada em uma função

function fsoma(...n:number[]):number{
    let resultado:number = 0
    n.forEach((elemento)=>{
        resultado+=elemento
    })
    
    return resultado
}

console.log(fsoma(2,3,4,5,6))
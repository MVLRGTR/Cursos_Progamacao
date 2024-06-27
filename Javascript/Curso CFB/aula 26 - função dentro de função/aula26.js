// const soma = (...valores) =>{
//     let res = 0

//     for(i of valores){
//         res+=i
//     }
    
//     return res
// }
// console.log(soma(1,2,3,4,5,6,7,8,9,1,0,1,12))

const soma=(...valores)=>{
    
    const somar=val=>{
        let resultado = 0
        for(i of val){
            resultado+=i
        }
        return resultado
    }

    return somar(valores)
}


console.log(soma(2,3,5,6,7,8,15,10))
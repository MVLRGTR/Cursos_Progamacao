// const f = function(v1,v2){
//     return v1+v2
// }

// console.log(f(5,6))

//Esse tipo de função só ocupa um local na memoria quando ela é chamada , tornando assim o progama mais leve

const f2 = new Function('v1','v2', 'return v1 + v2')
console.log(f2(100,150))

//Permanace com o mesmo conceito anterior so que temos uma simplificação da propria função construtor

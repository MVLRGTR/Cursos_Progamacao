// let num = 11
// let res = num%2
// if(res==0){
//     console.log('O numero '+num+' é par')
// }
// else{
//     console.log('O numero '+num+' é impar')
// } código tradicional sem o operador ternario

let num = 11
res = (!(num%2) ? "Par" :"Impar")
console.log(res)
//No operador ternario temos 0 = false e 1 = verdadeira ou seja sendo verdeiro o primeiro valor depois da interrogação ira aparecer
//No caso acima como o resto será igual a zero será necessario negar a operação para que ela se torne verdaderira

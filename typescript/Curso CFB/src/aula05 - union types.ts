/*O union types permite um variavel ter mais de um tipo de valor , exemplo string e number ao mesmo tempo ou caso eu não queria especificar posso utilizzar o any */
let vteste:string|number
vteste='Bruno'


let cursos = ['Javascript','Typescripr','C++',2024]
let valores=[10,23,25]

cursos.push('Arduino')
valores.push(555)

console.log(cursos)
console.log(valores)
console.log(vteste)

vteste=2024

console.log(vteste)
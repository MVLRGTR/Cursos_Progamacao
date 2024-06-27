const div_query = document.querySelector('div')//Neste metodo retornamos a primeira tag encontrada digita entre parentese
const div_quey_all = document.querySelectorAll('div')//Neste metodo retornando todas as divs só que no modelo NodeList que é um padrão mais antigo , podendo também ser transformado em um array
const todoscursosquery = document.querySelectorAll('.curso')//Tem a mesma função do .ByclassName 
const div_e_p = document.querySelectorAll('div,p')//O query me permite ser abrangente e misturar classe com tags e buscar todos as informações em um unico array , claro depois de convertido
const divcomclass = document.querySelectorAll('div[class]')//Aqui seleciono somente as divs que tem o atributo class
const divcompdentro = document.querySelectorAll('div > p')//Aqui seleciono todas as divs que tem a tag p dentro


console.log(div_query)
console.log(div_quey_all)
console.log(todoscursosquery)
console.log(div_e_p)
console.log(divcomclass)
console.log(divcompdentro)




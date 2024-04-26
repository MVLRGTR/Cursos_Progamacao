// No operador em questão temos a operação em binario and de dois valores
//1010
//1011
//1010 -> 1º 1 e 1 = 1  ||  2º 0 e 0 = 0  || 3º 1 e 1 = 1  || 4º 0 e 1 = 0
let n1 = 10
let n2 = 11
let res = n1 & n2
console.log(res)

//No operador em questão temos a operação binaria or de dois valores
//1010
//1011
//1011 -> 1º 1 e 1 = 1  ||  2º 0 e 0 = 0  || 3º 1 e 1 = 1  || 4º 0 e 1 = 1
let n3 = 10
let n4 = 11
let res2 = n3 | n4
console.log(res2)

//Pode se entender isso com a tabela verdade das operações and e or

//No operador em questão temos a operação binaria or exclusiva de dois valores
//1010
//1011
//1011 -> 1º 1 e 1 = 0  ||  2º 0 e 0 = 0  || 3º 1 e 1 = 0  || 4º 0 e 1 = 1
n3 = 10
n4 = 11
res2 = n3 ^ n4
console.log(res2)


//No operador em questão temos a operação de deslocamento de bits que pode ser para esqueda ou direito , depende do sentido da seta
//Muito utilizado para reduzir valores pela metade ou dobrar os mesmos
//Quando faço a operação em betwise em 1 para esqueda eu dobro o valor e ao contrario se aplica para a direita
n1 = 10
res = n1 << 1
console.log(res)

n1 = 50
res = n1 >> 1
console.log(res)

//lembrando que a entrada e feita em decimal convertida em binario e as osperações são feitas nessa base e depois é convertida novamente para decimal 
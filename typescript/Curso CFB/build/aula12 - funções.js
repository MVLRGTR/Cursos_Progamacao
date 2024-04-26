"use strict";
function logar(user, password) {
    console.log(`User  : ${user}\nSenha : ${password}`);
}
logar('caio', '12345');
function soma(n1 = 0, n2 = 0) {
    let resultado = 0;
    resultado = n1 + n2;
    return resultado;
}
console.log(soma(10, 20));

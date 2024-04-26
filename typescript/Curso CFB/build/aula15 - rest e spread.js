"use strict";
function fsoma(...n) {
    let resultado = 0;
    n.forEach((elemento) => {
        resultado += elemento;
    });
    return resultado;
}
console.log(fsoma(2, 3, 4, 5, 6));

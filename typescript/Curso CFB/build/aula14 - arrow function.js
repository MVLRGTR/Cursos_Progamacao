"use strict";
const teste = (txt) => {
    console.log(txt);
};
teste('Curso de typescript');
teste('Curso de React');
const soma2 = (n11, n22) => {
    return n11 + n22;
};
console.log(soma2(22, 33));
const somaarray = (n1) => {
    let n = 0;
    let resarray = 0;
    for (n of n1) {
        resarray += n;
    }
    return resarray;
};
console.log(somaarray([2, 3, 4, 5, 6]));
const fsomaarray = (n1) => {
    let n = 0;
    n1.forEach((elementos) => {
        n += elementos;
    });
    return n;
};
console.log(`função com foreach :${fsomaarray([2, 3, 4, 5, 6])}`);

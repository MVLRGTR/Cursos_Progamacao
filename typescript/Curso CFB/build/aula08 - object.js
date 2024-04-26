"use strict";
let dados = {
    nome: 'Douglas Nascimento',
    idade: 25,
    status: 'Ativo',
    ola: () => {
        console.log('oi pessoal');
    },
    info: (pessoa) => {
        console.log('A pessoa selecionada foi ' + pessoa);
    }
};
console.log(typeof (dados));
console.log(dados);
console.log(dados.nome);
console.log(dados.status);
dados.nome = 'Joilson';
console.log(dados.nome);
dados.ola();
dados.info('Carlos Alberto');
dados.info(dados.nome);

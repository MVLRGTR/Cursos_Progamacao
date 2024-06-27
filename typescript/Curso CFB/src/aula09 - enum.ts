/*Conjuntoi de dados que são classificados a par de dados string ou numericos */

enum dias{
    domingo=0,
    segundafeira=1,
    terca=2,
    quarta=3,
    quinta=4,
    sexta=5,
    sabado=6
}

console.log(dias.domingo) /*Aqui ele me trás o retorno do valor do dia */
console.log(dias['domingo'])
console.log(dias[1])

const d = new Date()
console.log('O dia do mês hoje é '+d.getDate())
console.log('O dia da semana hoje é '+dias[d.getDay()])

/*Enumerador com texto ----------------------------------------------------------*/

enum cores{
    branco = '#fff',
    preto = '#000',
    vermelho = '#f00',
    verde = '#0f0',
    azul = '#00f'
}

console.log(cores.branco)
console.log(cores['branco'])


/*O proprio enum faz a contagem automatica começando em zero se nada for informado */
/*Além disso eu consigo criar variaveis do tipo como tipoUsuario------------------- */
/*Isso me traz uma segurança maior pois limita os tipos de valores que serão aceito por essa varivel  */

enum tipoUsuario{
    USER,
    ADMIN,
    SUPERUSER
}

console.log('Tipo de Usario logado :'+tipoUsuario.SUPERUSER)
console.log('Tipo de Usario logado :'+tipoUsuario[2])

const tp:tipoUsuario = 0 //ou pode se fazer dessa maneira const tp:tipoUsuario = tipoUsuario.SUPER
console.log(tp)

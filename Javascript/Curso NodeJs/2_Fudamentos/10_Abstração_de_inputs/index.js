const inquirer = require ('inquirer')

inquirer.prompt([{
    name : 'p1', message : 'A qual a primeira Nota ? '
},{
    name : 'p2' , message : 'Qual a segunda Nota ? '
}]).then((answers)=>{
    console.log(answers)
    const media = (parseInt(answers.p1) + parseInt(answers.p2))/2
    console.log(`A média é ${media}`)
}).catch(erro => console.log(erro)) 



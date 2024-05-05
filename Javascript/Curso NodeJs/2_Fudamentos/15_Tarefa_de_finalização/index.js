import inquirer from 'inquirer'
import chalk from 'chalk'

inquirer.prompt([{
    name: 'nome' ,message : 'Qual o seu nome ? '
},{
    name: 'idade' ,message : 'Qual a sua idade ? '
}]).then((answers)=>{
    const idade = parseInt(answers.idade)
    if(!Number.isInteger(idade)){
        throw new Error('O valor para idade não é inteiro')
    }
    console.log(chalk.bgYellow.black.bold(`O seu nome é ${answers.nome} e a sua idade é ${answers.idade}`))
}).catch(erro => console.log(erro))
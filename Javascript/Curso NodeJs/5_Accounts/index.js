//Modulos externos
import inquirer from "inquirer"
import chalk from 'chalk'

//modulos internos
import fs from 'fs'
import { error, log } from "console"

operation()

function operation() {
    inquirer.prompt([
        {
            type: 'list',
            name: 'action',
            message: 'O que você deseja fazer ?',
            choices: [
                'Criar Conta',
                'Consultar Saldo',
                'Depositar',
                'Sacar',
                'Sair'
            ]
        }
    ]).then((answer) => {
        const opcao = answer['action']

        if (opcao === 'Criar Conta') {
            criarconta()
        } else if (opcao === 'Depositar') {
            deposito()
        } else if (opcao === 'Consultar Saldo') {
            consultarsaldo()
        } else if (opcao === 'Sacar') {
            sacardinheiro()
        } else {
            console.log(chalk.bgBlue.black('Muito Obrigado por usar Accounts'))
            process.exit()
        }
    }
    ).catch((erro) => console.log(erro))

}

function contaexiste(nomeconta) {
    return fs.existsSync(`contas/${nomeconta}.json`)
}

function criarconta() {
    console.log(chalk.bgGreen.black('Parabéns por escolher nosso banco !'))
    console.log(chalk.green('Defina s opções da sua conta abaixo'))
    buildconta()
}

function buildconta() {
    inquirer.prompt([{
        name: 'conta', message: 'Qual o nome para sua conta:'
    }
    ]).then(answer => {

        const nomeconta = answer['conta']
        console.info(nomeconta)

        if (!fs.existsSync('contas')) {
            fs.mkdirSync('contas')
        }

        if (contaexiste(nomeconta)) {
            console.log(chalk.bgRed.black('Está conta já existe , escolha outro nome !!!'))       
            return buildconta()
        }

        fs.writeFileSync(`contas/${nomeconta}.json`, '{"saldo":0}',
            function (erro) {
                console.log(erro)
            }
        )

        console.log(chalk.green('Parabéns , conta criada com sucesso !!!'))
        operation()

    }).catch(erro => console.log(erro))
}

function deposito() {
    inquirer.prompt([
        { name: 'conta', message: 'Qual o nome da conta para deposito :' }
    ]).then(answer => {

        const conta = answer['conta']

        if (!contaexiste(conta)) {
            console.log(chalk.bgRed.black('Está conta não existe !!!'))
            return deposito()
        } else {
            inquirer.prompt([
                { name: 'saldo', message: 'Digite o Saldo que deseja adicionar a sua conta :' }
            ]).then(answer => {

                builddeposito(conta, answer['saldo'])

            }).catch(erro => console.log(erro))
        }

    }).catch(erro => console.log(erro))
}

function builddeposito(nomeconta, montante) {

    const conta = getconta(nomeconta)
    const saldoatual = parseFloat(conta.saldo)
    const saldosoma = saldoatual + parseFloat(montante)

    console.log('montante', montante)

    if (montante === null || montante === '') {
        console.log(chalk.bgRed.black('Ocorreu um erro ao processar sua solicitação'))
        return operation()
    }

    fs.writeFileSync(`contas/${nomeconta}.json`, `{"saldo":${saldosoma}}`,
        function (erro) {
            console.log(erro)
        }
    )
    console.log(chalk.bgGreen.black('Parabéns seu deposito foi feito'))
    return operation()
}

function getconta(nomeconta) {
    const conta = fs.readFileSync(`contas/${nomeconta}.json`, {
        encoding: 'utf-8',
        flag: 'r'
    })

    return JSON.parse(conta)
}

function consultarsaldo() {
    inquirer.prompt([
        { name: 'conta', message: 'Qual conta deseja consultar o saldo :' }
    ]).then((answer) => {
        if (contaexiste(answer['conta'])) {
            const conta = getconta(answer['conta'])
            console.log(chalk.bgBlue.black(`O saldo da sua conta ${answer['conta']} é R$ : ${conta.saldo}`))
            return operation()
        }
        else {
            console.log(chalk.bgRed.black('Está conta não existe  !!!'))
            return operation()
        }
    }).catch(erro => console.log(erro))
}

function sacardinheiro() {
    inquirer.prompt([
        { name: 'conta', message: 'Digite o nome da conta :' }
    ]).then((answer) => {

        const contasaque = answer['conta']

        if (contaexiste(contasaque)) {
            inquirer.prompt([
                { name: 'valor', message: 'Digite o Valor que deseja sacar :' }
            ]).then((answer) => {
                getsacardinheiro(contasaque,answer['valor'])
            }).catch(erro => console.log(erro))
        } 
        
        else {
            console.log(chalk.bgRed.black('Está conta não existe  !!!'))
            return operation()
        }
    }).catch(erro => console.log(erro))
}

function getsacardinheiro(conta, montante) {
    const contasaque = getconta(conta)
    const saldoatual = parseFloat(contasaque.saldo)
    const saldosoma = saldoatual - parseFloat(montante)

    if (montante === null || montante === '') {
        console.log(chalk.bgRed.black('Ocorreu um erro ao processar sua solicitação'))
        return operation()
    }
     console.log(conta)

    if (contasaque.saldo >= montante) {
        fs.writeFileSync(`contas/${conta}.json`, `{"saldo":${saldosoma}}`,
            function (erro) {
                console.log(erro)
            }
        )
        console.log(chalk.bgGreen.black('Parabéns seu saque foi feito'))
        return operation()
    }else{
        console.log(chalk.bgRed.black('Você Não tem saldo suficiente para realizar esse saque !!!'))
        return operation()
    }

}
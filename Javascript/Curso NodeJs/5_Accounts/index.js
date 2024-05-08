//Modulos externos
import inquirer from "inquirer"
import chalk from 'chalk'

//modulos internos
import fs from 'fs'
import { log } from "console"

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

        } else if (opcao === 'Sacar') {

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
            buildconta()
            return
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
            deposito()
            return
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
        operation()
        return
    }

    fs.writeFileSync(`contas/${nomeconta}.json`, `{"saldo":${saldosoma}}`,
        function (erro) {
            console.log(erro)
        }
    )
    console.log(chalk.bgGreen.black('Parabéns seu saldo foi atualizado'))
    operation()
    return
}

function getconta(nomeconta) {
    const conta = fs.readFileSync(`contas/${nomeconta}.json`, {
        encoding: 'utf-8',
        flag: 'r'
    })

    return JSON.parse(conta)
}
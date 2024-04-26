#nome = str(input('digite seu nome :'))
#if nome == 'Guanabara':
#    print('seu nome e bem bonito !!')
#
#elif nome == 'Paula' or nome == 'Joana'  or nome == 'Maria':
#    print('seu nome e bem comum !!')
#
#elif nome in 'Ana Clara Jessica Juliana':
#    print('belo nome feminino!!!!')
#
#else:
#    print('seu nome e normal')
#
#print('\ntenha um bom dia {}'.format(nome))

#v1 = float(input('digite um valor :'))
#v2 = float(input('digite outro valor :'))
#if v1 > v2 :
#    print('o valor um e maior que o segundo')
#elif v2 > v1:
#    print('o segundo valor e maior que o primeiro')
#elif v1==v2:
#    print('os valores são iguais')

#idade = int(input('Digite a sua idade :'))
#if idade < 18 :
#    print ('voce ainda passara pelo alistamento militar , falta apenas {} anos'.format(18 - idade))
#elif idade == 18 :
#    print('voce esta no periodo de alistamento militar procure o batalhao mais proximo !!!')
#elif idade > 18 :
#    print('voce passou do tempo de alistamento militar {} anos'.format(idade - 18))

#casa = float(input('Digite o valor da casa ao qual deseja comprar :'))
#salario = float(input('Digite o seu salaraio :'))
#tempo = int(input('Digite em quanto tempo deseja quitar a casa em meses:'))
#parcela = casa/tempo
#print('\na parcela sera de {}'.format(parcela))
#if salario*0.3 >= parcela:
#    print('o emprestimo sera concedido !!!!!!')
#else:
#    print('o emprestimo não sera concedido pois compromete mais de 30% de sua renda !!!')

#n1 = float(input('Digite a 1º nota :'))
#n2 = float(input('Digite a 2º nota :'))
#media = (n1+n2)/2
#if media < 5:
#    print('infelizmente voce foi reprovado ')
#elif media > 5 and media < 6.9:
#    print('voce foi para recuperação ')
#else:
#    print('voce foi aprovado !!!!!')

#idade = int(input('digite a sua idade :'))
#if idade <= 9 :
#    print('voce participa da categoria MIRIM')
#elif idade <= 14 :
#    print('voce participa da categoria INFANTIL')
#elif idade <= 19 :
#    print('voce participa da categoria JUNIOR')
#elif idade <= 20 :
#    print('voce participa da categoria SENIOR')
#elif idade > 20 :
#    print('voce participa da categoria MASTER')


#r1 = int(input('Digite o 1º segmento de reta :'))
#r2 = int(input('Digite o 2º segmento de reta :'))
#r3 = int(input('Digite o 3º segmento de reta :'))
#if r1 < r2 + r3 and r2 < r1 + r3 and r3 <r1 + r2:
#    if r1 == r2  == r3:
#        print('os segmetos acima podemm forma um triangulo do tipo equilatero:')
#    elif r1 == r2 or r2 == r3 or r1 == r3:
#        print('os segmetos acima podemm forma um triangulo do tipo isoseles:')
#    else:
#        print('os segmetos acima podemm forma um triangulo escaleno :')
#else:
#    print('os segmentos não podem formar um triangulo')


#peso = float(input('Digite o seu peso :'))
#altura = float(input('Digite sua altura :'))
#a = 0
#imc = peso / (altura**2)
#if imc < 18.5:
#    print('Voce está abaixo o peso !!!')
#    a = 1
#elif imc >=  18.5 and imc <= 25:
#    print('peso ideal')
#elif imc >= 25 and imc <= 30:
#    print('Voce está com um sobre peso')
#    a = 1
#elif imc >= 30 and imc <= 40:
#    print('Voce está com obesidade')
#    a=1
#else:
#    print('Voce está com obesidade morbida !!!')
#    a = 1
#if a == 1:
#    print('Seu peso ideal seria {:.2f} e {:.2f}'.format(18.5*altura**2,25*altura**2))

#v1 = float(input('Digite o valor do produto :'))
#forma = str(input('Digite a forma de pagamento D - dinheiro // C - Cheque // D - Debito // 2 - 2x no cartão // 3 - 3x ou mais no cartão : '))
#if forma == 'd' or forma == 'c':
#    print('O valor a ser pago sera de {:.2f}'.format((90/100)*v1))
#elif forma == 'd':
#    print('O valor a ser pago será de {:.2f}'.format((95/100)*v1))
#elif forma == '2':
#    print('O valor a ser pago será de {:.2f}'.format(v1))
#elif forma == '3':
#    print('O valor a ser pago será de {:.2f}'.format((120/100)*v1))
#else:
#    print('VOCE DIGITOU UMA OPERAÇÃO INVALIDA !!!!!!')

import random
print('Bem Vindo Ao JOKENPO \n\n')
escolha = int(input('Digite 1 - para pedra // 2 - papel // 3 - tesoura :'))
escolham = random.randint(1,3)

if escolha == 1:
    if escolham == 1:
        print('Foi empate')
    elif escolham == 2:
        print('Voce perdeu !!!')
    elif escolham == 3:
        print('Voce ganhou !!!')

elif escolha == 2:
    if escolham == 1:
        print('Voce ganhou !!!')
    elif escolham == 2:
        print('Foi empate !!!')
    elif escolham == 3:
        print('Voce perdeu!!!')

elif escolha == 3:
    if escolham == 1:
        print('Voce perdeu !!!')
    elif escolham == 2:
        print('Voce ganhou !!!')
    elif escolham == 3:
        print('Foi empate !!!')

print('\na escolha do computador foi {}'.format(escolham))


'''
from math import pi
print(pi)
while True:
    casa_decimais = int(input('Digite o número de casas decimais que deseja ver :'))
    if casa_decimais > 15:
        print('Digite um numero de casas decimais menor ou igual a 15  !!!\n')
    else:
        break
print(round(pi,casa_decimais))

def digitos_numeros(num,decimal):
    for i in range(0,decimal):
        num = num * 0.1
    return round(num,decimal)
numero = float(input('Digite um numero :'))
while True:
    decimal = int(input('Me informe a quantidade casa decimais que deseja ver :'))
    if decimal <= 15:
        break
    else:
        print('Digite uma quantidade menor ou igual a 15 para ver as casas decimais !!!')
print(digitos_numeros(numero,decimal))

num = int(input('Digite um numero ate aonde quer ver a sequencia fibbonaci:'))
a = 1
b = 1
r = 0
for i in range(0,num-1):
    if r == 0:
        print(0)
    a = b
    b = r
    r = a + b
    print(r)

lista_divisores = []
def numeroprimo(num):
    numero_primo = True
    if num == 1:
        return numero_primo
    else:
        for i in range(2,num):
            if num%i == 0:
                numero_primo = False
                lista_divisores.append(i)
        return numero_primo 
numero = int(input('Digite um número para descobrir se ele é primo ou não:'))
if numeroprimo(numero) == True:
    print(f'O número {numero} é Primo!!!')
else:
    print(f'\nO número {numero} não é Primo!!!')
    print(f'Seus Divisores são {lista_divisores}')


i=0
d='p'
def numeroprimo(num):
    numero_primo = True
    if num == 1:
        return numero_primo  
    else:
        for i in range(2,num):
            if num%i == 0:
                numero_primo = False
        return numero_primo 
while True:
    i+=1
    if numeroprimo(i) == True:
        print(f'O número {i} é primo!!!')
        d = input('Digite enter para ver o proximo número primo ou s coisa para sair:')
    if d == 's':
        break
    
a = float(input('Insira a altura  :'))
l = float(input('Insira a largura :'))
preco = float(input('Insira o preço do metro quadrado da telha :'))
print(f'O preço da no projeto em questão é R${(a*l)*preco}')

 
valor = float(input('Digite o valor do troco para calcularmos a quantidade de notas :'))
if valor//100 >= 0:
    print('A quantidade de notas de R$100 é :',valor//100)
    valor = valor%100
if valor//50 >= 0 :
    print('A quantidade de notas de R$50 é:',valor//50)
    valor= valor%50
if valor//20 >= 0 :
    print('A quantidade de notas de R$20 é:',valor//20)
    valor= valor%20
if valor//10 >= 0 :
    print('A quantidade de notas de R$10 é:',valor//10)
    valor= valor%10
if valor//5 >= 0 :
    print('A quantidade de notas de R$5 é:',valor//5)
    valor= valor%5
if valor//2 >= 0 :
    print('A quantidade de notas de R$2 é:',valor//2)
    valor= valor%2
if valor//1 >= 0 :
    print('A quantidade de notaas de R$1 é:',valor//1)
    valor= valor%1
if valor//0.50 >= 0 :
    print('A quantidade de moedas de R$0.50 é:',valor//0.50)
    valor= valor%0.50
if valor//0.25 >= 0 :
    print('A quantidade de moedas de R$0.25 é:',valor//0.25)
    valor= valor%0.25
if valor//0.10 >= 0 :
    print('A quantidade de moedas de R$0.10 é:',valor//0.10)
    valor= valor%0.10
if valor//0.05 >= 0 :
    print('A quantidade de moedas de R$0.05 é:',valor//0.05)
    valor= valor%0.05

notas = [100,50,20,10,5,2]
moedas = [0.50,0.25,0.10,0.05]
def quantidade_notas(valor):
    for i in notas:
        print(f'A quantidade de notas de R$ {i   } é :{valor//i:.0f}')
        valor = valor % i
    print('\n')
    for j in moedas:
        print(f'A quantidade de moedas R$ {j   } é {valor//j:.0f}')
        valor = valor % j
quantidade_notas(float(input('Digite um valor para saber a quantidade de notas e moedas para dar o troco :')))

import functools as f
def binario_decimal(num):
    num = [int(i) for i in str(num)]
    j = len(num) - 1
    decimal = 0
    for i in num:
        decimal = decimal + i*(2**j)
        j = j - 1
    return decimal
def decimal_binario(num):
    valor = []
    bin = []
    binario = 0
    while True:
        valor.append(num%2)
        num = num//2
        if num == 0:
            break 
    for i in range(0,len(valor)):
        bin.append(valor[len(valor)-1-i])
    return f.reduce(lambda x,y : x*10+y,bin)
print(decimal_binario(100))
print(binario_decimal(1100100))
'''
def teste():
    print('Entrando em teste :')
    return 0
d = ''
while True:
    print('Estamos aqui')
    decisao1 = input('Digite s ou n:')
    while True:
        d = input('Digite alguma coisa:')
        if d == '1':
            print(1)
        elif d == '2':
            print(2)
        elif d == '3':
            teste()
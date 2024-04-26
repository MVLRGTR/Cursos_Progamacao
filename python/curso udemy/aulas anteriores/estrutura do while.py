#x = 's'
#v2 = 0
#while x == 's':
#    v1 = int(input('Digite um valor :'))
#    v2 = v1 +v2
#    x = str(input('Deseja continuar digite s :'))
#print(v2)

#import random
#v1 = 0
#v2 = 1
#contador = 0
#while v1 != v2 :
#    v1 = int(input('\nTente adivinhar o numero que o computador sorteou :'))
#    v2 = random.randint(0,10)
#    contador += 1
#    print('o numero escolhido pelo computador foi {}'.format(v2))
#print('Voce acertou o numero sorteado pelo computador e precisou de {} tentativas'.format(contador))

#x=0
#while x != 5:
#    v1 = float(input('Digite o 1º valor:'))
#    v2 = float(input('Digite o 2º valor:'))
#    print('\n')
#    print('\n[1] para somar os dois valores')
#    print('[2] para subtrair os dois valores')
#    print('[3] para multiplicar os dois valores')
#    print('[4] para dividir os dois valores')
#    print('[5] para sair do progama')
#    x = int(input('Digite a opção desejada :'))
#    if x == 1:
#        print('o resultado da operação e {} '.format(v1+v2))
#    if x == 2:
#        print('o resultado da operação e {} '.format(v1-v2))
#    if x == 3:
#        print('o resultado da operação e {} '.format(v1*v2))
#    if x == 4:
#        print('o resultado da operação e {} '.format(v1/v2))

#x = int(input('digite o valor para obter seu fatorial :'))
#v = x
#fat = 1
#while v > 0:
#    fat*= v
#    v = v-1
#print(fat)

#x = int(input('Digite um numero para obter seu fatorial :'))
#v = x
#fat = 1
#for v in range (v , 0 , -1 ):
#    fat = fat * v
#print(fat)

#p = int(input('Digite o primeiro termo da PA :'))
#r = int(input('Digite a razão da PA :'))
#termo = p
#cont = 0
#total = 0
#mais = 10
#while mais != 0:
#    total =total + mais
#    while cont <=total:
#        print(termo)
#        termo = termo + r
#        cont+=1
#    mais = int(input('Digite quantos numeroa a mais voce quer mostrar dessa PA :'))


#print('             Bem vindo a sequencia fibonaci !!!!!!')
#contador = int(input('Digite um numero para ver a sequencia fibonaci :'))
#t1 = 0
#t2 = 1
#t3 = 0
#for i in range (0, contador):
#    t3 = t1 + t2
#    t1 = t2
#    t2 = t3
#    print(t3)

#soma = 0
#v1 = 0
#contador = 0
#while v1 != 999:
#    v1 = float(input('Digite qualquer valor  ou 999 para sair:'))
#    soma = soma + v1
#    contador += 1
#print('A soma entre os numeros digitados e :{}'.format(soma-999))
#print('A quantidade de numeros digitados foi : {}'.format(contador))

#contador = 0
#soma = 0
#d=''
#while d != 'n':
#    valor = float(input('Digite sum valor :'))
#    soma = soma + valor
#    contador+=1
#    d = str(input('Deseja somar mais um valor S/N :'))
#print('a media entre os numeros foi : {:.2f}'.format(soma/contador))
#print('A quantidade de numeros digitados foi : {}'.format(contador))


#maior = 0
#menor = 0
#soma = 0
#contador = 0
#d =''
#while d != 'n':
#    v1 = float(input('Digite um numero :'))
#    soma = soma + v1
#    if contador == 0:
#        menor = v1
#        maior = v1
#
#    if soma > maior:
#        maior = v1
#    if soma < menor:
#        menor = v1
#    contador+=1
#    d = str(input('Deseja adicionar mais um numero S/N :'))
#print('\nO maior numero digitado foi : {}'.format(maior))
#print('O menor numero digitado foi : {}'.format(menor))
#print('A media entre eles e  : {}'.format(soma/contador))
#print('A quantidade de numeros digitados foi : {}'.format(contador))

#soma = 0
#contador = 0
#v = 0
#while True:
#    v = int(input('Digite um numero :'))
#    if v == 999:
#        break
#    soma+=v
#    contador =contador + 1
#print(f'a quantidade de numeros digitados foi {contador}')
#print(f'a soma entre os numeros digitados e : {soma}')


#while True:
#    x = int(input('Digite um numero para obter sua taboada :'))
#    if x < 0:
#        break
#    for i in range (0 , 11):
#         print(f'{x} x {i} ={x*i}')

#import random
#escolha = ''
#contador = 0
#escolhac = 0
#while True:
#    v1 = int(input('\nDigite um valor de 0 a 10 :'))
#    escolha = str(input('Escolha par ou impar P/I :'))
#
#    vc = random.randint(0,10)
#
#    if (v1+ vc)%2 == 0:
#        if escolha == 'p':
#            print(f'Voce venceu o computador escolheu {vc}')
#            break
#        else:
#            print(f'voce perdeu o computador escolheu {vc}')
#            contador += 1
#
#    else:
#        if escolha == 'i':
#            print(f'Voce venceu o computador escolheu {vc}')
#            break
#        else:
#            print(f'Voce perdeu o computador escolheu {vc}')
#            contador += 1
#print(f'voce perdeu {contador} vezes consecultivas')

#mais18 = 0
#homens = 0
#mulher20 = 0
#while True:
#    nome = str(input('\nDigite seu nome :'))
#    sexo = str(input('Digite seu sexo M/F :'))
#    idade = int(input('Digite sua idade :'))
#
#    if idade > 18:
#        mais18+=1
#    if sexo =='m':
#        homens+=1
#    if sexo == 'f' and idade < 20 :
#        mulher20+=1
#
#    d = str(input('Deseja cadastrar mais uma pessoa S/N :'))
#    if d == 'n':
#        break
#print(f'\no numero de pessoas com mais de 18 anos é {mais18}')
#print(f'O numero de homens cadastrados foi {homens}')
#print(f'O numero de mulheres com menos de 20 anos foi {mulher20}')

#maiscaro =''
#maiscarop = 0
#total = 0
#mais1000 = 0
#while True:
#    nome = str(input('\nDigite o nome do produto :'))
#    preco = float(input('Digite o valor do produto :'))
#    total+=preco
#    if preco > 1000:
#         mais1000+=1
#
#
#    if preco > maiscarop:
#        maiscarop = preco
#        maiscaro = nome
#    d = str(input('Digite S/N para continuar :'))
#    if d == 'n':
#        break
#print(f'\nO valor total da compra e de {total}')
#print(f'O preco do produlto mais caro foi {maiscaro.upper()} e seu preço foi R${maiscarop}')
#print(f'produltos acima de R$1000,00 foram {mais1000}')

#pessoas =[]
#x=''
#while 'joao' not in pessoas:
#   x=str(input('Digite um nome :'))
#   pessoas.append(x)
#   print(pessoas)

#ate =50
#x=0
#while x < ate :
#    x+=1
#    if x%2 ==1:
#        continue
#    if x%2 == 0:
#        print(x,'e par')

c50 = float()
c20 = float()
c10 = float()
c1 = float()
resto = 0
valor = float(input('Digite o valor a ser retirado :'))
if valor >= 50:
    c50 = valor // 50
   resto = valor % 50
if resto >= 20:
    c20 = resto // 20
    resto = resto % 20
if valor >= 10:
    c10 = resto // 10
    resto = resto % 10
if resto >= 1:
    c1 = resto // 1
print(f'A quantidade de notas de R$50 e {c50:.0f}')
print(f'A quantidade de notas de R$20 e {c20:.0f}')
print(f'A quantidade de notas de R$10 e {c10:.0f}')
print(f'A quantidade de moedas de R$1 e {c1:.0f}')












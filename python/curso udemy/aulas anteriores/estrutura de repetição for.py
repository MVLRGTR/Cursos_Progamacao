#import time
#for i in range (10 , -1 , -1):
#    print('Faltam {} segundos '.format(i))
#    time.sleep(1)

#import time
#for i in range(2,51,2):
#    print(i)
#    time.sleep(0.4)

#import time
#soma = 0
#numeros = 0
#for i in range (1,501,2):
#    if i % 3 == 0:
#        soma += i
#        numeros += 1
#print('A soma entre todos os numeros entre 1 e 500 e {}'.format(soma))
#print('A quantidade de numeros solicitados foi {}'.format(numeros))

#v1 = int(input('Digite um numero para obter sua taboada :'))
#for i in range (1,11):
#    print('{} * {} e {}'.format(v1 , i , v1*i))

#soma = 0
#for i in range (0,6):
#    vi = int(input('Digite um valor : '))
#    if vi % 2 == 0:
#        soma += vi
#print('A soma entre todos os valores pares é {}'.format(soma))

#x = int(input('Digite um numero :'))
#a = 0
#for i in range (x-1 , 1 ,  -1):
#     if x % i == 0 :
#         a = 1
#         print('o numero {} e divisivel por {}'.format(x,i))
#if a == 0:
#         print('O numero é primo')
#else:
#         print('portanto o  numero não é primo')

#maioridade = 0
#for i in range(0,7):
#    ni = str(input('Digite seu nome :'))
#    idadei=int(input('Digite sua idade'))
#    if idadei >=21:
#        maioridade+=1
#print(' na lista fornecida existe {} que ja atigiram a maioridade '.format(maioridade))

#frase = str(input('Digite uma Frase :')).strip().upper()
#somador = 0
#palavra = frase.split()
#junto = ''.join(palavra)
#t = len(junto)
#for i in range (0,t):
#   if junto[(t-1)-i] == junto[(t-t)+i]:
#       somador+=1
#if somador == t:
#    print('a frase e um polindromo')
#else:
#    print('a frase não é um polindromo')

#maior = 0
#menor = 0
#a = 0
#for i in range(0,5):
#    xi = float(input('Digite seu peso :'))
#    if xi > maior:
#        maior = xi
#    if i == 0:
#        menor = xi
#    if xi < menor:
#        menor = xi
#print('O maior peso digitado foi {} e o menor foi {}'.format(maior,menor))


#n={'kos1':1,'kos2':2,'kos3':3}
#for (key,number) in n.items():
#    print(key,':',number)
#
#d=[[1,2,3],[3,4,5],[5,6,7]]
#for [u,i,a] in d:
#    print(u,i,a)



mediaidade = 0
maisvelho = 0
mulher20 = 0
for i in range(0,4):
    print('--------------{}ºPESSOA---------------'.format(i+1))
    nome = str(input('Digite seu nome :')).strip().lower()
    idade = int(input('Digite sua idade :'))
    sexo = str(input('Digite o seu sexo F - feminino e M - masculino : ')).lower()
    mediaidade += idade
    if idade > maisvelho and sexo == 'm':
        maisvelho = idade
        nomemaisvelho = nome
    if sexo == 'f' and idade < 20:
        mulher20+=1
    print('\n')
print('A media de idade do grupo e de {}'.format(mediaidade/4))
print('O homen mais velho tem {} anos e nome dele é {}'.format(maisvelho,nomemaisvelho))
print('A quantidade de mulheres com menos de 20 anos e {}'.format(mulher20))

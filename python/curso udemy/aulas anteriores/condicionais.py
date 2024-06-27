#tempo = int(input('quantos anos seu carro tem :'))
#if tempo <= 3:
#    print('Seu carro ainda da pro gasto !!!')
#else:
#    print('seu carro esta velhinho')


#import random
#x = random.randint(0,5)
#y = int(input('Digite um numero de 0 a 5 para o sorteio :'))
#if x==y:
#    print('Voce acertou o numero sorteado , PARABENS !!!!')
#else:
#    print('Voce não acertou o numero sorteado , tente outra vez !!!')
#    print('o numero sorteado foi', x)


#velocidade = float(input('Digite a velocidade do carro :'))
#if velocidade > 80:
#    print('Voce rebeu uma multa por passar pelo radar a {}km/h , o valor da multa e de {}'.format(velocidade,(velocidade-80)*7))
#else:
#    print('Voce não recebeu uma multa')

# exemplo 5**2 = 25 , 5//2 = 2 ,5 % 2 = 1


#numero = int(input('Digite um numero para saber se ele e par :'))
#if numero % 2 == 0:
#    print('O numero escolhido e par')
#else:
#    print('O numero escolhido e impar')


#distancia = int(input('Digite a distancia da viagem :'))
#if distancia <= 200:
#    print('o valor da viagem é  : {}'.format(distancia*0.50))
#else:
#    print('o valor da viagem é : {}'.format(distancia*0.45))


#ano  = int(input('Digite o ano para verificar se ele é bissexto :'))
#if ano%4 == 0 or ano%400 == 0 :
#    print('o ano {} é bissexto'.format(ano))
#else:
#    print('o ano não é bissexto !!')


#n1 = int(input('digite o primeiro numero :'))
#n2 = int(input('digite o segundo numero :'))
#n3 = int(input('digite o terceiro numero :'))
#if n1 < n2:
#    menor = n1
#if n2 < n1:
#    menor = n2
#if n3 > n2 :
#    maior = n3
#if n3 < n2:
#    maior = n2
#if n3 < n1:
#    menor = n3
#print('o maior numero digitado foi {} e o menor foi {}'.format(maior, menor))

#salario = float(input('Digite o salario do funcionario :'))
#if salario > 1250:
#        print('o salario do funcionario com aumento é : {}'.format(salario*(110/100)))
#else :
#    print('o salario do funcionario com aumento é {}'.format(salario*(115/100)))

#idade =''
#sexo=''
#while True:
#   idade = int(input('Digite sua idade :'))
#   if idade !=0:
#       break
#while sexo != 'm' and 'f':
#    sexo = str(input('Digite seu sexo M ou F :')).lower()
#    if sexo == 'm' or sexo == 'f':
#        break
#if idade >= 18:
#    if sexo == 'm':
#        print('Homem e maior de idade !!!')
#    else:
#        print('Mulher e maior de idade !!!')
#else:
#    if sexo == 'm':
#        print('Homen e menor de idade !!!')
#    else:
#        print('Mulher e menor de idade !!!')

#nome = str(input('Digite o nome do aluno :'))
#n1  = float(input('Digite a primeria nota do aluno :'))
#n2  = float(input('Digite a segunda nota do aluno :'))
#faltas = int(input('Digite o total de faltas do aluno :'))
#print(nome)
#print('\n')
#print(f'a media do aluno foi {(n1+n2)/2}')
#print(f'A porcentagem de falta do aluno foi {(100*faltas)/20} %')
#if ((n1+n2)/2)>6 and faltas <= 6:
#    print('O aluno foi aprovado !!!')
#else :
#    if (n1+n2)/2>6:
#        print('O aluno foi reprovado por Falta sendo sua media sufuciente para ser aprovado !!!')
#    else :
#        print(f'aluno reprovado por media {(n1+n2)/2}')

i=0
n1 = -1
n2 = -1
faltas = -1
assid = -1
nome=''
valid = False

nome = str(input('Digite o nome do aluno :'))

while valid == False:
    n1 = input('Digite a primeira nota do aluno :')
    try:
        n1=float(n1)
        if n1 < 0 or n1>10:
            print('Digite uma nota valida !!!')
        else:
            valid = True
    except:
        print('Formato de nota invalido . Use somente numeros e para separar as casas decimais use "." ')

valid = False

while valid == False:
    n2 = input('Digite a segunda nota do aluno :')
    try:
        n2=float(n2)
        if n2 < 0 or n2>10:
            print('Digite uma nota valida !!!')
        else:
            valid = True
    except:
        print('Formato de nota invalido . Use somente numeros e para separar as casas decimais use "." ')

valid = False

while valid == False:
    i=0
    faltas = input('Digite um numero de faltas :')
    for i in faltas:
        if i == '.' or i == ',':
            i = 1
    try:
        faltas = int(faltas)
        if i == 1:
            print('O numero de faltas so pode ser inteiro !!!')
        elif faltas < 0 or faltas > 20 :
            print('Digite um numero de faltas valido !!!')
        else:
            valid = True
    except:
        print('Formato digitado invalido !!!')


assid = 100-((100*faltas)/20)
media = (n1+n2)/2

print('\n')
print(f'o nome do aluno  : {nome}')
print(f'a media do aluno foi {media:.2f}')
print(f'a assiduidade do aluno foi {assid}%')
if media >=6 and faltas <= 6:
    print('Aluno aprovado por media !!!')
elif media >=6 and faltas > 6 :
    print('Aluno perdeu por falta !!!')
elif media < 6  :
    print('Aluno perdeu por media !!!')
else:
    print('o progama deu erro !!!')

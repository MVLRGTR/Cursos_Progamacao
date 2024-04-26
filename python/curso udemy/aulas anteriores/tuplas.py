            # lanche = ('hamburgue','refrigerante', 'batata frita','sundae')
            # for c in range(0,len(lanche)):
            #    print('eu vou com {}'.format(lanche[c]))
            # for c in lanche:
            #    print('eu vou comer {}'.format(c))
            # for pos, c in enumerate(lanche):
            #    print('eu comi {} na posição {}'.format(c,pos))
            # print(sorted(lanche))

            # numero = ('zero','um', 'dois','tres', 'quatro','cinco','seis','sete','oito','nove','dez','onze','doze','treze','quatorze','quinze','dezesseis','dezessete','dezoito','dezenove','vinte')
            # while True:
            #    x = int(input('Digite um numero de 0 a 20 :'))
            #    if x >= 0 and x <= 20:
            #        print('o numero digitado foi {}'.format(numero[x]))
            #        break
            #    else:
            #        print('Voce digitou um numero fora do intervalo!!!')
            #        print('\n')

            # campeonato = ('Flamengo','Atletico Mineiro','São Paulo','Internacional','Grêmio','Palmeiras','Sport Recife','Cruzeiro','Botafogo','Corintians','Vasco','Fluminense','América-MG','Chapecoense','Santos','Vicetoria','Bahia','Paraná','Atlético-PR','Ceará')
            # print('os cinco primeiros colocados :')
            # for i in range(0,5):
            #    print('{}º colocado {}'.format(i+1,campeonato[i]))
            # print('\nOs quatro ultimos colocados')
            # for x in range(-4,0):
            #    print('{}º colocado {}'.format(21+x,campeonato[x]))
            # print('\nOs times em ordem alfabetica')
            # print(sorted(campeonato))
            # print('\n o time da chapecoense se encontra na posição {}º'.format(campeonato.index('Chapecoense')+1))

            # import random
            # numeros = (random.randint(1,10),random.randint(1,10),random.randint(1,10),random.randint(1,10),random.randint(1,10))
            # for i in numeros:
            #    print(i)
            # for i in range(0,5):
            #    if i == 0:
            #        menor = numeros[0]
            #        maior = numeros[0]
            #    if numeros[i]>maior:
            #        maior = numeros[i]
            #    elif numeros[i]<menor:
            #        menor = numeros[i]
            # print('\no maior numero foi {}'.format(maior))
            # print('o menor numero foi {}'.format(menor))

            # n1 = int(input('Digite um numero :'))
            # n2 = int(input('Digite outro numero :'))
            # n3 = int(input('Digite mais um numero :'))
            # n4 = int(input('Digite o antepenultimo numero :'))
            # n5 = int(input('Digite o penultimo numero :'))
            # n6 = int(input('Digite o ultimo numero :'))
            # x = (n1 , n2 , n3 , n4, n5, n6)
            # c9 = 0
            # par = 0
            # for i in x:
            #    if i == 9:
            #         c9 = c9 + 1
            #    if (i % 2 )==0:
            #        par = par + 1
            # print('\nO numero 9 aparece {} vezes !!!'.format(c9))
            # print('A quantidade de numeros pares digitados foi {}'.format(par))
            # if (3 in x)==True:
            #    print('O numero 3 foi digitado pela primeria vez {}º posição'.format(x.index(3) + 1))
            # else:
            #    print('O numero 3 não foi digitado !!!')

            # produtos = ('Lapis', 2.25 , 'Leite', 5.50,'Pão',0.25,'vinho',55.65,'Carne contra-file',55.5 ,'Canetas',22.50,'Nescau',7.80)
            # for i  in range(0 , len(produtos)):
            #    if i % 2 == 0:
            #       print(f'{produtos[i]:.<30}',end = '')
            #    else:
            #        print(f'R${produtos[i]:>5.2f}')



palavras = ('macaco', 'banana', 'livro', 'progamador', 'estudar', 'futuro', 'praticar', 'linguagem')
for i in palavras:
    print('Na palavra {} temos '.format(i), end = '')
    for c in i:
        if c in 'aeiou':
            print(c, end = "")
    print('\n')



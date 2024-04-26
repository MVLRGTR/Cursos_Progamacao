#frase[9:21] fatiamento da string no local informado ex print(frase[9:13])
#len(frase) ela fala o comprimento da frase
#frase.count('o') conta quantas vezes a letra o aparece
#frase.count('o',0,13) conta quantos o tem na string no fatiamento determinado
#frase.find('deo') informa na string em que posição começou a aparecer o deo , caso a string não existe ele retorna o valor -1
#'curso' in frase mostra apenas se existe essa string  em frase e escreve na tela o valor true
#frase.replace('python','Android') ele procura python na string e substitui por android
#frase.upper() troca todas as letras da string para maiuscula
#frase.lower() troca tudo para minusculo
#frase.capitalize() joga todos os caracteres para minusculo menos o primeiro da string
#frase.title() ele faz o capitalize em todas as palavras da string
#frase.strip() elimina os espaços em branco no inicio e no fim
#frase.rstrip()  elimina apenas os espaços em branco do final sa string
#frase.lstrip() elimina apenas os espaços em branco na frente da string
#frase.split() dividi a string onde houver espaaços em branco
#'-'.join(frase) juntar todos os elementos da string
#.format(frase.index('video')) procura uma string na tupla
#.isupper() diz se a string e maiuscula ou minuscula
#.islower() mesma função da anterior so que ao contrario
#s == s[::-1]:coloca uma string ao contrario

#frase = 'curso em video em python'
#print(frase[3:13])

#print("""Nessa aula, vamos aprender operações com String no Python.
#As principais operações que vamos aprender são o Fatiamento de String,
#Análise com len(), count(), find(),
#transformações com replace(), upper(), lower(), capitalize(), title(), strip(),
#junção com join().""")

#frase = 'curso em video python'
#print(frase.count('o'))

#frase = ' curso em video em python  '
#print(len(frase.strip()))

#frase = 'curso em video python'
#print('curso' in frase)

#frase = 'curso em video python'
#print(frase.find('video'))

#frase = 'curso em video python'
#dividido = frase.split()
#print(dividido[0])

#nome = str(input('Digite o nome da pessoa completo :')).strip()
#print(nome.upper())
#print(nome.lower())
#print(len(nome)- nome.count(' '))

#num = str(input('Digite um numero de 0 a 9999 :'))
#if(len(num)== 4):
#    print('unidade {}'.format(num[3]))
#    print('dezena{}'.format(num[2]))
#    print('centena {}'.format(num[1]))
#    print('milhar {}'.format(num[0]))
#if(len(num)== 3 ):
#    print('unidade {}'.format(num[2]))
#    print('dezena {}'.format(num[1]))
#    print('centena {}'.format(num[0]))
#if(len(num)==2):
#  print('unidade {}'.format(num[1]))
#   print('dezena {}'.format(num[0]))
#if(len(num)==1):
#    print('unidade {}'.format(num[0]))

#nome = str(input('digite o nome da cidade :')).strip().lower()
#cidade = nome.split()
#print('santo' in cidade[0])

#nome = str(input('Digite seu nome :'))
#print('silva' in  nome)

#nome = str(input('Digite uma frase :')).lower()
#resultado = nome.split()
#print('a letra A aparece {} vezes'.format(nome.count('a')))
#print('a letra A começou a aparecer na {} posição'.format(nome.find('a')+1))
#print('a ultima letra a apareceu na {} posição'.format(nome.rfind('a')+1))

#nome = str(input('Digite seu nome completo :'))
#print('o nome completo digitado é {}'.format(nome))
#resultado = nome.split()
#print('o primeiro nome é : {} '.format(resultado[0]))
#print('o ultimo nome é : {}'.format(resultado[len(resultado)-1]))




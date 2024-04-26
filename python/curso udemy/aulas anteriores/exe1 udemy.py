#exe 1
#def volume(raio):
#    volume = (3/4)*(3.141614)*(raio**3)
#    return volume
#raio = float(input('Digite o valor do raio da esfera :'))
#print(f'o valor do volume da esfera é {volume(raio):.2f}')

#exe2
#def numero_check(num,minimo,maximo):
#    if num >= minimo and num <= maximo:
#        print('O numero pertence ao intervalo !!!')
#    else:
#        print('o numero não pertence ao intervalo !!!')
#minimo = int(input('Digite o menor valor do intervalo :'))
#maximo = int(input('Digite o maior valor do intervalo :'))
#num = int(input('Digite o numero para ser verificado :'))
#numero_check(num,minimo,maximo)

#exe3
#def conta_maiuscula(string):
#    M=0
#    for i in string:
#        if i.isupper() == True:
#            M=M+1
#    return M
#def conta_minuscula(string):
#    m = 0
#    for i in string:
#        if i.islower()==True:
#            m=m+1
#    return m
#string = str(input('Digite uma string :'))
#print(f'A quantidade de letras maiusculas é :{conta_maiuscula(string)}')
#print(f'A quantidade de letras minusculas é :{conta_minuscula(string)}')

#exe4
#l=[1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6]
#lista=set(l)
#print(lista)

#exe5
#numeros = []
#total =1
#while True:
#    n = int(input('Digite um numero :'))
#    numeros.append(n)
#    d = input('Deseja adicionar mais um numero S/N :').lower()
#    if d == 'n':
#        break
#for i in numeros:
#    total = total * i
#print(total)

#exe6
#def palindrome(palavras):
#    s=''
#    palavras = palavras.replace(' ', '')
#    if s == s[::-1]:
#        print('A palavra e palindrome')
#    else:
#        print('A palavra não é palindrome')
#palavras = str(input('Digite uma palavra para ver se ela é palindrome :'))
#palindrome(palavras)



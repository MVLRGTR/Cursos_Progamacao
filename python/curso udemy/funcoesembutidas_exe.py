'''def contador_letras(lista):
    return list(map(len,lista.split()))
palavras =('Ola tudo bem com você ')
print(contador_letras(palavras))

import functools
def digitos_numeros(numeros):
    return functools.reduce(lambda x,y :x*10+y,numeros)
num = [4,2,3,2,1]
print(digitos_numeros(num))

l = ['hello','are','cat','dog','ham','hi','go','to','heart']
print(list(filter(lambda x : x[0] == 'h',l)))

letras  = ['a','b','c']
letras2 = ['d','e','f']
conector = '-'
def concatenar(l,l2,conector):
    return [c1 + conector + c2 for c1,c2 in zip(l,l2) ]
print(concatenar(letras,letras2,'-'))

lista= ['a','b','c','d']
def inversao(l):
    return{char:valor for valor,char in enumerate(l)}
print(inversao(lista))

lista = [0,2,2,1,5,5,6,10]
def contador(l):
    return len([n for i,n in enumerate(l) if i == n])
print(contador(lista))
'''
import functools
def digitos_numeros(numeros):
    return functools.reduce(lambda x,y :x*10+y,numeros)
num = [4,2,3,2,1]
print(digitos_numeros(num))

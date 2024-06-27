'''
def fahrenheits(T):
    return (9/5) * T + 32
temp = [9,22,40,90,120]
print(list(map(fahrenheits,temp)))

import functools
lista =[100,200,300,55,60]
print(functools.reduce(lambda x,y : x+y ,lista))

lista = [1,4,5,12,19,21,22,23,44,55,56]
print(list(filter(lambda x: x%2 == 0 , lista)))

x =[1,2,3,7,1,9,10]
y =[4,5,6,1,4,2,1]
for i in zip(x,y):
    print(max(i))

lista= ['a','b','c','d']
for n , item in enumerate(lista):
    print(n ,':' ,item)

lista1 = [True,True,False] 
print(all(lista1)) #retornara False porque nem todos os elemtos são True
print(any(lista1)) #retornara True porque pelo menos um dos elementos da lista é True
'''


lista= [0,2,2,1,5,5,6,10]
print(list(enumerate(lista)))

'''
def gensquare(n):
    for i in range(n):
        yield i**2
for j in gensquare(10):
    print(j)
    

import random as r
def gerar_aleatorios(low,high,n):
    for i in range(n):
        yield r.randint(low,high)
for j in gerar_aleatorios(0,10,5):
    print(j)

s = 'Hello'
print(list(iter(s)))
'''
lista=[1,2,3,4,5,6,7]


gerador = (item for item in lista if item  > 3)
for j in gerador:
    print(j)
    
'''
import collections as c
l = [2,2,2,3,3,3,3,3,3,3,3,2,4,4,4,4,4,4,4,5,5,5,5]
print(c.Counter(l))

palavras = ('Ola mundo , como está voce mundo , como pode estar bem voce mundo')
print(c.Counter(palavras))
print(c.Counter(palavras.split()))

comum = c.Counter(palavras.split())
print(comum.most_common(2))
'''
import collections as c

cachorro = c.namedtuple('cachorro','idade raça nome') #criar um estrutura de dados tipo objeto 
brian = cachorro(idade = 2 , raça = 'shirtzu' ,nome = 'Brian' )
print(brian)

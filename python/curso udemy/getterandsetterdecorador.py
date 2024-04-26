"""print (f'Olá Mundo')
exit(0)

from classespoo import  pessoa
p1 = pessoa('João',25)
print(p1.ano_nascimento())
print(pessoa.ano_atual)
"""

class produto:
    def __init__(self,nome,preco):
        self.__nome = nome
        self.preco = preco

    def desconto(self,percentual):
        self.preco = self.preco - (self.preco * (percentual / 100))

    @property
    def preco(self):
        return self._preco

    @preco.setter
    def preco(self,valor):
        self._preco = float(valor)


p1 = produto('carrinho','100')
p1.desconto(10)
print(p1.preco)









class escritor:
    def __init__(self,nome):
        self.__nome = nome
        self.__ferramenta =  None

    @property
    def nome(self):
        return self.__nome

    @property
    def ferramenta(self):
        return self.__ferramenta

    @ferramenta.setter
    def ferramenta(self,ferramenta):
        self.__ferramenta = ferramenta

class caneta:
    def __init__(self,marca):
        self.__marca = marca

    @property
    def marca(self):
        return self.__marca

    def escrever(self,assunto):
        print(f'A caneta está escrevendo sobre {assunto}')

class Maquina_De_Escrever:
    def __init__(self,modelo):
        self.__modelo =modelo

    @property
    def modelo(self):
        return self.__modelo

    def escreve(self):
        print(f'A maquina {self.__modelo} está em uso')


e1 = escritor('Joao')
c1 = caneta('BIC')
# m1 = Maquina_De_Escrever('Consul')

e1.ferramenta = c1
e1.ferramenta.escrever('conversando sobre ')



""" esse tipo de associação vista acima acima é mais fraca que tem pois se o objeto e1
for apagado todos os outros ainda continuam vivendo de forma independente de e1 no nosso caso
"""




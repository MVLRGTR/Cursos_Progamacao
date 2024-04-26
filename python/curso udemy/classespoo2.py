import random

class pessoas:

    ano_atual = 2023

    def __init__(self,nome,idade):                            #aqui observamos um metodo de instancias ,precisa da instancia
        self.nome = nome
        self.idade = idade

    @classmethod
    def por_ano_nascimeto(cls,nome,ano_nascimento):          #aqui observamos um metodo de classe.
        idade = cls.ano_atual - ano_nascimento               #Observar que o class metodo é da classe e não da instancia
        return cls(nome,idade)

    @staticmethod
    def gerar_id():
        rand = random.randint(1,10)                         #metodo que não depende nem da instancia e nem da classe
        return rand

    #getter                                                 #getters e setters são uma proteção dos  inputs dos meus atributos sem a necessidade de reescrever o codigo por inteiro
    @property
    def nome(self):
        return self._nome
    #setter
    @nome.setter
    def nome(self,valor):
        self._nome = valor.upper()



p1 = pessoas.por_ano_nascimeto('Luiz', 1992)                  #aqui eu crio o objeto atraves de um metodo da classe.

print(p1.nome,p1.idade)
print(pessoas.gerar_id())


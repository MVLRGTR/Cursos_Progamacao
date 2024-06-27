class cliente:
    def __init__(self,nome ,idade):
        self.nome = nome
        self.idade = idade
        self.endereco = []

    def insere_endereco(self,cidade,estado):
        self.endereco.append(endereco(cidade,estado)) #aqui eu instancio a classe endereco dentro da classe cliente tento em questão a composição

    def lista_endereco(self):
        for i in self.endereco:
            print(f'{i.cidade} {i.estado}')

    def __del__(self):
        print(f'{self.nome} FOI APAGADO')


class endereco:
    def __init__(self,cidade , estado):
        self.cidade = cidade
        self.estado = estado

    def __del__(self):
        print(f'{self.cidade}/{self.estado} FOI APAGADO')

c1 =cliente('Maria' , 29)
c1.insere_endereco('Salvador', 'BA')
print(c1.nome)
c1.lista_endereco()
del c1
print()

c2 =cliente('João' , 27)
c2.insere_endereco('Feira de Santana', 'BA')
c2.insere_endereco('Belo Horizonte','MG')
print(c2.nome)
c2.lista_endereco()
del c2
print()

c3 =cliente('Luiz' , 19)
c3.insere_endereco('São Paulo', 'SP')
c3.insere_endereco('Aracajú','SE')
print(c3.nome)
c3.lista_endereco()
del c3
print()

print('############################################')
#diferente da agregação , aqui nós temos uma classe que pertence a outra que no codigo acima e demostrado que a classe endereco pertence a classe cliente
#e quando apagamos uma instancia da classe cliente apagamos tembém a instancia endereco que foi criada por uma instancia da classe cliente


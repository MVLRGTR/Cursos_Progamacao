from datetime import datetime

class pessoa:
    ano_atual = int(datetime.strftime(datetime.now(),'%Y'))                  #aqui nos temos um atributo de classe

    def __init__(self,nome,idade,comendo = False, falando = False):       #o metodo init permiti eu criar atributos para as instancias
        self.nome = nome
        self.idade = idade
        self.comendo = comendo
        self.falando = falando


    def comer(self,alimento):
        if self.comendo:
            print(f'{self.nome} já está comendo !!!')
            return
        if self.falando:
            print(f'{self.nome} não pode comer enquanto fala.')
        print(f'{self.nome} está comendo {alimento}.')
        self.comendo = True

    def parar_comer(self):
        if self.comendo == False:
            print(f'{self.nome} não está comendo.')
            return
        self.comendo = False
        print(f'{self.nome} parou de comer')

    def falar(self,assunto):
        if self.comendo:
            print(f'{self.nome} não pode falar enquanto come !!!')
            return
        if self.falando:
            print(f'{self.nome} já está falando.')
            return
        self.falando = True
        print(f'{self.nome} está falando sobre {assunto}')

    def parar_falar(self):
        if not self.falando:
            print(f'{self.nome} já não está mais falando.')
            return
        self.falando = False

    def ano_nascimento(self):
        return self.ano_atual - self.idade








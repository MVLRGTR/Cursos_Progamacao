'''
def hello(nome ='Marcos'):
    return 'Olá '+nome
boasvindas = hello
print(boasvindas())
'''
def hello(nome='Marcos'):
    print('Olá '+nome)
    
    def tudobem():
        print(f'Tudo bem {nome} ?')
        
    def comovoceesta():
        print(f'Como você está {nome} ?')

    return tudobem

func = hello()

print(func())

#estudar novamente até entender os decoradores
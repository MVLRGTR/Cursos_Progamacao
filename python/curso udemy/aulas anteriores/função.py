#def mesagem(user,age):
#    print('Seja bem vindo '+user.title(),'sua idade e de '+age)
#nome = input('Digite seu nome :')
#idade = input('Digite sua idade :')
#mesagem(nome,idade)

def tabela(sexo,imc):
    if sexo == 'm':
        if imc<5.2:
            print('Muito Abaixo do peso !!!')
        elif  imc >= 5.3 and imc <=9.3:
            print('Magro')
        elif imc >= 9.4 and imc <= 14.01:
            print('Muito bom o seu peso')
        elif imc >=14.02 and imc <=17.5:
            print('Saudável')
        elif imc >= 17.6 and imc <=22.4:
            print('Está com um sobrepeso')
        elif imc >=22.5 and imc <=29.2:
            print('Voce está gordo !!!')
        else:
            print('Voce está muito gordo')
    else:
        if imc<10.7:
            print('Muito Abaixo do peso !!!')
        elif  imc >= 10.8 and imc <=17:
            print('Magra')
        elif imc >= 17.1 and imc <= 20.5:
            print('Muito bom o seu peso')
        elif imc >=20.6 and imc <=23.8:
            print('Saudável')
        elif imc >= 23.9 and imc <=27.6:
            print('Está com um sobrepeso')
        elif imc >=27.7 and imc <=35.5:
            print('Voce está gorda !!!')
        else:
            print('Voce está muito gorda')

def imc(peso,altura):
    return peso/(altura*altura)

valid = False

while valid == False:
    peso = input('Digite seu peso :')
    try:
        peso = float(peso)
        if peso < 0 or peso > 700:
            print('Digite um valor valido para o peso !!!')
            print('\n')
        else:
            valid =True
    except:
        print('Formato Digitado Invalido , use o . para as casas decimais !!!')
        print('\n')

valid = False

while valid == False:
    altura = input('Digite sua altura:')
    try:
        altura = float(altura)
        if altura < 0 or altura > 2.5:
            print('Digite um valor valido para o altura !!!')
            print('\n')
        else:
            valid =True
    except:
        print('Formato Digitado Invalido , use o . para as casas decimais !!!')
        print('\n')

valid = False

while valid == False:
    sexo = input('Digite seu sexo M/F :').lower()
    if sexo == 'm' or sexo == 'f':
        valid = True
    else:
        print('Formato Digitado invalido !!!')
        print('\n')

tabela(sexo , imc(peso,altura))




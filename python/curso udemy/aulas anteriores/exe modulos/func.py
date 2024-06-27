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

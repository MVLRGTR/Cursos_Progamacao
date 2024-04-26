import func as f

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

f.tabela(sexo , f.imc(peso,altura))
print(f'Seu IMC e {f.imc(peso,altura):.2f}')




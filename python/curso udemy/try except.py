'''x = 10

try:
    print(x)
except:
    print('Erro no progama !!!')
else:
    print('Erro desconhecido !!!')
finally:
    print('fim do tratamento')
    
no caso acima , caso não exista nenhuma excessão o python cai no else e o finally e executado sempre , independente de qualquer coisa

num = -105
if num < 1:
    raise Exception('Valor não permitido')


num = 10
print(type(num))
if not type(num) is int:
    raise Exception('Valor incorreto')
else:
    print(str(num))
    

'''
def valida():
    try:
        numero = float(input('Digite um número :'))
        if numero < 10 :
            raise Exception
    except:
        print('FORMATO DIGITADO INVALIDO !!!')
        valida()
valida()
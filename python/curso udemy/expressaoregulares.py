import re

padrao = ['term1','term2','Palavras']

texto = 'Temos o term1 e também o term2 contidos nessa string'

#print(re.search(padrao[0],texto))
#print(texto.split())

for i in padrao:
    print(f'Procurando por {i} em \n {texto}')
    
    if re.search(i,texto):
        print(f'Achamos {i} no texto em questão !!!')
    else :
        print(f'Não achamos {i} no texto em questão !!!')
    print('\n')
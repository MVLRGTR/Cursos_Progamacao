# alem dos operadores mais usados temos tambem  ** = potencia ,
# // divisao inteira , % resto da divisao inteira
# exemplo 5**2 = 25 , 5//2 = 2 ,5 % 2 = 1
# ordem de precedencia 1 - () , 2 - ** , 3 - / * // % , 4 - + -

n1 = float(input('digite o primeiro valor :'))
n2 = float(input('digite o segundo valor:'))

i = n1//n2
d = n1%n2

print('o valor da soma {:.2f}'.format(n1+n2))
print('o valor da divisão inteira de {} por {} é {}'.format(n1 , n2 , i))
print('o resta da divisão de {} po {} e {}'.format(n1 ,n2 , d))
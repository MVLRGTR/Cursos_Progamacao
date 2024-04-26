#padrao ansi \033[0;33;44m
#1 espaço para o style que vai de 0 a 7
#style 0 = none ; 1 = bold ; 4 = underline ; 7 = negative
#cor text que vai do 30 a 37
#cor de fundo back que vai do 40 ao 47

#print('\033[1;31;42m ola mundo\033[m')

x = 3
y = 6
print('os numeros são \033[41;1m{}\033[m e \033[45;1m{}\033[m'.format(x,y))
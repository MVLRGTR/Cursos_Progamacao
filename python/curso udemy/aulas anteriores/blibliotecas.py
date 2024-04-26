#import math
#x=float(input('Digite um numero para obter sua raiz quadrada :'))
#print('a raiz quadrada de {} e {}'.format(x,math.sqrt(x)))

# bliblioteca random , faz gerar numeros aleatorios.
#import random
#print('{}'.format(random.randint(1,5)))

#import math
#x = float(input('Digite um numero'))
#print('{}'.format(math.floor(x)))

#import math
#co = float(input('Digite o cateto oposto :'))
#ca = float(input('Digite o cateto adjacente :'))
#x = ca**2 + co**2
#print('o valor da hipotenusa é {:.2f} '.format(math.sqrt(x)))

#import math
#x = float(input('Digite um valor de angulo qualquer :'))
#print('o cosseno desse angulo é {:.9} e o seno e {:.9}'.format(math.cos(math.radians(x)),math.sin(math.radians(x))))

#import random
#n1 = str(input('Digite o nome do aluno 1 :'))
#n2 = str(input('Digite o nome do aluno 2 :'))
#n3 = str(input('Digite o nome do aluno 3 :'))
#n4 = str(input('Digite o nome do aluno 4 :'))
#x = random.randint(1,4)
#if(x==1):
#    print('o aluno escolhido foi {}'.format(n1))
#if(x==2):
#    print('o aluno escolhido foi {}'.format(n2))
#if(x==3):
#   print('o aluno escolhido foi {}'.format(n3))
#if(x==4):
#    print('o aluno escolhido foi {}'.format(n4))

#import random
#n1 = str(input('Digite o nome do aluno 1 :'))
#n2 = str(input('Digite o nome do aluno 2 :'))
#n3 = str(input('Digite o nome do aluno 3 :'))
#n4 = str(input('Digite o nome do aluno 4 :'))
#list = [n1,n2,n3,n4]
#resultado = random.choice(list)
#print('O aluno escolhido foi : {}'.format(resultado))

import random as r
n1 = str(input('Digite o nome do aluno 1 :'))
n2 = str(input('Digite o nome do aluno 2 :'))
n3 = str(input('Digite o nome do aluno 3 :'))
n4 = str(input('Digite o nome do aluno 4 :'))
list = [n1,n2,n3,n4]
r.shuffle(list)
print(' a ordem de apresentação é : ',list)

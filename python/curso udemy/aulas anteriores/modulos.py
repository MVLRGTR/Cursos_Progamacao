#import math
#import time
#import random as r
#print(math.ceil(3.2))
#print(math.floor(3.2))
#print(math.fsum([1,2,3,4,5]))
#print(math.sqrt(16))
#def cont_tempo():
#    inicio = time.clock()
#    x = input('Digite seu nome :')
#    fim = time.clock()
#    print(f' o tempo que voce levou para escrever seu nome foi {fim-inicio:.2f}s')
#cont_tempo()
#print(r.randint(0,10))
#import pygame
#import random as r
#def mega_sena():
#    jogo=[]
#    while len(jogo) <6:
#        sorteio = r.randint(0,60)
#        if sorteio in jogo:
#            continue
#        else:
#            jogo.append(sorteio)
#    return jogo
#print(f'o jogos da mega sena são {sorted(mega_sena())}')
#alunos = ['mariana','guilherme','joao','victor','romano','julia']
#print(r.choice(alunos))
#print(r.sample(alunos,2))

import matplotlib.pyplot as plt
x = [1,2,3,4,5,6]
y=[1500,1800,1300,1900,2100,2000]
plt.plot(x,y)

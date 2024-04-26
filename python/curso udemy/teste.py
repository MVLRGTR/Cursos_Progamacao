#valid = False
'''if self.buffer[0][0] == 'X' and self.buffer[1][0] == 'X'  and self.buffer[2][0] == 'X' or self.buffer[0][0] == '0' and self.buffer[1][0] == '0'  and self.buffer[2][0] == '0' :
    valid = True
if self.buffer[0][1] == 'X' and self.buffer[1][1] == 'X'  and self.buffer[2][1] == 'X' or self.buffer[0][1] == '0' and self.buffer[1][1] == '0'  and self.buffer[2][1] == '0' :
    valid = True
if self.buffer[0][2] == 'X' and self.buffer[1][2] == 'X'  and self.buffer[2][2] == 'X' or self.buffer[0][2] == '0' and self.buffer[1][2] == '0'  and self.buffer[2][2] == '0' :
    valid = True
#aqui em cima verifico as condições na vertival para o jogo acabar

if self.buffer[0][0] == 'X' and self.buffer[0][1] == 'X'  and self.buffer[0][2] == 'X' or self.buffer[0][0] == '0' and self.buffer[0][1] == '0'  and self.buffer[0][2] == '0' :
    valid = True
if self.buffer[1][0] == 'X' and self.buffer[1][1] == 'X'  and self.buffer[1][2] == 'X' or self.buffer[1][0] == '0' and self.buffer[1][1] == '0'  and self.buffer[1][2] == '0' :
    valid = True
if self.buffer[2][0] == 'X' and self.buffer[2][1] == 'X'  and self.buffer[2][2] == 'X' or self.buffer[2][0] == '0' and self.buffer[2][1] == '0'  and self.buffer[2][2] == '0' :
    valid = True
#aqui em cima verifico as condições na horizontal para o jogo acabar

if self.buffer[0][0] == 'X' and self.buffer[1][1] == 'X' and self.buffer[2][2] == 'X'  or self.buffer[0][0] == '0' and self.buffer[1][1] == '0'  and self.buffer[2][2] == '0':
    valid =True
if self.buffer[0][2] == 'X' and self.buffer[1][1] == 'X' and self.buffer[2][0] == 'X'  or self.buffer[0][2] == '0' and self.buffer[1][1] == '0'  and self.buffer[2][0] == '0':
    valid = True
#aqui verifico as diagonais , mas logo em breve substituirei o codigo acima por um for na matrix para simplicação do codigo
"""
"""jogo =jogo_da_velha()
jogador1 = jogador('joao','x')
jogo.mostra_jogo()




jogador1.setter_ferramenta(jogo)
jogador1.getter_ferramenta().entradas_jogador(jogador1.nome,jogador1.char_do_jogador)

jogo.modifica_jogo(0,1,'x')
jogo.mostra_jogo()


jogo.modifica_jogo(0,2,'0')
jogo.modifica_jogo(1,1,'0')
jogo.modifica_jogo(2,0,'0')
print(jogo.verifica_termino())
jogo.mostra_jogo()
import os

#return valid


        buffer = []
        valid = False

        for i in range(0,3):
            buffer.clear()
            valid = False
            for j in range(0,3):
                buffer.append(self.buffer[i][j])
                print(self.buffer[i][j])
                if  buffer[0] == buffer[1] == buffer[2]:
                    if buffer[1] == 'x' or 0:
                        valid = True
                        return valid

        for i in range(0,3):
            buffer.clear()
            valid = False
            for j in range(0,3):
                buffer.append(self.buffer[j][i])
                if  buffer[0] == buffer[1] == buffer[2]:
                    if buffer[1] == 'x' or 0:
                        valid = True
                        return valid



matrix = [['x',0,'x',],
          ['x',0,0],
          ['x',0,0]]
buffer = []
valid = False

for i in range(0,3):
    buffer.clear()
    valid = False
    for j in range(0,3):
        buffer.append(matrix[i][j])
        print(buffer)
    if buffer[0] == buffer[1] == buffer[2] :
        if buffer[1] == 0 or buffer[1] == 'x':
            valid = True
        print(valid)

print('Outro For')

for i in range(0,3):
    buffer.clear()
    valid = False
    for j in range(0,3):
        buffer.append(matrix[j][i])
        print(buffer)
    if buffer[0] == buffer[1] == buffer[2]:
        if buffer[1] == 0 or buffer[1] == 'x':
            valid=True
        print(valid)


#essa logica será usada no jogo da velha

"""

""""
jogo.modifica_jogo(0,0,'x')
jogo.modifica_jogo(0,1,'x')
jogo.modifica_jogo(0,2,'x')
jogo.modifica_jogo(1,0,'x')
jogo.modifica_jogo(1,1,'x')
jogo.modifica_jogo(1,2,'x')
jogo.modifica_jogo(2,0,'x')
jogo.modifica_jogo(2,1,'x')
jogo.modifica_jogo(2,2,'x')
"""

"""jogador1.setter_ferramenta(jogo)
jogador1.getter_ferramenta().entradas_jogador(jogador1.nome,jogador1.char_do_jogador)

jogo.modifica_jogo(0,1,'x')
jogo.mostra_jogo()


jogo.modifica_jogo(0,2,'0')
jogo.modifica_jogo(1,1,'0')
jogo.modifica_jogo(2,0,'0')
print(jogo.verifica_termino())
jogo.mostra_jogo()

        if self.buffer[0][2] == 'X' and self.buffer[1][1] == 'X' and self.buffer[2][0] == 'X' or self.buffer[0][
            2] == '0' and self.buffer[1][1] == '0' and self.buffer[2][0] == '0':
            valid = True
            return valid


x = int(input('Digite um número de 0 a 1024 :'))
a = 0
b = 1024
cont = 1

teste = True

if x == 0:
    print('O número escolhido por você e o 0 !!!')
    teste = False
else:
    if x == 1024:
        print('O número escolhido por você foi o 1024 !!!')
        teste = False
    while teste == True:
        m = int((a+b)/2)
        print(f'{cont}º tentativa do progama e o valor está em {m} e o valor do intervalo é {a} e {b}')
        cont += 1
        if x == m:
            print(f'O número escolhido por você foi {m}')
            teste = False
        else:
            if m < x:
                a = m
            else:
                b = m

        if teste == True:
            print(f'{cont}º tentativa do progama e o valor está em {m} e o valor do intervalo é {a} e {b}')
            cont += 1

def gerador_de_cubos(n):
    for i in range(n):
        print(i)
        yield i**3

for j in gerador_de_cubos(10):
    print(j)

def trigonometria(funcao,graus,tipograu):
    if tipograu == 'g':
        graus = graus * 3.14159265358979323 / 180
        
    if funcao == 's':
        termo = graus
        resultado = termo
        n = 1
        while abs(termo) >= 1e-10:
            termo *= -1 * graus**2 / ((2*n) * (2*n+1))
            resultado += termo
            n+=1
        return resultado
    if funcao == 'c':
        termo = 1
        resultado = termo
        n = 1
        while abs(termo) >= 1e-10:
            termo *= -1 * graus**2 / ((2*n-1) * (2*n))
            resultado += termo
            n+=1
        return resultado

def equacao_segundo_grau(a,b,c):
    


import matplotlib.pyplot as plt
import numpy as np


 
# Intervalo de valores para o eixo x

# Calcular os valores da função para cada valor de x

x= [0,0.5,1,1.5,2]
y=[-1,0,1,1,3]
# Criar o gráfico de linha
plt.plot(x, y)

# Adicionar rótulos aos eixos
plt.xlabel('Eixo X')
plt.ylabel('Eixo Y')

# Adicionar título ao gráfico
plt.title('Gráfico da função seno')

# Exibir o gráfico
plt.show()

import matplotlib.pyplot as plt

def raiz(valor,nraiz):
    estimativa = 1
    precisao = 0.000000000001
    if valor < 1 :
        print('Não existe raiz de zero ou número negativo , Por favor Veirifique o valor digitado !!!')
        return 0
    while True:
        prox_estimativa = ((nraiz-1) * estimativa + valor / (estimativa**(nraiz-1))) / nraiz
        if abs(prox_estimativa - estimativa) < precisao:
            return prox_estimativa
        estimativa = prox_estimativa
def equacao_2_grau(a,b,c):
    delta = b**2-4*a*c
    raiz1 = (-b+raiz(delta,2))/(2*a)
    raiz2 = (-b-raiz(delta,2))/(2*a)
    limite_inferior = -4
    limite_superior = 4
    step = 0.01
    x=[]
    y=[]
    while limite_inferior <= limite_superior:
        x.append(limite_inferior)
        y.append(a*(limite_inferior**2)+b*limite_inferior+c)
        limite_inferior+=step
    return raiz1,raiz2,x,y
r1=0
r2=0
x=[]
y=[]
r1,r2,x,y = equacao_2_grau(4,0,0)[0],equacao_2_grau(4,0,0)[1],equacao_2_grau(4,0,0)[2],equacao_2_grau(4,0,0)[3]
print(r1,r2)
#plt.plot(x, y)
#plt.xlabel('Eixo X')
#plt.ylabel('Eixo Y')
#plt.title('Gráfico da função ')
#plt.axhline(0, color='black',linewidth=0.5)
#plt.axvline(0, color='black',linewidth=0.5)
#plt.show()

def mostra_menu():
    print('\n\n\n')
    print(' *************************Calculadora*************************\n')
    print(' 1 - calcular             2 - Equação              3 - Vetor            ')
    print('   + - * /                 x^2+x+1                    -> <-             ')
    print('   log                     x^3+x^2+x+1                <- ->           \n')
    print(' 4 - sistema linear   5 - Grafico de equações      ESC - Sair           ')
    
mostra_menu()

import matplotlib.pyplot as plt
def raiz(valor,nraiz):
    estimativa = 1
    precisao = 0.000000000001
    if valor < 1 :
        print('Não existe raiz de zero ou número negativo , Por favor Veirifique o valor digitado !!!')
        return 0
    while True:
        prox_estimativa = ((nraiz-1) * estimativa + valor / (estimativa**(nraiz-1))) / nraiz
        if abs(prox_estimativa - estimativa) < precisao:
            return prox_estimativa
        estimativa = prox_estimativa
def equacao_2_grau(a,b,c):
    delta = b**2-4*a*c
    if delta > 0 :
        raiz1 = (-b+raiz(delta,2))/(2*a)
        raiz2 = (-b-raiz(delta,2))/(2*a)
        limite_inferior = float(-50)
        limite_superior = float(50)
        step = float(0.5)
        x=[]
        y=[]
        valoresxy = [0,0]
        temp = 0 
        valor = 0
        while limite_inferior <= limite_superior:
            x.append(limite_inferior)
            y.append(a*(limite_inferior**2)+b*limite_inferior+c)
            limite_inferior+=step
            valor = a*(limite_inferior**2)+b*limite_inferior+c
            if temp == 0 :
                temp = 1
                valoresxy[1] = valor
            if a > 0:
                if valor < valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
            else:
                if valor > valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
                
        print(f'Essa equação tem raizes reais X1 = {raiz1} X2 = {raiz2}') 
        print(f'Ponto de Inflexão  ({valoresxy[0]},{valoresxy[1]})')
        plt.plot(x, y)
        plt.xlabel('Eixo X')
        plt.ylabel('Eixo Y')
        plt.title('Gráfico da função ')
        plt.axhline(0, color='black',linewidth=0.5)
        plt.axvline(0, color='black',linewidth=0.5)
        plt.show()       
    else:
        delta = delta*-1
        raiz1 = (-b/2*a)
        raiz1_2 = raiz(delta,2)/2*a
        limite_inferior = float(-50)
        limite_superior = float(50)
        step = float(0.5)
        x=[]
        y=[]
        valoresxy = [0,0]
        temp = 0 
        valor = 0
        while limite_inferior <= limite_superior:
            x.append(limite_inferior)
            y.append(a*(limite_inferior**2)+b*limite_inferior+c)
            limite_inferior+=step
            valor = a*(limite_inferior**2)+b*limite_inferior+c
            if temp == 0 :
                temp = 1
                valoresxy[1] = valor
            if a > 0:
                if valor < valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
            else:
                if valor > valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
        print(f'Essa equação tem raizes complexas X1 = {raiz1}{raiz1_2}i e X2 = {raiz1} {-raiz1_2}i')

a , b ,c = -1,4,-29
r1=0
r2=0
x=[]
y=[]
equacao_2_grau(-1,4,-29)

def valores_funcao(a,b,c):
    limite_inferior = float(-50)
    limite_superior = float(50)
    step = float(0.5)
    x=[]
    y=[]
    valoresxy = [0,0]
    temp = 0 
    valor = 0
    while limite_inferior <= limite_superior:
        x.append(limite_inferior)
        y.append(a*(limite_inferior**2)+b*limite_inferior+c)
        limite_inferior+=step
        valor = a*(limite_inferior**2)+b*limite_inferior+c
        if temp == 0 :
            temp = 1
            valoresxy[1] = valor
        if a > 0:
            if valor < valoresxy[1]:
                valoresxy[0] = limite_inferior
                valoresxy[1] = valor
        else:
            if valor > valoresxy[1]:
                valoresxy[0] = limite_inferior
                valoresxy[1] = valor
    return x,y,valoresxy

def formatacao(num):
    if num.is_integer():
        return int(num)
    else:
        return num
import matplotlib.pyplot as plt
def raiz(valor,nraiz):
    estimativa = 1
    precisao = 0.000000000001
    if valor < 1 :
        print('Não existe raiz de zero ou número negativo , Por favor Veirifique o valor digitado !!!')
        return 0
    while True:
        prox_estimativa = ((nraiz-1) * estimativa + valor / (estimativa**(nraiz-1))) / nraiz
        if abs(prox_estimativa - estimativa) < precisao:
            return prox_estimativa
        estimativa = prox_estimativa
def equacao_2_grau(a,b,c):
    def plotar_funcao(x,y):
        plt.plot(x, y)
        plt.xlabel('Eixo X')
        plt.ylabel('Eixo Y')
        plt.title('Gráfico da função ')
        plt.axhline(0, color='black',linewidth=0.5)
        plt.axvline(0, color='black',linewidth=0.5)
        plt.show()
    delta = b**2-4*a*c
    if delta > 0 :
        raiz1 = (-b+raiz(delta,2))/(2*a)
        raiz2 = (-b-raiz(delta,2))/(2*a)
        limite_inferior = float(-50)
        limite_superior = float(50)
        step = float(0.5)
        x=[]
        y=[]
        valoresxy = [0,0]
        temp = 0 
        valor = 0
        while limite_inferior <= limite_superior:
            x.append(limite_inferior)                                 #aqui eu adiciono os valores de x que serão colocados na f(x)
            y.append(a*(limite_inferior**2)+b*limite_inferior+c)      #aqui são os valores da f(x)     
            limite_inferior+=step
            valor = a*(limite_inferior**2)+b*limite_inferior+c
            if temp == 0 :
                temp = 1
                valoresxy[1] = valor
            if a > 0:
                if valor < valoresxy[1]:                              #aqui eu verifico o ponto de inflexão da função
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
            else:
                if valor > valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
                
        print(f'Essa equação tem raizes reais X1 = {formatacao(raiz1)} X2 = {formatacao(raiz2)}') 
        print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')
        plotar_funcao(x,y)      
    else:
        delta = delta*-1
        raiz1 = (-b/2*a)
        raiz1_2 = raiz(delta,2)/2*a
        limite_inferior = float(-100)
        limite_superior = float(100)
        step = float(0.5)
        x=[]
        y=[]
        valoresxy = [0,0]
        temp = 0 
        valor = 0
        while limite_inferior <= limite_superior:
            x.append(limite_inferior)
            y.append(a*(limite_inferior**2)+b*limite_inferior+c)
            limite_inferior+=step
            valor = a*(limite_inferior**2)+b*limite_inferior+c
            if temp == 0 :
                temp = 1
                valoresxy[1] = valor
            if a > 0:
                if valor < valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
            else:
                if valor > valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
        if a<0:
            print(f'Essa equação tem raizes complexas X1 = {formatacao(raiz1)}{formatacao(raiz1_2)}i e X2 = {formatacao(raiz1)}+{formatacao(-raiz1_2)}i')
            print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')
            plotar_funcao(x,y)
        else:
            print(f'Essa equação tem raizes complexas X1 = {formatacao(raiz1)}+{formatacao(raiz1_2)}i e X2 = {formatacao(raiz1)}{formatacao(-raiz1_2)}i')
            print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')
            plotar_funcao(x,y)
equacao_2_grau(-1,0,2)
def valores_funcao(a,b,c):
    limite_inferior = float(-50)
    limite_superior = float(50)
    step = float(0.5)
    x=[]
    y=[]
    valoresxy = [0,0]
    temp = 0 
    valor = 0
    while limite_inferior <= limite_superior:
        x.append(limite_inferior)
        y.append(a*(limite_inferior**2)+b*limite_inferior+c)
        limite_inferior+=step
        valor = a*(limite_inferior**2)+b*limite_inferior+c
        if temp == 0 :
            temp = 1
            valoresxy[1] = valor
        if a > 0:
            if valor < valoresxy[1]:
                valoresxy[0] = limite_inferior
                valoresxy[1] = valor
        else:
            if valor > valoresxy[1]:
                valoresxy[0] = limite_inferior
                valoresxy[1] = valor
    return x,y,valoresxy

while True:
    decisao = ''
    temporario = 0
    memoria = entradas('v1',0)
    while True:
        operacao = entradas('e',0)
        if operacao == '+':
            temporario = soma(memoria,entradas('v2',0))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == '-':
            temporario = subtracao(memoria,entradas('v2',0))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == '*':
            temporario = multiplicacao(memoria,entradas('v2',0))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == '/':
            temporario = divisao(memoria,entradas('v2',0))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == '**':
            temporario = potencia(memoria,entradas('**',memoria))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == 'r2':
            temporario = raiz_quadrada(entradas('r2',memoria))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == 'r':
            temporario = raiz(memoria,entradas('r',0))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == 'tg':
            temporario = trigonometria(entradas('tg1',0),memoria,entradas('tg2',0))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == 'f':
            temporario = fatorial(entradas('f',memoria))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == 'logn':
            temporario = logaritmo_neperiano(entradas('logn',memoria))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n':
                break
        elif operacao == 'log':
            temporario = logaritmo(entradas('log',memoria))
            print(f'={formatacao(temporario)}')
            memoria = temporario
            decisao =  entradas('d',0)
            if decisao == 'n':
                break

def menu_operacoes():
    while True:
        decisao = '0'
        temporario = 0
        memoria = entradas('v1',0)
        while True:
            operacao = entradas('e',0)
            if operacao == '+':
                temporario = soma(memoria,entradas('v2',0))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == '-':
                temporario = subtracao(memoria,entradas('v2',0))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == '*':
                temporario = multiplicacao(memoria,entradas('v2',0))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == '/':
                temporario = divisao(memoria,entradas('v2',0))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == '**':
                temporario = potencia(memoria,entradas('**',memoria))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == 'r2':
                temporario = raiz_quadrada(entradas('r2',memoria))
                print(f'={formatacao(temporario)}')
                memoria = temporario         
            elif operacao == 'r':
                temporario = raiz(memoria,entradas('r',0))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == 'tg':
                temporario = trigonometria(entradas('tg1',0),memoria,entradas('tg2',0))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == 'f':
                temporario = fatorial(entradas('f',memoria))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == 'logn':
                temporario = logaritmo_neperiano(entradas('logn',memoria))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            elif operacao == 'log':
                temporario = logaritmo(entradas('log',memoria))
                print(f'={formatacao(temporario)}')
                memoria = temporario
            decisao = entradas('d',0)
            if decisao == 'n' or decisao == 'x':
                break
        if decisao == 'x':
            break
def equacao_2_grau(a,b,c):
    delta = b**2-4*a*c
    if delta > 0 :
        raiz1 = (-b+raiz(delta,2))/(2*a)
        raiz2 = (-b-raiz(delta,2))/(2*a)
        limite_inferior = float(-50)
        limite_superior = float(50)                                 
        step = float(0.5)
        x=[]
        y=[]
        valoresxy = [0,0]
        temp = 0 
        valor = 0
        while limite_inferior <= limite_superior:
            x.append(limite_inferior)                                 #aqui eu adiciono os valores de x que serão colocados na f(x) através de step
            y.append(a*(limite_inferior**2)+b*limite_inferior+c)      #aqui são os valores da f(x)     
            limite_inferior+=step                                     #aqui e adionado o step 
            valor = a*(limite_inferior**2)+b*limite_inferior+c
            if temp == 0 :
                temp = 1
                valoresxy[1] = valor
            if a > 0:
                if valor < valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
            else:
                if valor > valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
                
        print(f'Essa equação tem raizes reais X1 = {formatacao(raiz1)} X2 = {formatacao(raiz2)}') 
        print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')      
    else:
        delta = delta*-1
        raiz1 = (-b/2*a)
        raiz1_2 = raiz(delta,2)/2*a
        limite_inferior = float(-100)
        limite_superior = float(100)
        step = float(0.5)
        x=[]
        y=[]
        valoresxy = [0,0]
        temp = 0 
        valor = 0
        while limite_inferior <= limite_superior:
            x.append(limite_inferior)
            y.append(a*(limite_inferior**2)+b*limite_inferior+c)
            limite_inferior+=step
            valor = a*(limite_inferior**2)+b*limite_inferior+c
            if temp == 0 :
                temp = 1
                valoresxy[1] = valor
            if a > 0:
                if valor < valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
            else:
                if valor > valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
        if a<0:
            print(f'Essa equação tem raizes complexas X1 = {formatacao(raiz1)}{formatacao(raiz1_2)}i e X2 = {formatacao(raiz1)}+{formatacao(-raiz1_2)}i')
            print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')
        else:
            print(f'Essa equação tem raizes complexas X1 = {formatacao(raiz1)}+{formatacao(raiz1_2)}i e X2 = {formatacao(raiz1)}{formatacao(-raiz1_2)}i')
            print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')
def input_2_grau():
    def verifica_entrada(letra):
        while True:
            entrada = input(f'Digite o valor de {letra} :')
            try:
                entrada = float(entrada)
                return entrada
            except:
                print('Formatado Digitado Inválido , por favor verifique sua entrada !!!')
            
    while True:
        while True:
            print('aX² + bX + c')
            a = verifica_entrada('a')
            b = verifica_entrada('b')
            c = verifica_entrada('c')
            if a != 0 :
                break
            else:
                print('O valor de a tem que ser diferente de zero !!!')
        equacao_2_grau(a,b,c)
        decisao = input('Deseja Fazer Outra operação S ou N :')
        if decisao == 'n':
            break

def trigonometria(funcao,graus,tipograu):
    if tipograu == 'g':
        graus = graus * 3.14159265358979323 / 180
        
    def seno(graus):
        termo = graus
        resultado = termo
        n = 1
        while abs(termo) >= 1e-10:
            termo *= -1 * graus**2 / ((2*n) * (2*n+1))
            resultado += termo
            n+=1
        return resultado
    def cosseno(graus):
        termo = 1
        resultado = termo
        n = 1
        while abs(termo) >= 1e-10:
            termo *= -1 * graus**2 / ((2*n-1) * (2*n))
            resultado += termo
            n+=1
        return resultado
    def tangente(graus):
        return seno(graus)/cosseno(graus)
    def secante(graus):
        return 1/cosseno(graus)
    def cossecante(graus):
        return 1/seno(graus)
    def cotangente(graus):
        return 1/tangente(graus)
    
    if funcao == 's':
        return seno(graus)
    elif funcao == 'c':
        return cosseno(graus)
    elif funcao == 't':
        return tangente(graus)
    elif funcao == 'sec':
        return secante(graus)
    elif funcao == 'cossec':
        return cossecante(graus)
    else:
        return cotangente(graus)
def raiz(valor,nraiz):
    estimativa = 1
    precisao = 0.000000000001
    if valor < 1 :
        print('Não existe raiz de zero ou número negativo , Por favor Veirifique o valor digitado !!!')
        return 0
    while True:
        prox_estimativa = ((nraiz-1) * estimativa + valor / (estimativa**(nraiz-1))) / nraiz
        if abs(prox_estimativa - estimativa) < precisao:
            return prox_estimativa
        estimativa = prox_estimativa
def formatacao(num):
    if num.is_integer():
        return int(num)
    else:
        return num
def input_2_grau():
    def converte_tg(input):
        if input == 'sin(x)':
            return 's'
        elif input == 'cos(x)':
            return 'c'
        elif input == 'tan(x)':
            return 't'
        elif input == 'sec(x)':
            return 'sec'
        elif input == 'cossec(x)':
            return 'cossec'
        elif input == 'cot(x)':
            return 'cot'
    def verifica_entrada(letra):
        entradas_trigonometricas = ['sin(x)','cos(x)','tan(x)','sec(x)','cossec(x)','cot(x)']
        while True:
            entrada = input(f'Digite o valor da letra {letra} :')
            try:
                entrada = float(entrada)
                return entrada
            except:
                if entrada in entradas_trigonometricas:
                    for i in entradas_trigonometricas:
                        if i == entrada:
                            return trigonometria(converte_tg(i),letra,'g')
                else:
                    print('Formato digitado Invalido !!!')
    while True:
        while True:
            print('aX² + bX + c')
            a = verifica_entrada('a')
            b = verifica_entrada('b')
            c = verifica_entrada('c')
            if a != 0 :
                break
            else:
                print('O valor de a tem que ser diferente de zero !!!')
        equacao_2_grau(a,b,c)
        decisao = input('Deseja Fazer Outra operação S ou N :')
        if decisao == 'n':
            break

def equacao_2_grau(a,b,c):
    def calcularfx(a,b,c):
        limite_inferior = float(-50)
        limite_superior = float(50)                                 
        step = float(0.5)
        x=[]
        y=[]
        valoresxy = [0,0]
        temp = 0 
        valor = 0
        while limite_inferior <= limite_superior:
            x.append(limite_inferior)                                 #aqui eu adiciono os valores de x que serão colocados na f(x) através de step
            y.append(a*(limite_inferior**2)+b*limite_inferior+c)      #aqui são os valores da f(x)     
            limite_inferior+=step                                     #aqui e adionado o step 
            valor = a*(limite_inferior**2)+b*limite_inferior+c
            if temp == 0 :
                temp = 1
                valoresxy[1] = valor
            if a > 0:
                if valor < valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
            else:
                if valor > valoresxy[1]:
                    valoresxy[0] = limite_inferior
                    valoresxy[1] = valor
        return valoresxy
    delta = b**2-4*a*c
    if delta > 0 :
        raiz1 = (-b+raiz(delta,2))/(2*a)
        raiz2 = (-b-raiz(delta,2))/(2*a)
        valoresxy = calcularfx(a,b,c)        
        print(f'Essa equação tem raizes reais X1 = {formatacao(raiz1)} X2 = {formatacao(raiz2)}') 
        print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')      
    elif delta < 0 :
        delta = delta*-1
        raiz1 = (-b/2*a)
        raiz1_2 = raiz(delta,2)/2*a
        valoresxy = calcularfx(a,b,c)
        if a<0:
            print(f'Essa equação tem raizes complexas X1 = {formatacao(raiz1)}{formatacao(raiz1_2)}i e X2 = {formatacao(raiz1)}+{formatacao(-raiz1_2)}i')
            print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')
        else:
            print(f'Essa equação tem raizes complexas X1 = {formatacao(raiz1)}+{formatacao(raiz1_2)}i e X2 = {formatacao(raiz1)}{formatacao(-raiz1_2)}i')
            print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')
    else:
        raiz1 = -b/2*a
        valoresxy = calcularfx(a,b,c)
        print(f'Essa equação tem apenas uma raiz x = {raiz1}') 
        print(f'Ponto de Inflexão  ({formatacao(valoresxy[0])},{formatacao(valoresxy[1])})')

input_2_grau()



def conversor_tempo():
    def hora(valor,operador):
        if operador == 'm':
            minuto = valor * 60
            return minuto
        elif operador == 's':
            segundos = valor * 3600
            return segundos
        elif operador == 'd':
            dia = valor / 24
            return dia
        elif operador == 'sem':
            semana = valor / 168
            return semana
        elif operador == 'mes':
            mes = valor / 730
            return mes
        elif operador == 'ano':
            ano = valor / 8760
            return ano
        elif operador == 'dec':
            decada = valor / 87600
            return decada
        elif operador == 'sec':
            seculo = valor / 876000
            return seculo
        
    def minuto(valor,operador):
        if operador == 'h':
            hora = valor / 60
            return hora
        elif operador == 's':
            segundos = valor * 60
            return segundos
        elif operador == 'd':
            dia = valor / 1440
            return dia
        elif operador == 'sem':
            semana = valor / 10080
            return semana
        elif operador == 'mes':
            mes = valor / 43800
            return mes
        elif operador == 'ano':
            ano = valor / 525600
            return ano
        elif operador == 'dec':
            decada = valor / 5.256e+6
            return decada
        elif operador == 'sec':
            seculo = valor / 5.256e+7
            return seculo
            
    def segundo(valor,operador):
        if operador == 'h':
            hora = valor / 3600
            return hora 
        elif operador == 'm':
            minuto = valor / 60
            return minuto 
        elif operador == 'd':
            dia = valor / 86400
            return dia
        elif operador == 'sem':
            semana = valor / 604800
            return semana
        elif operador == 'mes':
            mes = valor / 2.628e+6
            return mes
        elif operador == 'ano':
            ano = valor / 3.154e+7
            return ano
        elif operador == 'dec':
            decada = valor / 3.154e+8
            return decada
        elif operador == 'sec':
            seculo = valor / 3.154e+9
            return seculo
        
    def dia(valor , operador):
        if operador == 'h':
            hora = valor * 24
            return hora 
        elif operador == 'm':
            minuto = valor * 1440
            return minuto 
        elif operador == 's':
            dia = valor * 86400
            return dia
        elif operador == 'sem':
            semana = valor / 7
            return semana
        elif operador == 'mes':
            mes = valor / 30.417
            return mes
        elif operador == 'ano':
            ano = valor / 365
            return ano
        elif operador == 'dec':
            decada = valor / 3650
            return decada
        elif operador == 'sec':
            seculo = valor / 36500
            return seculo

    def semana(valor,operador):
        if operador == 'h':
            hora = valor * 168
            return hora 
        elif operador == 'm':
            minuto = valor * 10080
            return minuto 
        elif operador == 's':
            segundos = valor * 604800
            return segundos
        elif operador == 'd':
            dias = valor / 7
            return dias
        elif operador == 'mes':
            mes = valor / 4.345
            return mes
        elif operador == 'ano':
            ano = valor / 52.143
            return ano
        elif operador == 'dec':
            decada = valor / 521.4
            return decada
        elif operador == 'sec':
            seculo = valor / 5214
            return seculo

    def mes(valor,operador):
        if operador == 'h':
            hora = valor * 730
            return hora 
        elif operador == 'm':
            minuto = valor * 43800
            return minuto 
        elif operador == 's':
            segundos = valor * 2.628e+6
            return segundos
        elif operador == 'd':
            dias = valor * 30.417
            return dias
        elif operador == 'sem':
            semanas = valor * 4.345
            return semanas
        elif operador == 'ano':
            anos = valor / 12
            return anos
        elif operador == 'dec':
            decadas = valor / 120
            return decadas
        elif operador == 'sec':
            seculos = valor / 1200
            return seculos

    def ano(valor,operador):
        if operador == 'h':
            hora = valor * 8760
            return hora 
        elif operador == 'm':
            minuto = valor * 525600
            return minuto 
        elif operador == 's':
            dia = valor * 3.154e+7
            return dia
        elif operador == 'sem':
            semana = valor *52.143
            return semana
        elif operador == 'mes':
            mes = valor * 12
            return mes
        elif operador == 'd':
            ano = valor * 365
            return ano
        elif operador == 'dec':
            decada = valor / 10
            return decada
        elif operador == 'sec':
            seculo = valor / 100
            return seculo

    def decada(valor, operador):
        if operador == 'h':
            hora = valor * 87600
            return hora 
        elif operador == 'm':
            minuto = valor * 5.256e+6
            return minuto 
        elif operador == 's':
            dia = valor * 3.154e+8
            return dia
        elif operador == 'sem':
            semana = valor *521.4
            return semana
        elif operador == 'mes':
            mes = valor * 120
            return mes
        elif operador == 'ano':
            ano = valor * 10
            return ano
        elif operador == 'd':
            decada = valor * 3650
            return decada
        elif operador == 'sec':
            seculo = valor / 10
            return seculo

    def seculo(valor,operador):
        if operador == 'h':
            hora = valor * 876000
            return hora 
        elif operador == 'm':
            minuto = valor * 5.256e+7
            return minuto 
        elif operador == 's':
            dia = valor * 3.154e+9
            return dia
        elif operador == 'sem':
            semana = valor * 5214
            return semana
        elif operador == 'mes':
            mes = valor * 1200
            return mes
        elif operador == 'ano':
            ano = valor * 100
            return ano
        elif operador == 'dec':
            decada = valor * 10
            return decada
        elif operador == 'd':
            seculo = valor * 36500
            return seculo

    def converter_entrada(entrada):
        if entrada == '1':
            return 's','Segundos'
        elif entrada == '2':
            return 'm','Minutos'
        elif entrada == '3':
            return 'h','Horas'
        elif entrada == '4':
            return 'd','Dias'
        elif entrada == '5':
            return 'sem','Semana'
        elif entrada == '6':
            return 'mes','Mês'
        elif entrada == '7':
            return 'ano','Anos'
        elif entrada == '8':
            return 'dec','Décadas'
        else:
            return 'sec','Séculos'

    def fazer_operacao(valor,unidade1,unidade2):
        if unidade1[0]== 's':
            return segundo(valor,unidade2[0])
        elif unidade1[0] == 'm':
            return minuto(valor,unidade2[0])
        elif unidade1[0] == 'h':
            return hora(valor,unidade2[0])
        elif unidade1[0] == 'd':
            return dia(valor,unidade2[0])
        elif unidade1[0] == 'sem':
            return semana(valor,unidade2[0])
        elif unidade1[0] == 'mes':
            return mes(valor,unidade2[0])
        elif unidade1[0] == 'ano':
            return ano(valor,unidade2[0])
        elif unidade1[0] == 'dec':
            return decada(valor,unidade2[0])
        elif unidade1[0] == 'sec':
            return seculo(valor,unidade2[0])
        else:
            print('Erro na operação !!!')   
        
    def validacao_entradas(str,operador):
        escolhas_possiveis = ['1','2','3','4','5','6','7','8','9']
        if operador == 1:
            while True:
                entrada = input(str)
                try:
                    entrada = float(entrada)
                    if entrada > 0:
                        return entrada
                    else:
                        print('O valor tem que ser maior que zero.')
                except:
                    print('Formato digitado Invalido ')
        else:
            while True:
                entrada = input(str)
                validador_entradas = [True for i in escolhas_possiveis if i == entrada]
                try:
                    validador_entradas[0]
                    return converter_entrada(entrada)
                except:
                    print('Opção digitada Invalida , por favor verifique !!!')

    def menu_conversao():
        print('\n   CONVERSOR DE TEMPO    ')
        print('1 - Segundos  2 - Minutos  ')
        print('3 - Horas     4 - Dias     ')
        print('5 - Semanas   6 - Mêses    ')
        print('7 - Anos      8 - Décadas  ')
        print('      9 - Séculos          ')

    str1 = 'Digite a unidade de tempo do valor acima :'
    str2 = 'Digite o valor a ser convertido :'
    str3 = 'Digite agora para qual unidade ela será convertida :'  

    while True:
        menu_conversao()
        valor = validacao_entradas(str2,1)
        unidade1 = validacao_entradas(str1,0)                   #a unidade 1 e 2 recebem um retorno como vertor dessa função sendo [0] recebendo aa letra para operação
        unidade2 = validacao_entradas(str3,0)                   #e [1] recebendo o nome
        if unidade1 != unidade2:
            print(f'O Valor {valor} em {unidade1[1]} representa {fazer_operacao(valor,unidade1[0],unidade2[0])} na unidade {unidade2[1]}')
        else:
            print('Você não pode converter o valor para unidades iguais , por favor verifique suas entradas !!!')
        
        d = input('Digite qualquer coisa para fazer outra operação ou n para sair :')
        if d == 'n':
            break

conversor_tempo()
'''
def conversor_energia():
    def joule(valor,operador):
        if operador == 'qj':
                quilojaule = valor / 1000
                return quilojaule
        elif operador == 'gc':
            gramcalorie = valor / 4.184
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor / 4184
            return quilocalorie
        elif operador == 'w':
            watthora = valor / 3600
            return watthora
        elif operador == 'qw':
            quilowatthora = valor / 3.6e+6
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 6.242e+18
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor / 1055
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor / 1.055e+8
            return therm
        elif operador == 'plf':
            pelibraforca = valor / 1.356
            return pelibraforca
    def quilojaule(valor, operador):
        if operador == 'j':
            joule = valor * 1000
            return joule
        elif operador == 'gc':
            gramcalorie = valor * 239.006
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor / 4.184
            return quilocalorie
        elif operador == 'w':
            watthora = valor / 3.6
            return watthora
        elif operador == 'qw':
            quilowatthora = valor / 3.600
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 6.242e+21
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor / 1.055
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor / 105500
            return therm
        elif operador == 'plf':
            pelibraforca = valor * 737.562
            return pelibraforca
    def gramcalorie(valor, operador):
        if operador == 'j':
            joule = valor * 4.184
            return joule
        elif operador == 'qj':
            quilojaule = valor / 239.006
            return quilojaule
        elif operador == 'q':
            quilocalorie = valor / 1000
            return quilocalorie
        elif operador == 'w':
            watthora = valor / 860.4
            return watthora
        elif operador == 'qw':
            quilowatthora = valor / 860400
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 2.611e+19
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor / 252.164
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor / 2.521e+7
            return therm
        elif operador == 'plf':
            pelibraforca = valor * 0.3086
            return pelibraforca
    def quilocalorie(valor, operador):
        if operador == 'j':
            joule = valor * 4184
            return joule
        elif operador == 'qj':
            quilojaule = valor * 4.184
            return quilojaule
        elif operador == 'gc':
            gramcalorie = valor * 1000
            return gramcalorie
        elif operador == 'w':
            watthora = valor * 1.16222
            return watthora
        elif operador == 'qw':
            quilowatthora = valor / 860,42229526251484228459327838103
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 2.611e+22
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor * 3.96567
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor / 25210
            return therm
        elif operador == 'plf':
            pelibraforca = valor * 3085.96
            return pelibraforca
    def watthora(valor, operador):
        if operador == 'j':
            joule = valor * 3600
            return joule
        elif operador == 'qj':
            quilojaule = valor * 3.6
            return quilojaule
        elif operador == 'gc':
            gramcalorie = valor * 860,421
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor / 1,1622217495853773908354166158195
            return quilocalorie
        elif operador == 'qw':
            quilowatthora = valor / 1000
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 2.247e+22
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor * 3.41214
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor / 29300
            return therm
        elif operador == 'plf':
            pelibraforca = valor * 2655.22
            return pelibraforca
    def quilowatthora(valor, operador):
        if operador == 'j':
            joule = valor * 3.6e+6
            return joule
        elif operador == 'qj':
            quilojaule = valor * 3600
            return quilojaule
        elif operador == 'gc':
            gramcalorie = valor * 860400
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor * 860.421
            return quilocalorie
        elif operador == 'w':
            watthora = valor * 1000
            return watthora
        elif operador == 'e':
            eletronvolt = valor * 2.247e+25
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor * 3412.14
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor / 29.3
            return therm
        elif operador == 'plf':
            pelibraforca = valor * 2.655e+6
            return pelibraforca
    def eletronvolt(valor, operador):
        if operador == 'j':
            joule = valor / 6.242e+18
            return joule
        elif operador == 'qj':
            quilojaule = valor / 6.242e+21
            return quilojaule
        elif operador == 'gc':
            gramcalorie = valor / 2.611e+19
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor * 2.611e+22
            return quilocalorie
        elif operador == 'w':
            watthora = valor / 2.247e+22
            return watthora
        elif operador == 'qw':
            quilowatthora = valor / 2.247e+25
            return quilowatthora
        elif operador == 'utb':
            unidadetermicabritanica = valor / 6.585e+21
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor / 6.584e+26
            return therm
        elif operador == 'plf':
            pelibraforca = valor / 8,462e+18
            return pelibraforca
    def unidadetermicabritanica(valor, operador):
        if operador == 'j':
            joule = valor * 1055
            return joule
        elif operador == 'qj':
            quilojaule = valor * 1.055
            return quilojaule
        elif operador == 'gc':
            gramcalorie = valor * 252.164
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor / 3.966
            return quilocalorie
        elif operador == 'w':
            watthora = valor / 3.412
            return watthora
        elif operador == 'qw':
            quilowatthora = valor / 3412.1424501230077353269344288585
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 6,585e+21
            return eletronvolt
        elif operador == 't':
            therm = valor / 99980
            return therm
        elif operador == 'plf':
            pelibraforca = valor * 778.169
            return pelibraforca
    def therm(valor, operador):
        if operador == 'j':
            joule = valor * 1.055e+8
            return joule
        elif operador == 'qj':
            quilojaule = valor * 105500
            return quilojaule
        elif operador == 'gc':
            gramcalorie = valor * 2.521e-8
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor * 25210.4
            return quilocalorie
        elif operador == 'w':
            watthora = valor * 29300.1
            return watthora
        elif operador == 'qw':
            quilowatthora = valor * 29.3
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 6.584e+26
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor * 99976.1
            return unidadetermicabritanica
        elif operador == 'plf':
            pelibraforca = valor * 7.78e+7
            return pelibraforca
    def pelibraforca(valor, operador):
        if operador == 'j':
            joule = valor * 0.737562
            return joule
        elif operador == 'qj':
            quilojaule = valor * 0.000737562
            return quilojaule
        elif operador == 'gc':
            gramcalorie = valor * 0.000176111
            return gramcalorie
        elif operador == 'q':
            quilocalorie = valor * 0.00017611
            return quilocalorie
        elif operador == 'w':
            watthora = valor * 6.585e-7
            return watthora
        elif operador == 'qw':
            quilowatthora = valor * 6.585e-10
            return quilowatthora
        elif operador == 'e':
            eletronvolt = valor * 8.462e+18
            return eletronvolt
        elif operador == 'utb':
            unidadetermicabritanica = valor * 0.0001839
            return unidadetermicabritanica
        elif operador == 't':
            therm = valor * 5.775e-13
            return therm 


    def menu_conversao():
            print('\n   CONVERSOR DE ENERGIA    ')
            print('1 - Jaule           2  - Quilojaule                 ')
            print('3 - Gram Calorie    4  - Quilocaloria               ')
            print('5 - Watt-Hora       6  - Quilowatt-hora             ')
            print('7 - Elétron-volt    8  - Unidade Térmica Britânica  ')
            print('9 - Therm           10 - Pé-libra força             ')
    def validacao_entradas(str,operador):
            escolhas_possiveis = ['1','2','3','4','5','6','7','8','9','10']
            if operador == 1:
                while True:
                    entrada = input(str)
                    try:
                        entrada = float(entrada)
                        if entrada > 0:
                            return entrada
                        else:
                            print('O valor tem que ser maior que zero.')
                    except:
                        print('Formato digitado Invalido ')
            else:
                while True:
                    entrada = input(str)
                    validador_entradas = [True for i in escolhas_possiveis if i == entrada]
                    try:
                        validador_entradas[0]
                        return converter_entrada(entrada)
                    except:
                        print('Opção digitada Invalida , por favor verifique !!!')
    def converter_entrada(entrada):
        if entrada == '1':
            return 'j','Joule'
        elif entrada == '2':
            return 'qj','Quilojaule'
        elif entrada == '3':
            return 'gc','Gram Calorie'
        elif entrada == '4':
            return 'q','Quilocaloria'
        elif entrada == '5':
            return 'w','Watt Hora'
        elif entrada == '6':
            return 'qw','Quilowatt Hora'
        elif entrada == '7':
            return 'e','Elétron Volt '
        elif entrada == '8':
            return 'utb','Unidade Térmica Britânica'
        elif entrada == '9':
            return 't','Therm'
        else:
            return 'plf','Pé Libra Força'
    def fazer_operacao(valor,unidade1,unidade2):
            if unidade1[0]== 'j':
                return joule(valor,unidade2[0])
            elif unidade1[0] == 'qj':
                return quilojaule(valor,unidade2[0])
            elif unidade1[0] == 'gc':
                return gramcalorie(valor,unidade2[0])
            elif unidade1[0] == 'q':
                return quilocalorie(valor,unidade2[0])
            elif unidade1[0] == 'w':
                return watthora(valor,unidade2[0])
            elif unidade1[0] == 'qw':
                return quilowatthora(valor,unidade2[0])
            elif unidade1[0] == 'e':
                return eletronvolt(valor,unidade2[0])
            elif unidade1[0] == 'utb':
                return unidadetermicabritanica(valor,unidade2[0])
            elif unidade1[0] == 't':
                return therm(valor,unidade2[0])
            elif unidade1[0] == 'plf':
                return pelibraforca(valor,unidade2[0])
            else:
                print('Erro na operação !!!') 

    str1 = 'Digite a unidade de energia do valor acima :'
    str2 = 'Digite o valor a ser convertido :'
    str3 = 'Digite agora para qual unidade de energia ela será convertida :'  

    while True:
        menu_conversao()
        print('\n')
        valor = validacao_entradas(str2,1)
        unidade1 = validacao_entradas(str1,0)                   #a unidade 1 e 2 recebem um retorno como vertor dessa função sendo [0] recebendo aa letra para operação
        unidade2 = validacao_entradas(str3,0)                   #e [1] recebendo o nome
        if unidade1 != unidade2:
            print(f'\nO Valor {valor} em {unidade1[1]} representa {fazer_operacao(valor,unidade1,unidade2)} na unidade {unidade2[1]}')
        else:
            print('Você não pode converter o valor para unidades iguais , por favor verifique suas entradas !!!')
            
        d = input('Digite qualquer coisa para fazer outra operação ou n para sair :')
        if d == 'n':
            break
        
conversor_energia()
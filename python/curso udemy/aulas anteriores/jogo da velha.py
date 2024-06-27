import os
jogo = [[0,0,0],
        [0,0,0],
        [0,0,0]]
char_jogador1=''
char_jogador2=''
char = ''
jogador1 = 0
jogador2 = 0
local_jogolinha = ''
local_jogocoluna = 0
cont = 0


def mostra_jogo():
    print('   A', ' B', ' C')
    print(f'0  {jogo[0][0]}  {jogo[0][1]}  {jogo[0][2]}')
    print(f'1  {jogo[1][0]}  {jogo[1][1]}  {jogo[1][2]}')
    print(f'2  {jogo[2][0]}  {jogo[2][1]}  {jogo[2][2]}')

def modifica_jogo(linha,coluna,char):
    letra=char
    if coluna == 'a':
         c = 0
    if coluna == 'b':
        c = 1
    if coluna == 'c':
        c = 2
    l = int(linha)
    jogo[l][c]=letra



while True:
    os.system('cls')
    print('BEM VINDO AO JOGO DA VELHA !!!')
    mostra_jogo()
    char = input('Digite o X OU O PARA COMEÇAR :').lower()
    char_jogador1 = char
    if char_jogador1 == 'x':
        char_jogador2 = 'O'
    else:
        char_jogador2='x'

    for i in range(0,9):

        local_jogolinha = input('Jogador 1 digite a linha onde deseja jogar :')
        local_jogocoluna = input('Jogador 1 digite a coluna onde deseja jogar :')
        modifica_jogo(local_jogolinha,local_jogocoluna,char_jogador1)
        mostra_jogo()



        local_jogolinha = input('Jogador 2 digite a linha onde deseja jogar :')
        local_jogocoluna = input('Jogador 2 digite a coluna onde deseja jogar :')
        modifica_jogo(local_jogolinha, local_jogocoluna,char_jogador2)
        mostra_jogo()










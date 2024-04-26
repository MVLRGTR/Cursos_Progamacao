import os

class jogo_da_velha:

    def __init__(self):
        self.buffer = [['','',''],
                       ['','',''],
                       ['','','']]

    def mostra_jogo(self):
        print('          COLUNAS\n')
        print('  L        0', '   1', '   2')
        print(f'  I    0   {self.buffer[0][0]}    {self.buffer[0][1]}    {self.buffer[0][2]}')
        print('  N                                                                       ')
        print(f'  H    1   {self.buffer[1][0]}    {self.buffer[1][1]}    {self.buffer[1][2]}')
        print('  A                                                                       ')
        print(f'  S    2   {self.buffer[2][0]}    {self.buffer[2][1]}    {self.buffer[2][2]}')

    def modifica_jogo(self,linha,coluna,char):
        self.buffer[linha][coluna] = char

    def verifica_termino(self):
        buffer = []
        valid = False
        contador = 0

        for i in range(0,3):
            buffer.clear()
            valid = False
            for j in range(0,3):
                buffer.append(self.buffer[i][j])
                if j == 2 and buffer[0] == buffer[1] == buffer[2]:
                    if buffer[1] == 'X' or buffer[1] == '0':
                        valid = True
                        return valid, buffer[2]

        for i in range(0,3):
            buffer.clear()
            valid = False
            for j in range(0,3):
                buffer.append(self.buffer[j][i])
                if j == 2 and buffer[0] == buffer[1] == buffer[2]:
                    if buffer[1] == 'X' or buffer[1] == '0':
                        valid = True
                        return valid, buffer[2]

        buffer.clear()
        valid = False
        for i in range(0,3):
            buffer.append(self.buffer[i][i])
            if i == 2 and buffer[0] == buffer[1] == buffer[2]:
                if buffer[1] == 'X' or buffer[1] == '0':
                    valid = True
                    return valid, buffer[2]

        buffer.clear()
        valid = False
        for i in range(0, 3):
            buffer.append(self.buffer[i][2-i])
            if i == 2 and buffer[0] == buffer[1] == buffer[2]:
                if buffer[1] =='X' or buffer[1] == '0':
                    valid = True
                    return valid, buffer[2]

        contador = 0
        for i in range(0,3):
            for j in range(0,3):
                if self.buffer[i][j] != '':
                    contador = contador + 1

        if contador == 9:
            valid = True
            return valid ,''

        return valid , ''

    def verifica_disponibilidade_entrada(self,linha,coluna):
        if self.buffer[linha][coluna] == '':
            return True

    def entradas_jogador(self,nome,char):
        while True:                                                                                                     #AQUI EU TENHO METODO DE ENTRADAS DOS JOGADORES QUE SERÁ ACESSADO ATRAVES DE FERRAMENTA DO JOGADOR
            linha = int(input(f'{nome} por favor digite a linha onde deseja Jogar :'))                                  #O CHAR QUE PODE SER X OU 0(ZERO NUMERICO)  SERÁ DADO A AMBOS OS JOGADORES PELO MENU  E NÃO PELO OBJETOS
            coluna =int(input(f'{nome} por favor digite a coluna onde deseja jogar :'))

            if linha <= 2 and coluna <= 2:
                if self.verifica_disponibilidade_entrada(linha,coluna) == True:
                    self.modifica_jogo(linha,coluna,char)
                    break
                else:
                    print('\n')
                    print(f'{nome.upper()} A POSIÇÃO INFORMADA JA TEM UM VALOR , POR FAVOR VERIFIQUE SUA JOGADA !!!')
                    print('\n')
            else:
                print(f'\njogador {nome.upper()} posição digita invalida !!!\n')

    def limpar_buffer(self):

        for i in range(0,3):
            for j in range(0,3):
                self.buffer[i][j] = ''

class jogador:

    def __init__(self):
        self.nome = ''
        self.__ferramenta = None
        self.char_do_jogador = ''

    def getter_ferramenta(self):
        return self.__ferramenta

    def setter_ferramenta(self,ferramenta):
        self.__ferramenta = ferramenta

    def setter_char(self):
        while True:
            char = str(input('Digite X ou 0 (zero númerico) para começar:'))
            if char == 'x' or char == '0':
                self.char_do_jogador = char.upper()
                break
            else:
                print('O que foi digitado é inválido , Por favor verifique!!!\n')

    def setter_nome(self,nome):
        self.nome = nome

jogo = jogo_da_velha()
jogador1 = jogador()
jogador2 = jogador()

jogador1.setter_ferramenta(jogo)
jogador2.setter_ferramenta(jogo)

decide = ''

os.system('cls')
print('          BEM VINDO AO JOGO DA VELHA !!!')

jogador1.setter_nome(str(input('Digite o nome do Jogador 1 :')))
jogador1.setter_char()
print('\n')
jogador2.setter_nome(str(input('Digite o nome do Jogador 2 :')))

if jogador1.char_do_jogador == 'X':
    jogador2.char_do_jogador = '0'
else:
    jogador2.char_do_jogador = 'X'

while True:
    jogo.limpar_buffer()

    while True:
        jogo.mostra_jogo()
        jogador1.getter_ferramenta().entradas_jogador(jogador1.nome,jogador1.char_do_jogador)
        if jogo.verifica_termino()[0] == True:
            if jogo.verifica_termino()[1] == jogador1.char_do_jogador:
                print('\n')
                print(f'O JOGADOR {jogador1.nome} VENCEU O JOGO !!!')
                os.system('Pause')
                break

            elif jogo.verifica_termino()[1] == jogador2.char_do_jogador:
                print('\n')
                print(f'O JOGADOR {jogador2.nome} VENCEU O JOGO !!!')
                os.system('Pause')
                break

            else:
                print('Essa rodada não teve vencedores !!!')
                os.system('Pause')
                break
        jogo.mostra_jogo()
        jogador2.getter_ferramenta().entradas_jogador(jogador2.nome,jogador2.char_do_jogador)

    decide = input('Digite s para sair , ou qualquer coisa para jogar novamente :')
    if decide == 's':
        break
    else:
        print('\n')
        print('VAMOS JOGAR NOVAMENTE !!!\n')


















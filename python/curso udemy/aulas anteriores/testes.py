#import random
#computador = 0
#palpite = 1
#contador = 0
#while computador != palpite:
#    computador = random.randint(0,10)
#    palpite = int(input('Digite um numero de 1 a 10: '))
#    if computador != palpite:
#        contador = contador + 1
#print('Voce acertou o numero escolhido pelo computador que foi {} e precisou de {} tentativas :'.format(computador,contador))

#print('Progama para mostrar a sequencia fibonacci !!')
#j = int(input('Digite um numero até onde deseja mostra a sequencia fibonacci :'))
#x = 0
#a = 0
#b = 1
#for i in range (0,j):
#    x = a + b
#    a = b
#    b = x
#    print(f'{x} ')

#fatura = []
#total = float()
#while True:
#    produto = str(input('Digite o nome do produto :'))
#    valor = float(input('Digite o valor do produto :'))
#    while True:
#        unidades = int(input('Digite quantas unidades do produto voce vai levar :'))
#        if unidades > 0 :
#            break
#    valor = valor * unidades
#    fatura.append([produto,valor,unidades])
#    total += valor
#    d =  str(input('Deseja cadastrar mais algum produto S/N :')).lower()
#    print('\n')
#    if d == 'n':
#        break
#for i in fatura:
#    if i[2]>1:
#        print(f'PRODUTO : {i[0]}  VALOR :R$ {i[1]:.2f}  UNIDADES : {i[2]} PREÇO UNITARIO :R${i[1]/i[2]:.2f}')
#    else:
#        print(
#            f'PRODUTO : {i[0]}  VALOR :R$ {i[1]:.2f}  UNIDADES : {i[2]}')
#print(f'{total:.2f}')

#import comanda
#import listas
#comanda=[['vicente','arroz',2,10,'feijao',3,15,'chocolate',2,5],['joao','alface',3,9,'cacau',3,5,'biscoito',5,4],['luciano','leite',2,5,'alface',5,2,'sorvete',1,7]]
#def valida_produto():
#    valid = False
#    while valid == False:
#        produto = input('Digite o nome do produto :')
#        try:
#            produto= str(produto)
#            if len(produto) == 0:
#                print('Voce precisa digitar algo !!!')
#            else:
#                valid = True
#        except:
#            print('Formato digitado invalido !!!')
#    return produto
#def valida_valor():
#    valid = False
#    while valid == False:
#        valor = input('Digite o valor individual do produto :')
#        try:
#            valor = float(valor)
#            if valor <= 0:
#                print('O VALOR DIGITAO PRECISA SER MAIOR QUE ZERO !!! ')
#            else:
#                valid = True
#        except:
#            print('Formato digitado invalido , use o . para separar as casas decimais')
#    return valor
#def valida_quantidade():
#    valid = False
#    while valid == False:
#        quantidade = input('Digite a quantidade do produto :')
#        try:
#            quantidade=int(quantidade)
#            if quantidade <= 0 :
#                print('Não e possivel ter 0 quantidade de um produto')
#            else:
#                valid = True
#        except:
#            print('Formato digitado invalido !!!')
#    return quantidade
#def cadastra_comanda_existente(nome,produto):
#    op = 0
#    ncomanda=0
#    for i in comanda:
#        ncomanda+=1
#        if i[0] == nome:
#            individual=i
#            break
#    contador = 0
#    limite = (len(individual)-3)
#    for c in individual:
#        if c == produto:
#            op=1
#   if op == 1:
#        for d in range(0,limite,3):
#            if individual[d+1]== produto:
#                valor_individual = individual[d+3]/individual[d+2]
#                valor_quantidade = individual[d+2]
#                quantidade = valida_quantidade()
#                quantidade+=valor_quantidade
#                individual.insert(d+2,quantidade)
#                individual.insert(d+3,valor_individual*quantidade)
#                del individual[d+5]
#                del individual[d+4]
#    else:
#        quantidade = valida_quantidade()
#        valor = valida_valor()
#        valor = valor * quantidade
#        individual.append(produto)
#        individual.append(quantidade)
#        individual.append(valor)
#    del comanda[ncomanda-1]
#    comanda.insert(ncomanda-1,individual)
#def deleta_produto_comanda(nome,produto):
#    ncomanda=0
#    cont=0
#    for i in comanda:
#        ncomanda+=1
#        if i[0]==nome:
#            individual=i
#    limite = (len(individual))
#    for d in range(0,10):
#        if individual[d] == produto:
#            del individual[d]
#            del individual[d]
#            del individual[d]
#            break
#nome ='joao'
#produto='alface'
#deleta_produto_comanda(nome,produto)
#print(comanda)
#print("rol")
#os.system("cls")

#arq = open('zxt.txt','w')
#texto = """
#Lista de Alunos
#---
#João da Silva
#José Lima
#Maria das Dores
#"""
#arq.write(texto)
#arq.close()

#func = {'nomes':[],'idades':[],'sexo':'m'}
#func['nomes'].append('joao')
#print(func['nomes'][0])

#x=[i for i in range(0,31)]
#print(x)

#string = 'Print every word in this sentence that has an even number of letters'
#str = string.split()
#for i in str:
#    if len(i)%2==0:
#        print(i,' :Possui comprimento par')
#    else:
#        print(i,' :Possui comprimento impar')

#num = int(input('DIGITE UM NUMERO!!! :'))
#for i in range(2,num):
#    if num % i==0:
#        print('Não e primo')
#        break
#else:
#    print('E primo')

# Tic Tac Toe


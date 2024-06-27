import os
comandas = []

def decisao():
    valid = False
    while valid == False:
        decisao = input('Digite a opção desejada :')
        try:
            decisao=int(decisao)
            if decisao > 6 or decisao < 0:
                print('Opção digitada invalida !!!')
            else:
                valid == True
        except:
            print('Formato Digitado invalido !!!')
    return decisao

def valida_quantidade():
    valid = False
    while valid == False:
        quantidade = input('Digite a quantidade do produto :')
        try:
            quantidade=int(quantidade)
            if quantidade == 0 :
                print('Não e possivel ter 0 quantidade de um produto')
            elif quantidade<0:
                print('Não e possivel ter quantidades menores que 0')
            else:
                valid = True
        except:
            print('Formato digitado invalido !!!')
    return quantidade

def valida_valor():
    valid = False
    while valid == False:
        valor = input('Digite o valor individual do produto :')
        try:
            valor = float(valor)
            if valor <= 0:
                print('O VALOR DIGITAO PRECISA SER MAIOR QUE ZERO !!! ')
            else:
                valid = True
        except:
            print('Formato digitado invalido , use o . para separar as casas decimais')
    return valor

def valida_produto():
    valid = False
    while valid == False:
        produto = input('Digite o nome do produto :')
        try:
            produto= str(produto)
            if len(produto) == 0:
                print('Voce precisa digitar algo !!!')
            else:
                valid = True
        except:
            print('Formato digitado invalido !!!')
    return produto

def valida_nome():
    valid = False
    while valid == False:
        nome = input('Digite o nome da comanda :')
        try:
            nome = str(nome)
            if len(nome) < 3:
                print('Nome muito pequeno !!!')
            else:
                valid = True
        except:
            print('Formato Digitado Invalido !!!')
    return nome

def comanda_existe(nome):
    valid = False
    for i in comandas:
        if i['nome']== nome:
            valid = True
    return valid

def mostra_comanda(nome):
    individual = comandas[numero_individual_comanda(nome)]
    print(individual)

def numero_individual_comanda(nome):
    cont = 0
    for i in comandas:
        cont += 1
        if i['nome'] == nome:
            break
    cont = cont - 1
    return cont

def produto_existe(ncomanda,nome_produto):
    valid = False
    c = comandas[ncomanda]['produto']
    print(nome_produto)
    for i in c:
        if nome_produto == i:
            valid = True
    return valid

def adiciona_produto_comanda(nome,nome_produto):
    ncomanda = numero_individual_comanda(nome)
    individual = comandas[ncomanda]
    if produto_existe(ncomanda,nome_produto) == True :
        print('correto')



while True:
    os.system('cls ')
    print(' BEM VINDO AO ORGANIZADOR DE COMANDA !!!\n\n')
    print('1 - para cadastrar uma comanda')
    print('2 - para vizualizar uma comanda especifica')
    print('3 - para adicionar um produto a uma comanda especifica')
    print('4 - para vizualizar o nome de todas as comandas')
    print('5 - para apagar um produto de uma comanda')
    print('6 - para guarda todas as  comandas')
    decisao = int(input('Digite sua opção :'))

    if decisao == 1:
        nome = valida_nome()
        individual = {'nome': nome, 'produto': [], 'valor': [], 'quantidade': []}

        while True:
            individual['produto'].append(valida_produto())
            individual['valor'].append(valida_valor())
            individual['quantidade'].append(valida_quantidade())


            d = input('Digite S/N para cadastrar mais produtos nessa comanda :')
            if d == 'n':
                comandas.append(individual)
                del individual
                break

    if decisao == 2:
        while True:
            nome = valida_nome()
            if comanda_existe(nome) == True:
                mostra_comanda(nome)
                d = input('Digite  S/N para pesquisar outra comanda :').lower()

            else:
                print('COMANDA NÃO ENCONTRADA !!!')
                d = input('Digite S/N para tentar novamente :').lower()

            if d == 'n':
                break

    if decisao == 3 :
        while True:
            nome = valida_nome()
            if comanda_existe(nome) == True:
                nome_produto = valida_produto()
                adiciona_produto_comanda(nome,nome_produto)
                print('funciona')










import os
comanda=[]

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
            if nome.isnumeric() == True:
                print('O nome não pode ser numerico ')
            else:
                valid = True
        except:
            print('Formato Digitado Invalido !!!')
    return nome

def comanda_existe(nome):
    x = False
    for i in comanda:
        if i[0]==nome:
            x = True
            break
    return x

def cadastra(lista):
    comanda.append(lista[:])

def mostra_comanda(nome):
    valortotal=0
    for i in comanda:
        if i[0] == nome:
            nome = i[0]
            individual = i
    print(f'Nome da comanda : {nome}')
    limite = int(len(individual) - 3)

    for c in range(0, limite, 3):
        print(f'Produto : {individual[c+1]}', end=' || ')
        print(f'Quantidade : {individual[c+2]}', end=' || ')
        print(f'Valor  : {individual[c+3]}', end=' || ')
        print(f'Valor unitario :{individual[c+3]/individual[c+2]}')
        valortotal+=individual[c+3]
    print(f'o valor total desta comanda foi {valortotal}')

def cadastra_comanda_existente(nome,produto):
    op = 0
    ncomanda=0
    for i in comanda:
        ncomanda+=1
        if i[0] == nome:
            individual=i
            break
    contador = 0
    limite = (len(individual)-3)
    for c in individual:
        if c == produto:
            op=1

    if op == 1:
        for d in range(0,limite,3):
            if individual[d+1]== produto:
                valor_individual = individual[d+3]/individual[d+2]
                valor_quantidade = individual[d+2]
                quantidade = valida_quantidade()
                quantidade+=valor_quantidade
                individual.insert(d+2,quantidade)
                individual.insert(d+3,valor_individual*quantidade)
                del individual[d+5]
                del individual[d+4]
    else:
        quantidade = valida_quantidade()
        valor = valida_valor()
        valor = valor * quantidade
        individual.append(produto)
        individual.append(quantidade)
        individual.append(valor)
    del comanda[ncomanda-1]
    comanda.insert(ncomanda-1,individual[:])

def mostra_nome_comanda():
    print('\n')
    ncomanda=0
    for i in comanda:
        ncomanda+=1
        print(f'comanda nº{ncomanda} nome : {i[0]}')
    d = input('Digite qualquer coisa para voltar ao menu !!!')

def produto_existe_em_comanda(nome,produto):
    op =False
    for i in comanda:
        if i[0]==nome:
            individual = i
    for c in individual:
        if c == produto:
            op = True
    return op

def deleta_produto_comanda(nome,produto):
    ncomanda=0
    cont=0
    for i in comanda:
        ncomanda+=1
        if i[0]==nome:
            individual=i
    limite = len(individual)

    for d in range(0,limite):
        if individual[d] == produto:
            del individual[d]
            del individual[d]
            del individual[d]
            break

while True:
    print('BEM VINDO AO ORGANIZADOR DE COMANDA !!!\n\n')
    print('1 - para cadastrar uma comanda')
    print('2 - para vizualizar uma comanda especifica')
    print('3 - para adicionar um produto a uma comanda especifica')
    print('4 - para vizualizar o nome de todas as comandas')
    print('5 - para apagar um produto de uma comanda')
    print('6 - para guarda esse conjunto de  comanda')
    decisao = int(input('Digite sua opção :'))

    if decisao == 1:
        nome = valida_nome()
        lista=[]
        lista.append(nome)
        while True:
            produto = valida_produto()
            quantidade = valida_quantidade()
            valor = valida_valor()
            valor = valor * quantidade
            lista.append(produto)
            lista.append(quantidade)
            lista.append(valor)
            d = str(input('DIGITE S/N para cadastra mais um Produto :')).lower()
            if d == 'n':
                break
        cadastra(lista)
        lista.clear()

    elif decisao == 2:
       while True:
           nome = valida_nome()
           if comanda_existe(nome) == True:
               mostra_comanda(nome)
               d = input('Digite  S/N para pesquisar outra comanda :').lower()
           else:
               print('COMANDA NÃO NENCONTRADA !!!')
               d = input('Digite N ou qualquer coisa pra tentar novamente :').lower()
           if d== 'n':
               break

    elif decisao == 3:
        while True:
            nome = input('Digite o nome da comanda ao qual deseja modificar :')
            if comanda_existe(nome) == True:
                mostra_comanda(nome)
                produto = valida_produto()
                cadastra_comanda_existente(nome,produto)
                d=input('Digite S/N para cadastrar outro produto  :').lower()

            else:
                print('Comanda digitada invalida !!!')
                d=input('Digite S/N para tentar novamente  :').lower()

            if d=='n':
                break

    elif decisao == 4:
        mostra_nome_comanda()

    elif decisao == 5:
        while True:
            nome = valida_nome()
            produto=valida_produto()
            if comanda_existe(nome)==True:
                if produto_existe_em_comanda(nome,produto) == True:
                    deleta_produto_comanda(nome,produto)
                else:
                    print('Produto não encontrado na comanda informada , por favor verifique o nome deigitado')
                    d = input('Deseja tentar novamente S/N :').lower()
            else:
                print('Comanda não encontrada , por favor verifique o nome deigitado !!! ')
                d = input('Deseja tentar novamente S/N :').lower()
            if d == 'n':
                break
    
    else :
        print(comanda)
        d = input('DIGITE QUALQUER COISA PARA SAIR DO PROGAMA !!!')
        exit(0)


                









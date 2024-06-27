#lanche.append(x) adiciona no final da lista o elemento
#lanche.insert(0,'x') adiona na lista na posição informada
#del lanche[3] deleta na lista o que está naquela posição tpode se usar lanche.pop(3) este metodo sem nada elimina o ultimo elemento
#lanche.remove('3') voce informa o valor ao qual quer remover da lista não in=mportando sua posição
#lanche=list(range(4,11)) cria um lista de 0 a 6 com valores de 4 a 11
#lanche.sort() ordena a lista do menor para o maior lanche.sort(reverse=True) ordena ao inverso

#lista= []
#for i in range(0,5):
#    x = float(input("Digite um valor para armazenar na lista :"))
#    lista.append(x)
#for i in range(0,5):
#    print('{:.2f}'.format(lista[i]))

#a =[1,2,3,4]
#b=a
#b[2]=8 por dizer que b e igual a a qualquer atribuiçao que for feita a uma das listas valera para ambas
#print(f'lista a:{a}')
#print(f'lista b:{b}')

#maior =0
#menor=0
#lista=[]
#posicaom=0
#posicao=0
#x=0
#for i in range(0,5):
#    x=int(input('Digite um numero para a posição {}:'.format(i)))
#    lista.append(x)
#    if i == 0:
#        maior = lista[i]
#        menor = lista[i]
#    if x>maior:
#        maior = lista[i]
#        posicaom = i
#    if x<menor:
#        menor=lista[i]
#        posicao = i
#print(f'o maior numero digitado foi {maior} e a sua posição foi {posicaom} ')
#print(f'o menor numero digitado foi {menor} e sua posição foi {posicao}')

#lista=[]
#cont = 0
#while True:
#    x = int(input('Digite um numero :'))
#    cont = 0
#    for  i in range(0,len(lista)):
#        if x==lista[i]:
#            cont = 1
#    if cont == 1:
#        print('O numero já foi digitado !!!')
#    if cont == 0:
#        lista.append(x)
#        print('O numero foi adicionado com sucesso !!!!')
#    d = input('Quer continuar S/N :')
#    print('\n')
#    if d == 'n':
#        break
#lista.sort()
#print('A lista em ordem crescente é {}'.format(lista))


#PROGAMA ANTERIOR COM LOGICA MELHOR!!!
#lista = []
#while True:
#    x = int(input('Digite um numero :'))
#    if x in lista:
#        print('Não adiciono valores duplicados:')
#    else:
#        lista.append(x)
#        print('Numero adicionado com sucesso')
#   d = str(input('Deseja continuar S/N :')).lower()
#   print('\n')
#   if d == 'n':
#       break
#lista.sort()
#print(f'A lista em ordem crescente é :{lista}')

#lista=[]
#cont = 0
#cinco = 0
#while True:
#    x = int(input('Digite um valor:'))
#    lista.append(x)
#    cont = cont + 1
#    if x == 5:
#        cinco=1
#    d = str(input('Digite S/N para continuar:'))
#    if d == 'n':
#        break
#print(f'a quantidade de numeros digitados  foi {cont}')
#lista.sort(reverse=True)
#print(f'os valores em forma descrescente e {lista}')
#if cinco == 1:
#    print('o numero cinco foi digitado')
#else:
#    print('O numero ciinco não foi digitado')

#lista=[]
#par=[]
#impar=[]
#while True:
#    x = int(input('Digite um valor :'))
#    lista.append(x)
#    d = str(input('Deseja digitar mais um valor S/N :'))
#    if d =='n':
#        break
#for i in range(0,len(lista)):
#    if (lista[i]%2)==0:
#        par.append(lista[i])
#    else:
#        impar.append(lista[i])
#print(f'valores digitados : {lista}')
#print(f'valores pares digitados {par}')
#print(f'valores impares digitados{impar}')

#x=0
#pessoas =[]
#while x<4:
#    nome=input('qaul o seu nome')
#    if nome == 'joao':
#        continue    #faz o loop voltar do inicio
#    pessoas.append(nome)
#    x+=1
#print(pessoas)

#x = str(input('Digite uma operação matematica :'))
#n=0
#m=0
#for i in range(0,len(x)):
#    if x[i]=='(':
#        n=n+1
#    if x[i] == ')':
#        m=m+1
#if n != m :
#    print('Operação invalida !!!')
#else:
#    print('operação valida !!!')

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
#    fatura.append(produto)
#    fatura.append(valor)
#    fatura.append(unidades)
#    total += valor
#    d =  str(input('Deseja cadastrar mais algum produto S/N :')).lower()
#    print('\n')
#    if d == 'n':
#        break
#for i in range(0,len(fatura),3):
#    if fatura[i+2] > 1:
#        print(f'PRODUTO : {fatura[i]}  VALOR :R$ {fatura[i+1]:.2f}  UNIDADES : {fatura[i+2]} PREÇO UNITARIO :R${fatura[i+1]/fatura[i+2]:.2f}')
#    else:
#        print(f'PRODUTO : {fatura[i]}  VALOR :R$ {fatura[i+1]:.2f}  UNIDADES : {fatura[i+2]} ')
#print(f'Total : {total:.2f}')

#fatura = []
#total = float()
#valid = False
#valid2 = False
#while True:
#    produto = input('Digite o nome do produto :')
#
#    while valid == False:
#        valor = input('Digite o valor do produto :')
#        try:
#            valor = float(valor)
#            if valor<=0:
#                print('O preço precisa ser maior que zero !!! ')
#            else:
#                valid = True
#        except:
#            print("Formato de preço invalido . Use apenas numeros e separe os centavos com '.' ")
#
#    while valid2 == False:
#        unidades = input('Digite a quantidade do produto :')
#        try:
#            unidades=int(unidades)
#            if unidades <= 0:
#                print('Digite um numero maior que zero por favor')
#            else:
#                valid2 = True
#        except:
#            print('Formato de unidade invalido !!! ')
#
#    valor = valor * unidades
#    fatura.append([produto,valor,unidades])
#    total += valor
#    valid = False
#    d =  str(input('Deseja cadastrar mais algum produto S/N :')).lower()
#    print('\n')
#    if d == 'n':
#        break
#
#for i in fatura:
#    if i[2]>1:
#        print(f'PRODUTO : {i[0]}  VALOR :R$ {i[1]:.2f}  UNIDADES : {i[2]} PREÇO UNITARIO :R${i[1]/i[2]:.2f}')
#    else:
#        print(
#            f'PRODUTO : {i[0]}  VALOR :R$ {i[1]:.2f}  UNIDADES : {i[2]}')
#print(f'{total:.2f}')

#lista=[]
#listamaispesados=[]
#listamaisleves=[]
#l = []
#cont=0
#while True:
#    l.append(str(input('Dgite o nome da pessoa :')))
#    l.append(float(input('Digite o peso da pessoa :')))
#    lista.append(l[:])
#    l.clear()
#    cont+=1
#    d = input('Digite S/N para continuar ').lower()
#    print('\n')
#    if d == 'n':
#        break
#for i in lista:
#    if i[1] <= 75:
#        listamaisleves.append(i[0])
#    else:
#        listamaispesados.append(i[0])
#print(f'Foram cadastradas {cont} pessoas \n')
#print('A lista das pessoas mais pesadas foi :')
#for i in listamaispesados:
#    print(i)
#print('\n')
#print('A lista das pessoas mais leves foi :')
#for i in listamaisleves:
#    print(i)

#pares=[]
#impares=[]
#numeros=[]
#for i in range(0,7):
#    x = int(input(f'Digite o {i+1}º numero: '))
#    if (x % 2) == 0:
#        pares.append(x)
#    else:
#        impares.append(x)
#pares.sort()
#impares.sort()
#numeros.append(impares)
#numeros.append(pares)
#print(f'os numeros pares digitados foram {numeros[0]}')
#print(f'os numeros impares digitados foram {numeros[1]}')

matriz=[[0,0,0],[0,0,0],[0,0,0]]
for i in range(0,3):
    for j in range(0,3):
        matriz[i][j] = int(input(f'Digite o o numero para a posição {i}{j} da matriz : '))
for i in range(0,3):
    print('')
    for j in range(0,3):
        print(f'[ {matriz[i][j]} ]',end = '')














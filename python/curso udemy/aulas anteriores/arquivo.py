#escrevendo no arquivo
#arquivo = open('zxt.txt','w')
#texto = 'escrevento no arquivo  !!!'
#arquivo.write(texto)
#arquivo.close()

#ler coisas gravada no arquivo
#arquivo = open('zxt.txt','r')
#texto = arquivo.read()
#print(texto)
#arquivo.close()

#arq = open('zxt.txt', 'w')
#texto = []
#texto.append('Lista de Alunos\n')
#texto.append('---\n')
#texto.append('João da Silva\n')
#texto.append('José Lima\n')
#texto.append('Maria das Dores')
#arq.writelines(texto)
#arq.close()

#arq = open('zxt.txt', 'r')
#texto = arq.readlines()
#for linha in texto :
#    print(linha)
#arq.close()


#caderno=['cerge ','freeivghe ','hjegfherf']
#arq=open('lista1.txt','w')
#for i in caderno:
#    arq.write(i)
#    arq.write('\n')
#arq.close()
#arq = open('lista1.txt','r')
#texto = arq.read()
#print(texto)
#arq.close()

leitura = []
caderno = ['teste1','teste2','escrever']
arq = open('lista.txt','w')
for i in caderno:
    arq.write(i)
    arq.write('\n')
arq.close()
arq = open('lista.txt','r')
leitura.append(arq.read())
print(leitura)

#del pessoas['nome'] deleta o nome que no caso e joão
#pessoas['profissao']= aposentado trocar o valor
#'sobrenome' in joao caso exista ele retorna o valor true
#pessoas.get('nome','nao cadastrado') caso o valor não exista ele retorna a messagem escrita
#pessoa.clean() liampa o dicionario

#pessoas = {'nome':'joao','sobrenome':'victor','profissão':'progamador python','idade':20}
#for i in pessoas:
#    print(f'{i}  {pessoas[i]}')

#dicionario = {'vermelho':'red','azul':'blue','verde':'green','branco':'white','preto':'black','roxo':'purle','prata':'silver','marrom':'brown'}
#cor = str(input('Digite uma cor para ver a sua tradução :'))
#if cor in dicionario:
#    print(f'a cor {cor} em ingles é {dicionario[cor]}')
#else:
#    print('Essa cor não consta no dicionario !!!!')

#dicionario = {'vermelho':'red','azul':'blue','verde':'green','branco':'white','preto':'black','roxo':'purle','prata':'silver','marrom':'brown'}
#cor = str(input('Digite uma cor para ver a sua tradução em ingles :'))
#print('{}'.format(dicionario.get(cor,'o valor digitado não consta no meu dicionario !!!!')))

pessoas = {'nome':'joao','sobrenome':'victor','profissão':'progamador python','idade':20}
pessoas.update({'opção sexual':'hetero','nacionalidade':'Brasileiro'}) #adicionar uma chave ao dicionario
print(pessoas)


def jvm():
    print('Funciona !!!')


def conversor_velocidade():
    def milhas(valor,operador):
        if operador == 'pps':
            pps = valor * 1.46667
            return pps
        elif operador == 'mps':
            mps = valor / 2.237
            return mps
        elif operador == 'kph':
            kph = valor * 1.60934
            return kph
        elif operador == 'no':
            no = valor / 1,15077
            return no     
    def quilometros_por_hora(valor, operador):
        if operador == 'pps':
            pps = valor / 1.097
            return pps
        elif operador == 'mps':
            mps = valor / 3.6
            return mps
        elif operador == 'mph':
            mph = valor / 1.609
            return mph
        elif operador == 'no':
            no = valor / 1.852  
            return no
    def pes_por_segundo(valor, operador):
        if operador == 'kph':
            kph = valor * 1.097
            return kph
        elif operador == 'mps':
            mps = valor / 3.281
            return mps
        elif operador == 'mph':
            mph = valor / 1.467
            return mph
        elif operador == 'no':
            no = valor / 1.688  
            return no
    def metros_por_segundo(valor, operador):
        print('entrou')
        if operador == 'kph':
            kph = valor * 3.6
            return kph
        elif operador == 'pps':
            pps = valor * 3.281
            return pps
        elif operador == 'mph':
            mph = valor / 2.237
            return mph
        elif operador == 'no':
            no = valor * 1.94384  
            return no     
    def no(valor, operador):
        if operador == 'kph':
            kph = valor * 1.852
            return kph
        elif operador == 'pps':
            pps = valor * 1.68781
            return pps
        elif operador == 'mph':
            mph = valor * 1.15078
            return mph
        elif operador == 'mps':
            mps = valor / 1.94384  
            return mps
    def converter_entrada(entrada):
        if entrada == '1':
            return 'mph','Milhas por Hora'
        elif entrada == '2':
            return 'kph','Quilometros por Horas'
        elif entrada == '3':
            return 'mps','Metros Por Segundo'
        elif entrada == '4':
            return 'pps','Pés Por Segundo'
        elif entrada == '5':
            return 'no','Nó'
        
    def fazer_operacao(valor,unidade1,unidade2):
        print(valor,unidade1,unidade2)
        if unidade1[0]== 'mph':
            print('1')
            return milhas(valor,unidade2[0])
        elif unidade1[0] == 'kph':
            print('2')
            return quilometros_por_hora(valor,unidade2[0])
        elif unidade1[0] == 'mps':
            print('3')
            return metros_por_segundo(valor,unidade2[0])
        elif unidade1[0] == 'pps':
            print('4')
            return pes_por_segundo(valor,unidade2[0])
        elif unidade1[0] == 'no':
            print('5')
            return no(valor,unidade2[0])
        else:
            print('Erro na operação !!!')   
                    
    def validacao_entradas(str,operador):
        escolhas_possiveis = ['1','2','3','4','5']
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
        print('\n   CONVERSOR DE VELOCIDADE    ')
        print('1 - MPH (Milhas por Hora)        2 - KPH  (Quilometro Por Hora)        ')
        print('3 - MPS (Metros Por Segundo)     4 - PPS  (Pés por segundo)            ')
        print('5 - Nó  (Nó)                                                           ')
        

    str1 = 'Digite a unidade  do valor acima :'
    str2 = 'Digite o valor a ser convertido :'
    str3 = 'Digite agora para qual unidade ela será convertida :'  

    while True:
        menu_conversao()
        valor = validacao_entradas(str2,1)
        unidade1 = validacao_entradas(str1,0)                   #a unidade 1 e 2 recebem um retorno como vertor dessa função sendo [0] recebendo aa letra para operação
        unidade2 = validacao_entradas(str3,0)                   #e [1] recebendo o nome
        if unidade1 != unidade2:
            print(f'O Valor {valor} em {unidade1[1]} representa {fazer_operacao(valor,unidade1,unidade2)} na unidade {unidade2[1]}')
        else:
            print('Você não pode converter o valor para unidades iguais , por favor verifique suas entradas !!!')
        
        d = input('Digite qualquer coisa para fazer outra operação ou n para sair :')
        if d == 'n':
            break

conversor_velocidade()
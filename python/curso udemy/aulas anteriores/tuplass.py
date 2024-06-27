palavras = ('macaco', 'banana', 'livro', 'progamador', 'estudar', 'futuro', 'praticar', 'linguagem')
for i in palavras:
    print('Na palavra {} temos '.format(i), end = '')
    for c in i:
        if c in 'aeiou':
            print(c, end = " ")
    print('\n')
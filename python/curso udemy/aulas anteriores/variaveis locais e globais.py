#x = 50
#def func(x):
#    print('x é',x)
#    x = 2
#    print('mudou o x local para',x)
#func(x)
#print('x is still',x)

x = 50
def func():
    global x
    print('o valor de x é :',x)
    x=2
    print('O valor de x na função func() é',x)
print('o valor de x antes de chamar a função func ():',x)
func()
print('o valor de x depois de ter chamado a função func :',x)

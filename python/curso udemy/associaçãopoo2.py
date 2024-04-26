# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


"""def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    print_hi('PyCharm')

# See PyCharm help at https://www.jetbrains.com/help/pycharm/

"""
class escritor:
    def __init__(self,nome):
        self.__nome = nome
        self.__ferramenta = None

    def getter_nome(self):
        return self.__nome

    def getter_ferramenta(self):
        return self.__ferramenta

    def setter_ferramenta(self,ferramenta):
        self.__ferramenta = ferramenta

class caneta:
    def __init__(self,marca):
        self.__marca = marca

    def getter_marca(self):
        return self.__marca

    def escrever(self,assunto):
        print(f'Caneta {self.__marca} está escrevendo sobre {assunto}')

class maquina_de_escrever:
    def __init__(self,marca):
        self.__marca = marca

    def escrever(self):
        print(f'A maquina {self.__marca} está em uso')

    def getter_marca(self):
        return self.__marca

e1 = escritor('João')
c1 = caneta('Bic')
m1 = maquina_de_escrever('Desconhecido')

e1.setter_ferramenta(m1)
e1.getter_ferramenta().escrever()




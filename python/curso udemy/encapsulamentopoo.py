"""
public (atributos e métodos que podem ser acessados dentro e fora das classes)
protect (atributos e métodos que podem apenas ser acessados de dentro das classes ou das filhas daquela classe)
private (atributos ou metodos que só estão disponiveis dentro da classe)
no python por convenção utilizamos _ antes da variavél para informar que ela não deve ser acessada
"""

class BaseDeDados:
     def __init__(self):
         self.__dados ={}

     def inserir_cliente(self ,id , nome):
         if 'Clientes' not in self.__dados:
             self.__dados['Clientes'] = {id: nome}
         else:
             self.__dados['Clientes'].update({id: nome})

     def apaga_cliente(self,id):
         self.__dados['Clientes'].pop(id)

     def listar_clientes(self):
         for id , nome in self.__dados['Clientes'].items():
             print(id ,nome)

bd = BaseDeDados()
bd.inserir_cliente(1,'João')
bd.inserir_cliente(2,'Maria')

bd.__dados = 'Outra coisa'                   #aqui eu crio um atributo da instancia bd não modificando o atributo de classe self.__dados

bd.listar_clientes()

print(bd.__dados)
print(bd._BaseDeDados__dados)               #o python modifica o nome do atributo para _NOMECLASSE__NOMEATRIBUTO








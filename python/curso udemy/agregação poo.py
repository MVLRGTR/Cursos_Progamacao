class Carrinho_de_compra():
    def __init__(self):
        self.produtos = []

    def inserir_produto(self,produto):
        self.produtos.append(produto)

    def listar_produtos(self):
        for i in self.produtos:
            print(f'{i.nome} - {i.valor:,.2f}')

    def soma_total(self):
        total = 0
        for i in self.produtos:
            total += i.valor
        print(f'o valor total da soma de produtos é {total:,.2f}')

class Produto():
    def __init__(self,nome , valor):
        self.nome = nome
        self.valor = valor


p1 = Produto('Camiseta',55)
p2 = Produto('iphone',10000)

print(p1.valor)

c1 = Carrinho_de_compra()

c1.inserir_produto(p1)
c1.inserir_produto(p2)

c1.listar_produtos()
c1.soma_total()

#Aqui nós temos agregação onde a classe carrinho de compra vive independente da classe produto , so que a classe carrinho_de_compra precisa das instancias da classe produto para poder realizar qualquer operação
#e neese caso temos a agregação.
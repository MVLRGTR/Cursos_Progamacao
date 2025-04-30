package entities;

public class Elemento {
	
	public Elemento proximo;
	public Pedido valor=null;
	
	public Elemento(Pedido valor) {
		this.valor = valor;
	}
}

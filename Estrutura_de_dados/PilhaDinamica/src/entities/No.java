package entities;

public class No {
	
	public int valor;
	public No proximo;
	
	public No(int valor) {
		this.proximo = null;
		this.valor = valor;
	}

}

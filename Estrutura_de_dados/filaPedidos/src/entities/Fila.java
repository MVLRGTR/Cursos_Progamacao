package entities;

public class Fila {
	
	private Elemento inicio = null;
	private Elemento fim = null;
	
	public Fila() {
	}
	
	public void inserir(Pedido pedido) {
		Elemento novo = new Elemento(pedido);
		if(inicio == null) {
			inicio = novo;
			fim = novo;
		}else {
			fim.proximo = novo;
			fim = novo;
		}
	}
	
	public Elemento retirar() {
		if(!estaVazio()) {
			Elemento retVal = inicio;
			inicio = inicio.proximo;
			return retVal;
		}
		return null;
	}
	
	public boolean estaVazio() {
		if(inicio == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public Elemento mostrarFrente() {
		return inicio;
	}
	
	public int tamanho() {
		int cont=0;
		Elemento aux = inicio;
		
		while(aux!=null) {
			cont++;
			aux=aux.proximo;
		}
		return cont;
	}
	
}

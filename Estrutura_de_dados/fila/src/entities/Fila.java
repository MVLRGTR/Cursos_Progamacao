package entities;

public class Fila {
	
	private No inicio = null;
	private No fim = null;
	
	public Fila() {
	}
	
	public void inserir(int valor) {
		No novo = new No(valor);
		if(inicio == null) {
			inicio = novo;
			fim = novo;
		}else {
			fim.proximo = novo;
			fim = novo;
		}
	}
	
	public No retira() {
		if(!estaVazio()) {
			No retVal = inicio;
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
	
	public No mostrarFrente() {
		return inicio;
	}
	
	public int tamanho() {
		int cont = 0;
		No aux = inicio;
		while(aux!= null) {
			cont++;
			aux= aux.proximo;
		}
		return cont;
	}
}

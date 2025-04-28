package entities;

public class Pilha {
	
	private int indice;
	private Object[] pilha;
	
	public Pilha() {
		this.indice = -1;
		this.pilha = new Object[1000];
	}
	
	public void empilhar(Object valor) {
		if(this.indice <= pilha.length -1) {
			this.indice++;
			pilha[this.indice] = valor;
		}
	}
	
	public Object desempilhar() {
		if(!estaVazio()) {
			return pilha[this.indice--];
		}
		return null;
	}
	
	public int tamanho() {
		if(!estaVazio()) {
			return this.indice+1;
		}
		return 0;
	}
	
	public Object topo() {
		if(!estaVazio()) {
			return pilha[indice];
		}
		return null;
	}
	
	public boolean estaVazio() {
		if(indice == -1) {
			return true;
		}
		return false;
	}
	

}

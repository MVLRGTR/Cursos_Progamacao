package entities;

public class PilhaObjetos {
	private Object[] pilha;
	private int indice;
	
	public PilhaObjetos() {
		indice = -1;
		pilha = new Object[100];
	}
	
	public void empilhar(Object valor) {
		if(this.indice < this.pilha.length - 1) {
			this.indice++;
			this.pilha[this.indice] = valor;
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
	
	public Object mostrarTopo() {
		return this.pilha[this.indice];
	}
	
	public boolean estaVazio() {
		if(this.indice == -1) {
			return true;
		}
		return false;
	}

}

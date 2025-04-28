package entities;

public class PilhaInteiros {
	
	private int[] pilha;
	private int indice;
	
	public PilhaInteiros() {
		indice = -1;
		pilha = new int[100];
	}
	
	public void empilhar(int valor) {
		if((this.indice) < 100) {
			this.indice++;
			this.pilha[this.indice] = valor;
		}
	}
	
	public int desempilhar() {
		if(!estaVazio()) {
			return pilha[this.indice--];
		}
		return -1;
	}
	
	public int tamanho() {
		if(!estaVazio()) {
			return this.indice+1;
		}
		return 0;
	}
	
	public int mostrarTopo() {
		return this.pilha[this.indice];
	}
	
	public boolean estaVazio() {
		if(this.indice == -1) {
			return true;
		}
		return false;
	}

}

package entities;

public class Lista {
	
	private Elemento inicio=null;
	private Elemento fim=null;
	private Elemento atual=null;
	
	public Lista(){
	}
	
	public void inserirPrimeiro(int valor) {
		Elemento novo = new Elemento(valor);
		if(inicio==null){
			inicio= novo;
			fim=novo;
			atual=novo;
		}else {
			novo.proximo = inicio;
			inicio = novo;
		}
	}
	
	public void inserirUltimo(int valor) {
		Elemento novo = new Elemento(valor);
		if(inicio==null) {
			inicio=novo;
			fim=novo;
			atual=novo;
		}else {
			fim.proximo = novo;
			fim=novo;
		}
	}
	
	public void inserirNaPosicao(int posicao,int valor) {
		Elemento novo = new Elemento(valor);
		this.irPosicao(posicao);
		novo.proximo = atual.proximo;
		atual.proximo = novo;
	}
	
	public Elemento primeiroElemento() {
		return inicio;
	}
	
	public Elemento ultimoElemento() {
		return fim;
	}
	
	public Elemento elementoNaPosicao(int posi) {
		if(posi <= this.tamanho()) {
			this.irPosicao(posi);
			return atual;
		}
		return null;
	}
	
	public void removePrimeiro() {
		inicio=inicio.proximo;
	}
	
	public void removeUltimo() {
		this.irPosicao(this.tamanho()-1);
		fim = atual;
		atual.proximo = null;
		
	}
	
	public void removeNaPosicao(int posi) {
		if(posi <= this.tamanho() && posi > 0) {
			this.irPosicao(posi);
			Elemento temp =  atual.proximo;
			this.irPosicao(posi-1);
			atual.proximo=temp;
			
		}
	}
	
	public void removeElemento(int elemento) {
		int posi = this.buscaElemento(elemento);
		if(posi > -1) {
			this.irPosicao(posi);
			Elemento temp = atual.proximo;
			this.irPosicao(posi-1);
			atual.proximo=temp;
		}
	}
	
	public int buscaElemento(int v) {
		int cont=0;
		this.atual = inicio;
		
		while(this.atual != null && this.atual.valor != v) {
			cont++;
			this.atual = this.atual.proximo;
		}
		
		if(this.atual != null) {
			return cont;
		}else {
			return -1;
		}
		
	}
	
	public int tamanho() {
		int cont = 0;
		Elemento aux = inicio;
		while(aux!=null) {
			cont++;
			aux=aux.proximo;
		}
		return cont;
	}
	
	public void irPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.atual = inicio;
			for(int i = 0 ; i < posicao;i++) {
				this.atual = this.atual.proximo;
			}
		}else {
			atual=inicio;
		}
	}
	
	public boolean estaVazio() {
		if(inicio == null) {
			return true;
		}else {
			return false;
		}
	}
}

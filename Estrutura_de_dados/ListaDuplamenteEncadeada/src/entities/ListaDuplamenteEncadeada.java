package entities;

public class ListaDuplamenteEncadeada {
	private Etapa primeiro,atual,ultimo;

	public ListaDuplamenteEncadeada() {
		this.primeiro=this.atual=this.ultimo=null;
	}
	
	public void inserePrimeiro(String name, int duration) {
		Etapa novo = new Etapa(name,duration);
		if(this.estaVazio()) {
			this.primeiro = novo;
			this.atual = novo;
			this.ultimo = novo;
		}else {
			novo.proximo = this.primeiro;
			this.primeiro.anterior = novo;
			this.primeiro = novo;
		}
	}
	
	public void insereUltimo(String name, int duration) {
		Etapa novo = new Etapa(name,duration);
		if(this.estaVazio()) {
			this.primeiro = novo;
			this.atual = novo;
			this.ultimo = novo;
		}else {
			this.ultimo.proximo = novo;
			novo.anterior =this.ultimo;
			this.ultimo = novo;
		}
	}
	
	public void insereNaPosicao(String name, int duration, int posicao) {
		Etapa novo = new Etapa(name,duration);
		this.irPosicao(posicao-2);
		novo.proximo = this.atual.proximo;
		novo.anterior = this.atual;
		this.atual.proximo.anterior = novo;
		this.atual.proximo=novo;
	}
	
	public Etapa primeiro() {
		return this.primeiro;
	}
	
	public Etapa ultimo() {
		return this.ultimo;
	}
	
	public Etapa elementoNaPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.irPosicao(posicao);
			return this.atual;
		}else {
			return null;
		}
	}
	
	public void removePrimeiro() {
		this.primeiro = this.primeiro.proximo;
		this.primeiro.anterior = null;
	}
	
	public void removeUltimo() {
		this.ultimo = this.ultimo.anterior;
		this.ultimo.proximo = null;
	}
	
	public void removeNaPosicao(int posicao) {
		if(posicao > -1) {
			this.irPosicao(posicao-1);
			Etapa temp = atual.proximo;
			this.atual = this.atual.anterior;
			this.atual.proximo = temp;
			temp.anterior=this.atual;
		}
	}
	
	public void removeElemento(Etapa etapa) {
		int posicao = this.buscaElemento(etapa);
		if(posicao>-1) {
			this.removeNaPosicao(posicao);
		}
	}
	
	public boolean estaVazio() {
		if(this.primeiro==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public int buscaElemento(Etapa etapa) {
		int cont = 0;
		this.atual = this.primeiro;
		
		while(this.atual != null && !this.atual.equals(etapa)) {
			cont++;
			this.atual=this.atual.proximo;
		}
		
		if(this.atual != null) {
			return cont;
		}else {
			return -1;
		}
	}
	
	public int tamanho() {
		int cont = 0 ;
		Etapa aux = this.primeiro;
		while(aux != null) {
			cont++;
			aux = aux.proximo;
		}
		return cont;
	}
	
	public void irPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.atual =this.primeiro;
			for(int i = 0 ; i < posicao ;i++) {
				this.atual = this.atual.proximo;
			}
		}else {
			this.atual = this.primeiro;
		}
	}
	
}

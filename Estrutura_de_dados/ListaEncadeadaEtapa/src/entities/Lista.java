package entities;

public class Lista {
	private Etapa primeiro;
	private Etapa atual;
	private Etapa ultimo;
	
	public Lista() {
		this.primeiro=null;
		this.atual=null;
		this.ultimo=null;
	}
	
	public void inserePrimeiro(String name,int duration) {
		Etapa novaEtapa = new Etapa(name,duration);
		if(primeiro==null) {
			this.primeiro=novaEtapa;
			this.atual=novaEtapa;
			this.ultimo=novaEtapa;
		}else {
			novaEtapa.proximo = this.primeiro;
			this.primeiro =  novaEtapa;
		}
	}
	
	public void insereUltimaPosicao(String name,int duration) {
		Etapa novaEtapa = new Etapa(name,duration);
		if(primeiro==null) {
			this.primeiro=novaEtapa;
			this.atual=novaEtapa;
			this.ultimo=novaEtapa;
		}else {
			this.ultimo.proximo=novaEtapa;
			this.ultimo=novaEtapa;
		}
	}
	
	public void insereNaPosicao(String name,int duration,int posicao) {
		Etapa novaEtapa = new Etapa(name,duration);
		if(posicao <= this.tamanho()) {
			this.irNaPosicao(posicao-2);
			novaEtapa.proximo = atual.proximo;
			atual.proximo=novaEtapa;
		}
		
	}
	
	public Etapa primeira() {
		return this.primeiro;
	}
	
	public Etapa ultima() {
		return this.ultimo;
	}
	
	public Etapa etapaNaPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.irNaPosicao(posicao);
			return this.atual;
		}
		return null;
	}
	
	public void removePrimeiro() {
		this.primeiro = this.primeiro.proximo;
	}
	
	public void removeUltimo() {
		this.irNaPosicao(this.tamanho()-2);
		this.atual.proximo=null;
		this.ultimo=this.atual;
	}
	
	public void removeNaPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.irNaPosicao(posicao-1);
			Etapa temp = this.atual.proximo;
			this.irNaPosicao(posicao-2);
			this.atual=temp;
			
		}
	}
	
	public void removeEtapa(Etapa etapa) {
		int posicao =  this.buscaEtapa(etapa);
		if(posicao > -1) {
			this.removeNaPosicao(posicao);
		}
	}
	
	public int buscaEtapa(Etapa etapa) {
		int cont = 0 ;
		this.atual=this.primeiro;
		
		while(this.atual != null && !this.atual.equals(etapa)) {
			cont++;
			this.atual=this.atual.proximo;
		}
		
		if(this.atual!=null) {
			return cont;
		}else {
			return -1;
		}
	}
	
	public int tamanho() {
		int cont=0;
		Etapa aux = this.primeiro;
		while(aux!=null) {
			cont++;
			aux=aux.proximo;
		}
		return cont;
	}
	
	public boolean estaVazio() {
		if(this.primeiro == null) {
			return true;
		}else {
			return false;
		}
	}	
	
	public void irNaPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.atual = this.primeiro;
			for(int i = 0 ; i < posicao; i++) {
				this.atual = this.atual.proximo;
			}
		}else {
			this.atual=this.primeiro;
		}
	}

}

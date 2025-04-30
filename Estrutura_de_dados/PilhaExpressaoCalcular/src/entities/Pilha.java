package entities;

public class Pilha {
	
	private No topo = null;
	
	public Pilha() {
	}
	
	public void empilhar(int valor) {
		No novo = new No(valor);
		
		if(topo == null) {
			topo = novo;
		}else {
			novo.proximo = topo;
			topo = novo;
		}
	}
	
	public No desempilhar() {
		if(!estaVazio()) {
			No retVal = topo;
			topo = topo.proximo;
			return retVal;
		}
		return null;
	}
	
	public boolean estaVazio() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public No mostraTopo() {
		return topo;
	}
}

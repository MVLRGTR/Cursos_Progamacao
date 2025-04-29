package entities;

public class PilhaDinamicaCarro {
	

	private No topo = null;
	
	public PilhaDinamicaCarro() {
	}
	
	public void empilhar(Carro valor) {
		No novo = new No(valor);
		if(topo == null) {
			topo = novo;
		}else {
			novo.proximo = topo;
			topo = novo;
		}
	}
	
	public No desempilhar() {
		if(topo != null) {
			No retVal = topo;
			topo = topo.proximo;
			return retVal;
		}
		return null;
	}
	
	public Carro mostrarTopo() {
		return topo.valor;
	}
	
	public boolean estaVazio() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}

}

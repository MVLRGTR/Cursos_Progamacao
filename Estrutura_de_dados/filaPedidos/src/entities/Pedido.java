package entities;

public class Pedido {
	
	private int NOrder;
	private int NPurshase;
	private String Description;
	
	public Pedido(int nOrder, int nPurshase, String description) {
		NOrder = nOrder;
		NPurshase = nPurshase;
		Description = description;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getNOrder() {
		return NOrder;
	}

	public int getNPurshase() {
		return NPurshase;
	}

	@Override
	public String toString() {
		return "Pedido [NOrder=" + NOrder + ", NPurshase=" + NPurshase + ", Description=" + Description + "]";
	}
	
	
	
	
	
}

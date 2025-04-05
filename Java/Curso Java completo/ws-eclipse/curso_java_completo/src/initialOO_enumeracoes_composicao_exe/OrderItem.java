package initialOO_enumeracoes_composicao_exe;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Double subTotal() {
		return quantity * this.product.getPrice();
	}

	public String toString() {
		return product.getName() + ", R$"+this.price+", Quantity: "+this.quantity+", Subtotal : R$"+this.subTotal();
	}
	
	

}

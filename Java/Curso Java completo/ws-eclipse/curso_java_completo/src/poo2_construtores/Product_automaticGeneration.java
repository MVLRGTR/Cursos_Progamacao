package poo2_construtores;

public class Product_automaticGeneration {
	private String name;
	private double price;
	private int quantity;
	
	//Para fazer a geração automatica do construtor basta somente, botão direito , source , Generate Constructor using Fields
	// para fazer a geração automatica do get e seterrs botão direito , source , Generate getterrs and setters
	public Product_automaticGeneration() {

	}
	
	public Product_automaticGeneration(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product_automaticGeneration(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}


	public double totalValueInStock() {
	return price * quantity;
	}
	
	public void addProducts(int quantity) {
	this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
	this.quantity -= quantity;
	}
	public String toString() {
	return name
	+ ", $ "
	+ String.format("%.2f", price)
	+ ", "
	+ quantity
	+ " units, Total: $ "
	+ String.format("%.2f", totalValueInStock());
	}

}

package poo2_construtores;

public class Product_encapsulamento {
	private String name;
	private double price;
	private int quantity;
	
	public Product_encapsulamento() { // caso queira manter o construtor padrão
		
	}
	
	public Product_encapsulamento(String name , double price, int quantity) { //Esse aqui é o construtor que vai obrigar no momento da craição do objeto informa name , price e quantity
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product_encapsulamento(String name , double price) { //Segundo construtor tento o conceito de sobregarga
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice( double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
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

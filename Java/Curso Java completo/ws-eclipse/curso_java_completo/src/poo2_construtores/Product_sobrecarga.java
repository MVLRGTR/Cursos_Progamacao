package poo2_construtores;

public class Product_sobrecarga {
	public String name;
	public double price;
	public int quantity;
	
	public Product_sobrecarga() { // caso queira manter o construtor padrão
		
	}
	
	public Product_sobrecarga(String name , double price, int quantity) { //Esse aqui é o construtor que vai obrigar no momento da craição do objeto informa name , price e quantity
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product_sobrecarga(String name , double price) { //Segundo construtor tento o conceito de sobregarga
		this.name = name;
		this.price = price;
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

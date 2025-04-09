package heranca_e_polimorfismo_exe;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name,Double price,Double customsFee) {
		super(name,price);
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return this.price + customsFee;
	}
	
	public String priceTag() {
		return this.getName() + " $ "+ this.getPrice() + " (Custooms fee: $ " + this.customsFee + " )" ;
	}

}

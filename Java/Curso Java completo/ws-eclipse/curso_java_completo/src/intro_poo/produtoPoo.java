package intro_poo;

public class produtoPoo {
	String name ;
	double price;
	int quantity;
	
	public void addProducts(int quantityAdd) {
		quantity += quantityAdd;
	}
	
	public void removeProducts(int quantityRemove){
		quantity -= quantityRemove;
	}
	
	public double totlValueStock() {
		return quantity * price;
	}
	
	public String toString() {
		return name
				+", $ "
				+String.format("%.2f", price)
				+", "
				+quantity
				+ " units"
				+", Total : $ " 
				+ String.format("%.2f", totlValueStock());
	}

}

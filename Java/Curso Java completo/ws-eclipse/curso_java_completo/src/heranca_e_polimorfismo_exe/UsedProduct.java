package heranca_e_polimorfismo_exe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name,Double price ,Date manufactureDate) {
		super(name,price);
		this.manufactureDate =manufactureDate;
	}
	
	public String priceTag() {
		return this.getName() + " (used) $ "+ this.price + " (Manufactured date : " + sdf.format(manufactureDate) + " )" ;
	}

}

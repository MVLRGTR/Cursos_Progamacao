package predicate;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name,Double price) {
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public boolean nonStaticProductPredicate() {
		return this.price >= 100;
	}
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}

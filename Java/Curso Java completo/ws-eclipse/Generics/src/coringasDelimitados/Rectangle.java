package coringasDelimitados;

public class Rectangle implements Shape{
	
	private double base;
	private double height;
	
	public Rectangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return this.base*this.height;
	}
	
	

}

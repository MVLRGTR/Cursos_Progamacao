package interfaces;

public class ProgamAbstractShape {

	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(Color.BLACK,2.0);
		System.out.println("Circle color: " + s1.getColor());
		System.out.printf("Circle area : " + s1.area() );

	}

}

package coringasDelimitados;

import java.util.ArrayList;
import java.util.List;

public class Progam {

	/*public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Circle(4.0));
		myShapes.add(new Rectangle(4.0,6.0));	
		System.out.println("Total area : "+totalArea(myShapes));
	}
	
	public static double totalArea(List<Shape> list) {
		double sum = 0 ;
		for(Shape figure : list) {
			sum+=figure.area();
		}
		return sum;
	}*/
	
	//TEMOS UM PEQUENO PROBLEMA AQUI , CASO EU CRIE UMA LISTA DE CIRCLE O TOTALaREA PARA DE FUNCIONAR POIS LIST SHAPE NÃO E UMA SUPER CLASSE DE LIST CIRCLE
	
	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Circle(4.0));
		myShapes.add(new Rectangle(4.0,6.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(4.0));
		myCircles.add(new Circle(6.0));
		
		
		System.out.println("Total area : "+totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0 ;
		for(Shape figure : list) {
			sum+=figure.area();
		}
		return sum;
	}

}

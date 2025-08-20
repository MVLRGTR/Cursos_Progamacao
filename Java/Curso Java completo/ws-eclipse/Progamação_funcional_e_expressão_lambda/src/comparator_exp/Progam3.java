package comparator_exp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Progam3 {

	public static void main(String[] args) {
		
		//Crinado função anonima para resolver o mesmo problema anterior de forma menos verbosa

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1900.00));
		list.add(new Product("Tablet", 450.00));

		// Metodo antigo
		/*Comparator<Product> comp = new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		
		//função anonima ou array function
		Comparator<Product> comp = (p1,p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		*/
		
		
		//Metodo simplificado
		//Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		//Ainda é possivél retirar a variavél comp e colocar seu conteudo diretamente no list.sort()
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}

}

package comparator_exp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Progam2 {
	public static void main(String[] args) {

		// Diferente do modelo antigo eu utilizo aqui uma variavél comparator

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1900.00));
		list.add(new Product("Tablet", 450.00));

		// Classe anonima
		Comparator<Product> comp = new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};

		list.sort(comp);

		for (Product p : list) {
			System.out.println(p);
		}

	}
}

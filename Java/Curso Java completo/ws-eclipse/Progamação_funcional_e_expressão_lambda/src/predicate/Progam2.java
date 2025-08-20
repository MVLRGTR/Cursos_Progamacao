package predicate;

import java.util.ArrayList;
import java.util.List;

public class Progam2 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));
		
		/*
		 * Nessa segunda ocasião estou utilizando um metodo dentro da classe Product para fazer a arrumação da lista ao invés de usar
		 * uma classe como no progam para fazer essa comparação.
		 * Aqui estou utilizando o Methos reference 
		 * 
		 * */
		
		list.removeIf(Product::staticProductPredicate);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}

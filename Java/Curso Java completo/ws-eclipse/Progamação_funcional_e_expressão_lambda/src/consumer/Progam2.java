package consumer;

import java.util.ArrayList;
import java.util.List;

public class Progam2 {

	public static void main(String[] args) {
		/*
		 * Nessa segunda forma utilizo o consumer com um metodo statico dentro da classe product para atualizar os preços dos produtos
		 * 
		 * 
		 * */
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));

		list.forEach(Product::staticUpdatePrice);

		list.forEach(System.out::println);

	}

}

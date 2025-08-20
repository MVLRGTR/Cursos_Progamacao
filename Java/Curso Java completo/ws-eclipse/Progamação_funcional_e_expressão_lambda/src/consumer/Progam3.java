package consumer;

import java.util.ArrayList;
import java.util.List;

public class Progam3 {

	public static void main(String[] args) {
		/*
		 * Nessa terceira forma utilizo o consumer com um metodo não statico dentro da classe product 
		 * para atualizar os preços dos produtos indo diretamente em cada instancia da classe Product.
		 * 
		 * 
		 * */
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));

		list.forEach(Product::nonStaticUpdatePrice);

		list.forEach(System.out::println);

	}

}

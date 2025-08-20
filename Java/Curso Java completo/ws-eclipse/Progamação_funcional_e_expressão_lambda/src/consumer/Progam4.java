package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Progam4 {

	public static void main(String[] args) {
		/*
		 * Nessa quarta forma utilizo o consumer como uma função anonima e passo ela como argumento para o forEach
		 * 
		 * */
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));
		
		double factor = 1.1;
		
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice()*factor);
		};

		list.forEach(cons);

		list.forEach(System.out::println);

	}

}

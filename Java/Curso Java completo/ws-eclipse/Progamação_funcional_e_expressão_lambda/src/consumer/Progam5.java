package consumer;

import java.util.ArrayList;
import java.util.List;

public class Progam5 {

	public static void main(String[] args) {
		/*
		 * Nessa quinta forma utilizo a expressão lambda diretamente dentro do foreach inline
		 * 
		 * */
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));
		
		double factor = 1.1;
		
		list.forEach(p->p.setPrice(p.getPrice()*factor));

		list.forEach(System.out::println);

	}

}

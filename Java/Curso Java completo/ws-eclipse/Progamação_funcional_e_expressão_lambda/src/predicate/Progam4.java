package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Progam4 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));
		
		/*
		 * Nessa quarta forma estarei utilizando uma expressão lambda
		 * diretamente dentro da variavél predicate que passo como argumento no list.removeIf.
		 * 
		 * */
		
		Predicate<Product> predicate = p -> p.getPrice() >= 100;
		
		list.removeIf(predicate);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}

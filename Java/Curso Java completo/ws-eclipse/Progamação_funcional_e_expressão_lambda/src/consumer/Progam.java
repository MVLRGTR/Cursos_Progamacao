package consumer;

import java.util.ArrayList;
import java.util.List;

public class Progam {

	public static void main(String[] args) {
		
		/*
		 * O Predicate serve para eu fazer filtros de uma determinada classe , já o Consumer serve para eu aplicar algum metodo na classe
		 * por exemplo  da um desconto  ou acrescimo como  no nosso caso de 10% em todos os produtos.
		 * */
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));

		list.forEach(new PriceUpdate());

		list.forEach(System.out::println);

	}

}

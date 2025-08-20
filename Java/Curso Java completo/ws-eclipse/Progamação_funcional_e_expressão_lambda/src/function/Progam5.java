package function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Progam5 {

	public static void main(String[] args) {
		/*
		 * O function tem como finalidade receber um objeto fazer um processamento e
		 * devolver outro objeto.
		 * 
		 * Quando utilizamos o map ele aplica uma função a cada novo elmento , ou seja
		 * ele faz um processamento a cada novo dado que será transformado por uma
		 * função que é passada como argumento.
		 * 
		 * Nessa quinta forma utilizo a expressão lambda dentro da própria função map 
		 */

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));
		

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		// faço essa tranformação pois o map funciona a parti de um stream
		// então converto para stream ,faço o processamento no map e depois transformo a
		// stream em list novamente

		list.forEach(System.out::println);
		names.forEach(System.out::println);

	}

}

package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Progam4 {

	public static void main(String[] args) {
		/*
		 * O function tem como finalidade receber um objeto fazer um processamento e
		 * devolver outro objeto.
		 * 
		 * Quando utilizamos o map ele aplica uma função a cada novo elmento , ou seja
		 * ele faz um processamento a cada novo dado que será transformado por uma
		 * função que é passada como argumento.
		 * 
		 * Nessa quarta forma utilizo uma expressão lambda declarada em uma função que é passada como argumento dentro do MAP para fazer a transformação dos dados.
		 */

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));
		
		Function<Product,String> func = p -> p.getName().toUpperCase();

		List<String> names = list.stream().map(func).collect(Collectors.toList());
		// faço essa tranformação pois o map funciona a parti de um stream
		// então converto para stream ,faço o processamento no map e depois transformo a
		// stream em list novamente

		list.forEach(System.out::println);
		names.forEach(System.out::println);

	}

}

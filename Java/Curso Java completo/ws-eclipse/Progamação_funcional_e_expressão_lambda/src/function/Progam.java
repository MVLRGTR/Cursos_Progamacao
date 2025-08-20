package function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Progam {

	public static void main(String[] args) {
		/*
		 * O function  tem como finalidade receber um objeto fazer um
		 * processamento e devolver outro objeto
		 * 
		 * Quando utilizamos o map ele aplica uma função a cada novo elmento , ou seja ele faz um processamento a cada novo dado que será
		 * transformado por uma função que é passada como argumento.
		 * 
		 * Resumo :
		 * removeIf(Predicate)
		 * foreach(Consumer)
		 * map(Function)
		 */

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));

		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); 
		//faço essa tranformação pois  o map funciona a parti de um stream 
		//então converto para stream ,faço o processamento no map e depois transformo a stream em list novamente
		
		

		for (Product p : list) {
			System.out.println(p.toString());
		}
		
		for (String n : names) {
			System.out.println(n);
		}

	}

}

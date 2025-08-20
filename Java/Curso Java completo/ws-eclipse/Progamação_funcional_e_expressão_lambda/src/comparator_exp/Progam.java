package comparator_exp;

import java.util.ArrayList;
import java.util.List;

public class Progam {

	public static void main(String[] args) {
		//Aqui modificamos o comparador para ficar fora da classe product , pois se um dia o metodo de comparação mudar 
		//precisaremos mudar também o compare da classe product , o que não vai acontecer com as modificações feitas nesse código 
		//Nesse cenario precisaremos criar uma classe qie ira fazer a comparação que no nosso caso e Mycomparator para fazer isso
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.00));
		list.add(new Product("Notebook",1900.00));
		list.add(new Product("Tablet",450.00));
		
		list.sort(new Mycomparator());
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	
	}

}

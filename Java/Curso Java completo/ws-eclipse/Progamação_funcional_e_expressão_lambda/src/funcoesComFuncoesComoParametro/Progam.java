package funcoesComFuncoesComoParametro;

import java.util.ArrayList;
import java.util.List;


public class Progam {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 80.00));
		
		ProductService ps = new ProductService();
		
		double sm = ps.filteredSum(list,p -> p.getName().charAt(0)=='M');
		
		System.out.println("Sum = "+ String.format("%.2f", sm));
	}

}

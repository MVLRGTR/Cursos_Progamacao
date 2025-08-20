package comparator_exp;

import java.util.Comparator;

public class Mycomparator implements Comparator<Product>{

	//Aqui faço a aplicação do comparator , lembrando que 1 para o primeiro maior que o segundo , 0 para igual e -1 para quando o primeiro menor que o segundo
	
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	
	

}

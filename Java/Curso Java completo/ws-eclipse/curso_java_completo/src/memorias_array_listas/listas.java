package memorias_array_listas;

import java.util.ArrayList;
import java.util.List;

public class listas {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco"); 
		System.out.println("Tamanho da lista : "+list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		list.removeIf(x -> x.charAt(0)== 'M'); //removendo todas as posições onde o primeiro char é igual a M
		
		System.out.println("---------------------------");
		System.out.println("Index of Bob : "+list.indexOf("Bob"));
		System.out.println("Index of lopes : "+list.indexOf("lopes")); //retorna -1 quando não encontra o elemento
		
		for(String x : list) {
			System.out.println(x);
		}
		
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').toList(); //Filtrando da lista todos os nomes que começam com A
		System.out.println("---------------------------");
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null); // filtrar o 1º nome achado na lista que começa com a
		System.out.println(name);
		
		
		
		
	}
}

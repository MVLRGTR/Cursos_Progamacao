package map;

import java.util.Map;
import java.util.TreeMap;

public class Progam {

	public static void main(String[] args) {
		
		/*
		 * Bem parecido com set o MAP é utilizado para armazenar coleções com a diferença que agora utilizamoms chave valor
		 *  
		 * HashMap - mais rápido (operações 0(1) em tabela hash) e não ordenado
		 * TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou comparator)
		 * LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados 
		 * 
		 * */
		
		Map<String,String> cookies = new TreeMap<>();
		
		cookies.put("value01", "Maria");
		cookies.put("value02", "Sobral");
		cookies.put("username","maria");
		cookies.put("email","maria@gmail.com");
		cookies.put("phone", "99711122");
		cookies.put("phone", "99711133");
		
		cookies.remove("value01");
		
		System.out.println("Contains 'phone' key : " + cookies.containsKey("phone"));
		System.out.println("Phone number : " + cookies.get("phone"));
		System.out.println("Email : "+cookies.get("testenull"));
		System.out.println("Size : "+cookies.size());
		System.out.println();
		
		System.out.println("AllCookies");
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": "+ cookies.get(key));
		}

	}

}

package stream_exe;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o caminho do arquivos csv :");
		String path = sc.nextLine();

		List<Product> productsList = FileReaderPath.Reader(path);
		
		/*double sum = productsList.stream().mapToDouble(Product::getPrice).sum();
		double avg = productsList.stream().mapToDouble(Product::getPrice).average().orElse(0.0);
		System.out.println("Sum : "+ sum);
		System.out.println("Avarege Price : "+ avg);
		*/
		
		Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		double avg = productsList.stream().map(Product::getPrice).reduce(0.0, (x,y) -> x+y) / productsList.size();
		List<String> names = productsList.stream()
				.filter(x -> x.getPrice() <= avg)
				.map(x -> x.getName())
				.sorted(comp.reversed())
				.collect(Collectors.toList());
		
		System.out.println("Avarege Price : "+String.format("%.2f",avg));
		names.forEach(System.out::println);
		
		sc.close();
	}

}

package introGen;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<String> list = new PrintService<>();
		
		System.out.print("How many values put will in your list ?");
		int values = sc.nextInt();
		
		for(int i = 0 ; i < values ; i++) {
			System.out.print("Enter the value :");
			list.addValue(sc.next());
			System.out.println();
		}
		
		System.out.println(list.print());
		System.out.println("First List : " + list.first());
		sc.close();

	}

}

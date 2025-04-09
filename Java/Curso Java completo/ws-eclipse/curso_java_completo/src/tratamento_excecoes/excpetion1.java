package tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excpetion1 {

	public static void main(String[] args) {
		System.out.printf("Enter names:");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			System.out.printf("Enter index position:");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		sc.close();
	}

}

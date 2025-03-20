package topicos_basicos;

import java.util.Scanner;

public class bit6true {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;
		System.out.println("Digite por favor o número para testar seu binario na 6th :");
		int n = sc.nextInt();
		
		if((n&mask) != 0) {
			System.out.println("6th bit is true");
		}else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}

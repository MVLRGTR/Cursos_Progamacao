package estrutura_sequencial;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Por favor digite o valor A :");
		a = sc.nextInt();
		System.out.println("Por favor digite o valor B :");
		b = sc.nextInt();
		
		sc.close();
		
		System.out.printf("O valor da soma de %d e %d é : %d",a,b,a+b);

	}

}

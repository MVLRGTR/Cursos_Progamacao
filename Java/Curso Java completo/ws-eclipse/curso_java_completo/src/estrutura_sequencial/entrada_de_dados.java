package estrutura_sequencial;

import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		Double y;
		char z;
		
		x = sc.next();
		System.out.printf("O valor digitado foi : %s",x );
		
		y = sc.nextDouble();
		System.out.printf("O número digitado foi %.2f",y);
		
		z = sc.next().charAt(0);
		System.out.printf("O char digitado foi o : %c",z);
		
		sc.close();	
	}
}

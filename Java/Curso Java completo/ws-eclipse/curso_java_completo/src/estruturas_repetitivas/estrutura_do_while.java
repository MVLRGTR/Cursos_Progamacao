package estruturas_repetitivas;

import java.util.Scanner;

public class estrutura_do_while {

	public static void main(String[] args) {
		char d = 's';
		float celsiu;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite o valor em Celsius : ");
			celsiu = sc.nextFloat();
			
			System.out.printf("O valor %.0fº celsius em Fahrenheit é %.1fº%n",celsiu,(9*celsiu)/5+32);
			System.out.println("Deseja fazer outra conversão s/n :");
			
			d = sc.next().charAt(0);
			
		}while(d == 's' || d == 's');
		
		sc.close();
	}

}

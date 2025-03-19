package estruturas_repetitivas;

import java.util.Scanner;

public class estrutura_for_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as repetições :");
		int n = sc.nextInt();
		float soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o valor que deseja somar :");
			float x = sc.nextFloat();
			soma+=x;
		}
		sc.close();
		System.out.printf("O valor da soma é : %.2f ",soma);
	}
}

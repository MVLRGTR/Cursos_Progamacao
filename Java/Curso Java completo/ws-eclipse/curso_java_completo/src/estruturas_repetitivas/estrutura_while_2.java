package estruturas_repetitivas;

import java.util.Scanner;

public class estrutura_while_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		double soma = 0;
		
		while(x != 0) {
			System.out.println("Digite um número diferente de 0 :");
			x = sc.nextInt();
			soma+=x;
		}
		System.out.printf("Você digitou 0 então o progama será fechado !!! a soma dos números digitados é : %.2f",soma);
		sc.close();
	}

}

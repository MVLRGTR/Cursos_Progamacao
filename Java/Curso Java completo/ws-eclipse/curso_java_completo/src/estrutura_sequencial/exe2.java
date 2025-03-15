package estrutura_sequencial;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float raio;
		
		System.out.println("Por favor digite o raio da circunferencia para calcularmos a sua area :");
		raio = sc.nextFloat();
		
		sc.close();
		
		System.out.printf("O valor do raio é : %.4f", Math.PI*(Math.pow(raio, 2.0)));

	}

}

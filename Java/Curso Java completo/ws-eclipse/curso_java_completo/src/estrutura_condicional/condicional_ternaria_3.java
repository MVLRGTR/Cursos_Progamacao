package estrutura_condicional;

import java.util.Scanner;

public class condicional_ternaria_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco;
		
		System.out.println("Por favor digite o preço para verificar desconte :");
		preco = sc.nextDouble();
		sc.close();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05 ;
		
		System.out.printf("O valor do  desconto é : %.2f",desconto);
	
	}

}

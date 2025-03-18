package estrutura_condicional;

import java.util.Scanner;

public class expressoes_logicas_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x ;
		
		System.out.println("Por favor digite a hora no formato 24h :");
		x = sc.nextInt();
		
		if (x<12) {
			System.out.printf("Bom dia !!!");
		}else if(x>=18){
			System.out.println("Boa Noite !!!");
		}
		else {
			System.out.println("Boa Tarde !!!");
		}
		
		sc.close();

	}

}

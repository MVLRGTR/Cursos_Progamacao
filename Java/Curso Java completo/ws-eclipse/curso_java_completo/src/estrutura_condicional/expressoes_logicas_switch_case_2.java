package estrutura_condicional;

import java.util.Scanner;

public class expressoes_logicas_switch_case_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String dia;
		
		System.out.println("Digite um valor de 1 a 7 :");
		x = sc.nextInt();
		
		switch (x) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda-feira";
				break;
			case 3:
				dia = "Terça-feira";
				break;
			case 4:
				dia = "Quarta-feira";
				break;
			case 5:
				dia = "Quinta-feira";
				break;
			case 6:
				dia = "Sexta-feira";
				break;
			case 7:
				dia = "Sabado";
				break;
			default:
				dia = "Valor Inválido";
		}
		
		System.out.printf("Dia da semana %s :",dia);
		
		sc.close();
		

	}
}

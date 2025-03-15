package estrutura_sequencial;

import java.util.Scanner;

public class entrada_de_dados2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();  /*Ler dados até a quebra de linha*/
		s2 = sc.nextLine();  /*Correção do consumo da quebra de linha*/
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}

}

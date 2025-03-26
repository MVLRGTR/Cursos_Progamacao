package memorias_array_listas;

import java.util.Scanner;


public class vetor1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade entrada :");
		int quantity = sc.nextInt();
		double smedia = 0;
		double[] vect = new double[quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.printf("%nDigite a altura da %d pessoa :",i+1);
			double alt = sc.nextDouble();
			vect[i] = alt;
			smedia += alt;
		}
		
		System.out.printf("A media das entradas digitadas é : %.2f",smedia/quantity);
		sc.close();
	}
}

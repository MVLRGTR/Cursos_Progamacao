package memorias_array_listas;

import java.util.Scanner;

public class Progam_quartos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alocation;
		
		System.out.printf("How many room will be rented ? :");
		alocation = sc.nextInt();
		
		Quartos[] vetorQuartos = new Quartos[10];
		
		for(int i = 0 ; i < alocation ; i++) {
			System.out.printf("%nRent #%d",i+1);
			System.out.printf("%nName :");
			String name = sc.next();
			System.out.printf("email :");
			String email = sc.next();
			System.out.printf("Room :");
			int numberRoom = sc.nextInt();
			vetorQuartos[i] = new Quartos(numberRoom,name,email);
		}
		
		System.out.println("Busy rooms :");
		for(int i = 0 ; i < vetorQuartos.length ; i++) {
			if(vetorQuartos[i] != null) {
				System.out.println(vetorQuartos[i]);
			}
		}
		sc.close();
	}

}

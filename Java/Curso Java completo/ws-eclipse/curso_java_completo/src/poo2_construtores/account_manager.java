package poo2_construtores;

import java.util.Locale;
import java.util.Scanner;

public class account_manager {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account Number :");
		int number = sc.nextInt();
		System.out.print("Enter account Holder :");
		String holder = sc.next();
		
		System.out.print("Is there na initial deposit (y/n) : ");
		char decision = sc.next().charAt(0);
		
		if(decision == 'y') {
			System.out.printf("%nEnter initial deposit value : ");
			double value = sc.nextDouble();
			conta = new Conta(number , holder , value);
			System.out.printf("Account data : %n"+conta+"%n");
		}else {
			conta = new Conta(number , holder);
			System.out.printf("%nAccount data : %n"+conta+"%n");
		}
		
		System.out.printf("%nEnter a deposit value :");
		conta.depositAmount(sc.nextDouble());
		System.out.printf("Update account data : %n"+conta+"%n");
		
		System.out.printf("%nEnter a withdraw value :");
		conta.dropValue(sc.nextDouble());
		System.out.printf("%nUpdate account data : %n"+conta);
		
		sc.close();
	}

}

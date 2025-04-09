package tratamento_excecoes_exe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgamAccount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Account data");
			System.out.printf("Number :");
			Integer number = sc.nextInt();
			
			System.out.printf("Holder name:");
			String holder = sc.next();
			
			System.out.printf("Initial Balance :");
			Double initialBalance = sc.nextDouble();
			
			System.out.printf("Withdraw limit :");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number,holder,initialBalance,withdrawLimit);
			
			System.out.println();
			System.out.printf("Enter amount for withdraw :");
			account.withDraw(sc.nextDouble());
			
			System.out.printf("Account new balance : %.2f",account.getBalance());
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid input format. Please enter numbers for numeric fields.");
			if (sc.hasNext()) {
                sc.next(); // Limpa o token inválido do scanner
            }
		}catch(AccountExeception e) {
			System.out.printf("Erro in operation : %s",e.getMessage());
		}finally {
			sc.close();
		}

	}

}

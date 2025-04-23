package interfaces_exe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgamContract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato :");
		System.out.printf("Numero :");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("Data dd/MM/yyyy :");
		String dataStr = sc.nextLine();
		LocalDate date = LocalDate.parse(dataStr,fmt1);
		
		System.out.printf("Valor do contrato :");
		Double value = sc.nextDouble();
		
		System.out.printf("Número de parcelas : ");
		int installments = sc.nextInt();
		
		Contract contract = new Contract(number,date,value);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, installments);
		
		System.out.printf(contract.toString());
		
		sc.close();

	}

}

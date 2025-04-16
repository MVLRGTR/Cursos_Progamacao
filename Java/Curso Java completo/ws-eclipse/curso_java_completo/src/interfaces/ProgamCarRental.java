package interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgamCarRental {

	public static void main(String[] args) {
	
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do aluguel :");
		
		System.out.printf("Modelo do carro :");
		String carModel =sc.nextLine();
		
		System.out.printf("Retirada (dd/MM/yyyy hh:mm) :");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
		
		System.out.printf("Retorno (dd/MM/yyyy hh:mm) :");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
		
		CarRental carRental = new CarRental(start,finish,new Vechile(carModel));

		System.out.printf("Entre com o preço por hora :");
		Double pricePerHour = sc.nextDouble();
		
		System.out.printf("Entre com o preço por dia :");
		Double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println("Fatura :");
		System.out.println("Pagamento Basico :" + carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto : "+carRental.getInvoice().getTax());
		System.out.println("Pagamento Total : "+carRental.getInvoice().totalPayment());
		
		sc.close();

	}

}

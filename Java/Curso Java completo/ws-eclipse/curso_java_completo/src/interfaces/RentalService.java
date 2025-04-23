package interfaces;

import java.time.Duration;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;
	
	/*SEM A INTERFACE TEMOS O ACLOPAMENTO ENTRE RENTALSERVICE E BRASILTAXSERVICE , OU SEJA SEMPRE QUE EU MUDAR DE PAIS DUAS CLASSES SERÃO MODIFICADAS,
	 * COISA ESSA QUE NÃO ACONTECE QUANDO APLICO UMA INTEFACE
	 * ANTES DA INTERFACE //RENTALSERVICE -> BRASILTAXSERVICE APOS INTERFACE // RENTALSERVICE -> TAXSERVICE <- BRASILTAXSERVICE*/
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes /60;
		double basicPayment = 0;
		
		if( hours <=12.0) {
			basicPayment = pricePerHour *  Math.ceil(hours);
		}else {
			basicPayment = pricePerDay *  Math.ceil(hours/24);
		}
		
		double tax = this.taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment,tax));
	}
	
	
}

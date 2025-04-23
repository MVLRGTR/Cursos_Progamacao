package interfaces_exe;

public class PaypalService implements OnlinePaymentService {
	
	@Override
	public double interest(double amount,int months) { //TAXA DE JUROS
		return amount * (0.01*months);
	}
	
	@Override
	public double paymentFee(double amount) { //TAXA DE PAGAMENTO
		return 0.02 * amount;
	}

}

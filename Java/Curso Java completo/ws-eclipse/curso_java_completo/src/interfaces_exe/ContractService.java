package interfaces_exe;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		double amount = contract.getTotalValue()/months;
		
		for(int i = 0 ; i < months ;i++) {
			Installment installment =  new Installment();
			installment.setDueDate(contract.getDate().plusMonths(i+1));
			double valueinstallment = amount + this.onlinePaymentService.interest(amount, i+1);
			valueinstallment += this.onlinePaymentService.paymentFee(valueinstallment);
			installment.setAmount(valueinstallment);
			contract.setInstallments(installment);		
		}
	}
}

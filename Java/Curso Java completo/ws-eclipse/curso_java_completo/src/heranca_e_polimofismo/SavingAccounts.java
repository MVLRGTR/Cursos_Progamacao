package heranca_e_polimofismo;

public final class SavingAccounts extends Account{ //AO APLICAR FINAL ANTES DA CLASSE EU DIGO AO JVA QUE A CLASSE ATUAL NÃO PODE TER SUB-CLASSES
	
	private Double interestRate;

	public SavingAccounts(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override // COMO ESSE METODO ELE EXISTE EM ACCOUNT UTLIZO O OVERRIDA PARA SOBRESCREVER AQUELE METODO 
	public final void witdraw(double amount) { //O FINAL EM METODOS ME INFORMA QUE ELE NÃO PODE SER SOBREPOSTO EM SUB-CLASSES , NESSE CASO SE TIVESSEMOS UMA SUB CLASSE DESSA ATUAL ELE NÃO PODERIA SER SOBREPOSTO
		balance-=amount;
	}
}

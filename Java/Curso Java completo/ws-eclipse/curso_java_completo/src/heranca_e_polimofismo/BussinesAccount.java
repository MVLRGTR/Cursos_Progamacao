package heranca_e_polimofismo;

public class BussinesAccount extends Account{  // informo que a clasee Bussines é uma extenção da Account , herdando todos os parametros
	
	private Double loanLimit;
	
	
	public BussinesAccount() {
		super(); // serve para repitir a logica do construtor padrão ou em outras ocasioes chamar metodos da super classe
	}


	public BussinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() {
		return loanLimit;
	}


	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0; //para que a operação acontece eu preciso que o valor balance seja protect para que as sub classes tenham acesso a esse valor
		}
	}
	
	@Override // COMO ESSE METODO ELE EXISTE EM ACCOUNT UTLIZO O OVERRIDA PARA SOBRESCREVER AQUELE METODO EXPLICITANDO ISSO PARA O COMPILADOR
	public void witdraw(double amount) {
		super.witdraw(amount);//AQUI EU CHAMO O METODO DA SUPERCLASSE UTILIZANDO O SUPER
		balance -= 2;
	}
	
}

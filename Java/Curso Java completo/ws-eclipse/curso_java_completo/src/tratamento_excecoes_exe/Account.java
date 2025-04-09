package tratamento_excecoes_exe;


public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	
	
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withDraw(Double amount) {
		if(amount > this.withDrawLimit) {
			throw new AccountExeception("Withdrawal amount greater than your withdrawal limit !!!");
		}
		if(amount > balance) {
			throw new AccountExeception("Not enough balance for withdrawal !!!");
		}
		
		balance -= amount;
		
	}
	
}

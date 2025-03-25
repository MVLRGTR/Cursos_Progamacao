package poo2_construtores;

public class Conta{
	private int number;
	private String holder;
	private double amount;
	
	public Conta(int number, String holder , double amount){
		this.number = number;
		this.holder = holder;
		depositAmount(amount); //importante , ao invés de modificar diretamenta com o this eu chamo o metodo de depositar 
	}
	
	public Conta(int number, String holder ){
		this.number = number;
		this.holder = holder;
		
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getAmount() {
		return amount;
	}

	public int getNumber() {
		return number;
	}
	
	public void depositAmount(double amount){
		this.amount += amount;
	}
	
	public void dropValue(double value) {
		if(this.amount >= value){
			this.amount -= value + 5;
			
		}else {
			System.out.println("Insuficient balance for withdrawal !!!");
		}
	}

	public String toString() {
		return "Account  "+
		number + 
		", "+
		"Holder: "+
		holder +
		", "+
		"Balance : $ "+
		amount;
		}
	
}

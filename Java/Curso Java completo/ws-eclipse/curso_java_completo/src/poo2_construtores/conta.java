package poo2_construtores;

public class conta{
	private int number;
	private String holder;
	private double amount;
	
	public conta(int number, String holder , double amount){
		this.number = number;
		this.holder = holder;
		this.amount = amount;
	}
	
	public conta(int number, String holder ){
		this.number = number;
		this.holder = holder;
		
	}
	
	public String toString() {
		return "Account Data :%n"
		+ "Account  "+
		number + 
		", "+
		"Holder: "+
		holder +
		", "+
		"Balance : $ "+
		amount;
		}
	
}

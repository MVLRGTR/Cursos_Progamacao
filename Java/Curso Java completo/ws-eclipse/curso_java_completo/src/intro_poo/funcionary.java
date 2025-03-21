package intro_poo;

public class funcionary {
	String name;
	Double salary,tax;
	
	public double LiquidSalary() {
		return salary-tax;
	}
	
	public void IncreaseSalaryPercent(float percent) {
		salary += (salary*(percent/100));
	}
	
	public String toString() {
        return "Nome: " + name + ", Salário Líquido: $" + String.format("%.2f", LiquidSalary());
    }

}

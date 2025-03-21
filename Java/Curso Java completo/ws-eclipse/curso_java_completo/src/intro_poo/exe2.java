package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class exe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		funcionary funcionario;
		funcionario = new funcionary();
		
		System.out.println("Name :");
		funcionario.name = sc.next();
		System.out.println("Salario Bruto :");
		funcionario.salary = sc.nextDouble();
		System.out.println("Imposto :");
		funcionario.tax = sc.nextDouble();
		
		System.out.printf("Nome : %s , $ %.2f %n",funcionario.name,funcionario.LiquidSalary());
		
		System.out.println("Qual percentual deseja adicionar ao salario :");
		funcionario.IncreaseSalaryPercent(sc.nextFloat());
		
		System.out.printf("Funcionario atualizado : %s ,%.2f",funcionario.name,funcionario.LiquidSalary());
		
		sc.close();
		

	}

}

package curso;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35698;
		Locale.setDefault(Locale.US);
		System.out.println("Olá mundo !!!"); //para termos a quebra de linha
		System.out.print("Bom dia , o número da sorte hoje é :");	
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros",x);
		
	}

}

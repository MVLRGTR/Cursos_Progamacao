package progam;

import java.util.Scanner;

import entities.Pilha;

public class UsePilha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pilha pilha = new Pilha();
		
		System.out.print("Digite a expressão no formato pós fixado (52+ == 5+2 ):");
		String express =sc.next();
		
		char[] expresschar = express.toCharArray();
		
		for(char c : expresschar) {
			if(c=='+'|| c == '-' || c == '*' || c == '/') {
				int v1 = pilha.desempilhar().valor;
				int v2 = pilha.desempilhar().valor;
				
				if(c=='+') {
					pilha.empilhar(v2+v1);
				}else if(c=='-'){
					pilha.empilhar(v2-v1);
				}else if(c=='*') {
					pilha.empilhar(v2*v1);
				}else if(c=='/') {
					pilha.empilhar(v2/v1);
				}
				
			}else {
				int numero = Character.getNumericValue(c);
				pilha.empilhar(numero);
			}
		}
		System.out.println("O valor da expressão é : "+pilha.mostraTopo().valor);
		
		sc.close();

	}

}

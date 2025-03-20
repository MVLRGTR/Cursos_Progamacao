package topicos_basicos;

public class operador_bitwise {

	public static void main(String[] args) {
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		/*
		 * 0101 1001 & 0011 1100 -> 0001 1000 os dois valores do bit tem quer ser 1 para a saída 1
		 * 0101 1001 | 0011 1100 -> 0111 1101 pelo menos um bit tem que ser verdadeiro para sáida 1
		 * 0101 1001 ^ 0011 1100 -> 0110 0101 Porta XOR (OU EXCLUSIVO) saída verdadeira quando apenas e somente um lado é verdadeiro
		 * 
		 * */
	}

}

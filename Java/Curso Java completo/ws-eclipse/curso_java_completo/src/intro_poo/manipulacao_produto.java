package intro_poo;

import java.util.Scanner;

public class manipulacao_produto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		produtoPoo tv1;
		tv1 = new produtoPoo();
		
		System.out.println("Digite o Nome do Produto :");
		tv1.name = sc.next();
		System.out.println("Digite o Preço do Produto :");
		tv1.price = sc.nextDouble();
		System.out.println("Digite a quantide em estoque do Produto :");
		tv1.quantity = sc.nextInt();
		
		System.out.printf("Product Data : %s %n",tv1);
		
		System.out.println("Digite a quantidade para adicionar ao stock :");
		tv1.addProducts(sc.nextInt());
		System.out.printf("Update Data : %s %n",tv1);
		
		System.out.println("Digite a quantidade para remover do stock :");
		tv1.removeProducts(sc.nextInt());
		System.out.printf("Update Data : %s %n",tv1);
		
		sc.close();

	}

}

package memorias_array_listas;

import java.util.Scanner;

import poo2_construtores.Product;

public class vetor_objetos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade entrada :");
		int quantity = sc.nextInt();
		double smedia = 0;
		Product[] vetorObj = new Product[quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.printf("%nDigite o nome do produto :");
			String name = sc.next();
			System.out.printf("Digite o preço do produto :");
			Double price = sc.nextDouble();
			System.out.printf("Digite a quantidade em estoque do produto :");
			int quantityEs = sc.nextInt();
			vetorObj[i] = new Product(name,price,quantityEs);
			smedia += price;
		}
		System.out.printf("%nO valor da média do valor dos produtos é :R$ %.2f",smedia/quantity);
		sc.close();
	}

}

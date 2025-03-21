package intro_poo;

import java.util.Scanner;
//import entites.TrianglePoo;


public class triangulo {

	public static void main(String[] args) {
		TrianglePoo triangulo1 ,triangulo2  ;
		triangulo1 = new TrianglePoo();
		triangulo2 = new TrianglePoo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores a,b,c do triangulo 1 :");
		triangulo1.a = sc.nextDouble();
		triangulo1.b = sc.nextDouble();
		triangulo1.c = sc.nextDouble();
		
		System.out.println("Digite os valores a,b,c do triangulo 1 :");
		triangulo2.a = sc.nextDouble();
		triangulo2.b = sc.nextDouble();
		triangulo2.c = sc.nextDouble();
		
		System.out.printf("O valor do perimetro do triangulo 1 é : %.2fm² %n",triangulo1.areaTriangulo());
		System.out.printf("O valor do perimetro do triangulo 2 é : %.2fm² %n",triangulo2.areaTriangulo());
		
		sc.close();
	}
	


}

package progam;

import entities.Fila;

public class UseFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		System.out.println("Enfileirando...");
		
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		fila.inserir(5);
		
		System.out.println("Mostrando primeiro da fila : " + fila.mostrarFrente().valor);
		System.out.println("Mostrando tamanho da fila : "+ fila.tamanho());
		
		while(!fila.estaVazio()) {
			System.out.println("Retirando : "+ fila.retira().valor);
		}

	}

}

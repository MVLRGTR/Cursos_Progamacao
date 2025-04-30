package progam;

import entities.Lista;

public class UseLista {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println("Colocando na lista os elementos...");
		
		lista.inserirPrimeiro(1);
		lista.inserirUltimo(2);
		lista.inserirUltimo(3);
		lista.inserirUltimo(4);
		lista.inserirUltimo(5);
		
		System.out.println("tamanho lista : "+lista.tamanho());
		
		for(int i =0 ;  i< lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
		

	}

}

package progam;

import entities.ListaDuplamenteEncadeada;

public class UseListaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		System.out.println("Colocando na lista os elementos...");
		
		lista.inserePrimeiro("Orçamento", 3);
		lista.insereUltimo("Decidir orçamento", 2);
		lista.insereUltimo("Comprar materias", 5);
		lista.insereUltimo("Colocar mão de obra", 1);
		lista.insereUltimo("Limpar area da construção",15);
		lista.insereUltimo("Construir paredes", 30);
		lista.insereUltimo("Construir pilares", 15);
		lista.insereUltimo("Fazer caixão da casa", 7);
		lista.insereUltimo("Encher caixão", 3);
		lista.insereUltimo("Bater a lage", 7);
		
		
		System.out.println("Tamanho da lista : "+lista.tamanho());
		System.out.println("-------------------------");
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}

	}

}

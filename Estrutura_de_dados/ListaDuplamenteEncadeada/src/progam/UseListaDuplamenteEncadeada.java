package progam;

import entities.Etapa;
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
		
		System.out.println("-------------------------");
		System.out.println("Tamanho da lista : "+lista.tamanho());
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Inserindo Contratar pessoal na posicao 4...");
		lista.insereNaPosicao("Contratar pessoal", 2, 4);
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Mostrando primeiro e ultimo elemento da lista : "+lista.primeiro()+" - "+lista.ultimo());
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo primeiro elemento da lista... ");
		lista.removePrimeiro();
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo ultimo elemento da lista... ");
		lista.removeUltimo();
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo elemento na posição 3 ... ");
		lista.removeNaPosicao(3);
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo elemento Encher caixão... ");
		Etapa etapa = new Etapa("Encher caixão",3);
		lista.removeElemento(etapa);
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).toString());
		}
		
		lista.removeNaPosicao(7);
	}

}

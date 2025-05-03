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
		lista.inserirUltimo(6);
		lista.inserirUltimo(7);
		lista.inserirUltimo(8);
		
		System.out.println("Retornando elemento na posição 0 : "+lista.elementoNaPosicao(0).valor);
		
		System.out.println("Tamanho da lista : "+lista.tamanho());
		System.out.println("-------------------------");
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
		
		System.out.println("-------------------------");
		System.out.println("Inserindo na posição 5 o valor 10... ");
		lista.inserirNaPosicao(5,10);
		System.out.println("Mostrando lista...");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
		
		System.out.println("-------------------------");
		System.out.println("Retornando primeiro e ultimo elemento  : {" + lista.primeiroElemento().valor + "} - {"+lista.ultimoElemento().valor+"}");
		
		System.out.println("-------------------------");
		System.out.println("Retornando elemento na posição 6 : "+lista.elementoNaPosicao(6).valor);
		
		System.out.println("-------------------------");
		System.out.println("Removendo primeiro elemento :");
		lista.removePrimeiro();
		System.out.println("Mostrando lista...");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo ultimo elemento :");
		lista.removeUltimo();;
		System.out.println("Mostrando lista...");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo elemento na posição 3 :");
		lista.removeNaPosicao(3);
		System.out.println("Mostrando lista...");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo elemento 6 :");
		lista.removeElemento(6);
		System.out.println("Mostrando lista...");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
		
		System.out.println("-------------------------");
		System.out.println("Buscando elemento 5 Posição : "+(lista.buscaElemento(5)+1));
		System.out.println("Mostrando lista...");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i).valor);
		}
	
		
	}
}

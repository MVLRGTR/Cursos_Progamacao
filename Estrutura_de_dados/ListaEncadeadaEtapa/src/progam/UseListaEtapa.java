package progam;

import entities.Etapa;
import entities.Lista;

public class UseListaEtapa {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println("Colocando na lista os elementos...");
		
		lista.inserePrimeiro("Orçamento", 3);
		lista.insereUltimaPosicao("desição da equipe", 1);
		lista.insereUltimaPosicao("comprar materias", 2);
		lista.insereUltimaPosicao("construir etapa 1",60);
		lista.insereUltimaPosicao("construir etapa 2",90);
		lista.insereUltimaPosicao("construir etapa 3",30);
		lista.insereUltimaPosicao("construir etapa 4",20);
		lista.insereUltimaPosicao("construir etapa 5",30);
		
		System.out.println("Tamanho da lista : "+lista.tamanho());
		System.out.println("-------------------------");
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.etapaNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Inserindo Etapa na posição 3...");
		lista.insereNaPosicao("Lista de materiais",3,3);
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.etapaNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Mostrando 1° etapa : "+lista.primeira().toString());
		System.out.println("Mostrando ultima etapa : "+lista.ultima().toString());
		System.out.println("Mostrando etapa na posição 5 : "+lista.etapaNaPosicao(5).toString());
		
		System.out.println("-------------------------");
		System.out.println("Removendo primeira Etapa");
		lista.removePrimeiro();
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.etapaNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo ultima Etapa");
		lista.removeUltimo();
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.etapaNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo Etapa na posição 4...");
		lista.removeNaPosicao(4);
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.etapaNaPosicao(i).toString());
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo Etapa Lista de materiais...");
		lista.removeEtapa(new Etapa("Lista de materiais",3));
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.etapaNaPosicao(i).toString());
		}
	}
}

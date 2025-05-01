package progam;

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

	}

}

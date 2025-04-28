package program;

import entities.Pilha;

public class ProgramPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println("Empilhando...");
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		pilha.empilhar(4);
		
		while(!pilha.estaVazio()) {
			System.out.println("Desempilhando : " + pilha.desempilhar());
		}
	}

}

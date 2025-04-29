package progam;

import entities.Carro;
import entities.PilhaDinamicaCarro;

public class UsePilha {

	public static void main(String[] args) {
		PilhaDinamicaCarro pilha = new PilhaDinamicaCarro();
		System.out.println("Empilhando...");
		
		pilha.empilhar(new Carro("pkd-1925","hb20"));
		pilha.empilhar(new Carro("jnk-5632","ka"));
		pilha.empilhar(new Carro("jkp","corsa"));
		pilha.empilhar(new Carro("rpq-8563","cobalt"));
		
		while(!pilha.estaVazio()) {
			System.out.println("desempilhando : "+ pilha.desempilhar().valor.getNome());
		}
	}

}

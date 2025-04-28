package progam;

import entities.Carro;
import entities.Pilha;

public class UsePilhaCarros {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		System.out.println("Empilhando...");
		Carro carro =  new Carro("pkl-3568","kwid");
		
		pilha.empilhar(carro);
		pilha.empilhar(new Carro("pkd-1925","hb20"));
		pilha.empilhar(new Carro("ped-8563","ka"));
		pilha.empilhar(new Carro("jnk-1745","ranger"));
		pilha.empilhar(new Carro("rpq-1563","cobalt"));
		
		while(!pilha.estaVazio()) {
			System.out.println("Desempilhando : " + ((Carro) pilha.desempilhar()).getNome());
		}

	}

}

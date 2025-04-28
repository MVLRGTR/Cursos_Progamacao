package progam;

import entities.PilhaInteiros;

public class ProgamPilhaInteiros {

	public static void main(String[] args) {
		PilhaInteiros pilha = new PilhaInteiros();
		pilha.empilhar(2);
		pilha.empilhar(4);
		pilha.empilhar(6);
		System.out.println("Topo : "+pilha.mostrarTopo());
		System.out.println("Está vazia : "+pilha.estaVazio());
		System.out.println("Desempilhando : "+pilha.desempilhar());
		System.out.println("Tamanho : "+pilha.tamanho());
		System.out.println("Desempilhando : "+pilha.desempilhar());
		System.out.println("Desempilhando : "+pilha.desempilhar());
		System.out.println("Desempilhando : "+pilha.desempilhar());
		System.out.println("Está vazia : "+pilha.estaVazio());
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		pilha.empilhar(4);
		pilha.empilhar(5);
		while (pilha.estaVazio() == false) {
		System.out.println(pilha.desempilhar());
		}

	}

}

package progam;

import entities.PilhaObjetos;

public class UsaPilhaObjetos {

	public static void main(String[] args) {
		PilhaObjetos p = new PilhaObjetos();
		p.empilhar("Portuguesa ");
		p.empilhar("Frango com catupiry ");
		p.empilhar("Calabresa ");
		p.empilhar("Quatro queijos ");
		p.empilhar(10);
		while (p.estaVazio() == false) {
			System.out.println(p.desempilhar());
		}

	}

}

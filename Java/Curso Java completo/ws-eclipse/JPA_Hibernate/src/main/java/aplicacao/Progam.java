package aplicacao;

import dominio.Pessoas;

public class Progam {

	public static void main(String[] args) {
		Pessoas pessoa = new Pessoas(1,"Carlos Santos Silva","carlos@gmail.com");
		Pessoas pessoa2 = new Pessoas(2,"Cesar Lopes","cesar@gmail.com");
		Pessoas pessoa3 = new Pessoas(3,"Murilo Gomes","murilo@gmail.com");
		
		System.out.println(pessoa);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		
	}

}

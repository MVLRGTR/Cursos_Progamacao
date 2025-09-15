package aplicacao;

import dominio.Pessoas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Progam {

	public static void main(String[] args) {
		
		/*Pessoas pessoa = new Pessoas(null,"Carlos Santos Silva","carlos@gmail.com");
		Pessoas pessoa2 = new Pessoas(null,"Cesar Lopes","cesar@gmail.com");
		Pessoas pessoa3 = new Pessoas(null,"Murilo Gomes","murilo@gmail.com");
		*/
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*em.getTransaction().begin(); // no jpa utilizamos o beggin e commit para definir uma transação no bd
		em.persist(pessoa);
		em.persist(pessoa2);
		em.persist(pessoa3);
		em.getTransaction().commit();
		*/
		
		//o jpa só remove um objeto que está monitorado no contexto , ou seja eu não posso instnaciar o objeto e mandar o jpa remover
		//tenho que puxar do banco de dados Pessoas p = em.find(Pessoas.class,2); e depois em.remove(p);
		
		Pessoas p = em.find(Pessoas.class, 2);
		System.out.println(p);
		
		System.out.println("Finished");
		em.close();
		emf.close();
		
	}

}

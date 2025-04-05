package initialOO_enumeracoes_composicao;

import java.time.LocalDateTime;

public class ProgamPostComment {
	public static void main(String[] args) {
		
		String title1 = "My way !";
		String title2 = "Back to the future ! ";
		
		String content1 = "I found my way when I was in the desert";
		String content2 = "I often find myself thinking about the future and what will happen with so much technology";
		
		Comment c1 = new Comment("Have a nice trip !");
		Comment c2 = new Comment("Wow that´s awesome !");
		
		Comment c3 = new Comment("Good night !");
		Comment c4 = new Comment("May the force be with you !");
		
		LocalDateTime moment1 =  LocalDateTime.parse("2025-02-20T13:05:44");
		LocalDateTime moment2 =  LocalDateTime.parse("2025-03-20T23:14:19");
		
		Post post1 = new Post(moment1,title1,content1,2);
		Post post2 = new Post(moment2,title2,content2,3);
		
		post1.addComent(c1);
		post1.addComent(c2);
		post2.addComent(c3);
		post2.addComent(c4);
		
		System.out.println(post1);
		System.out.println();
		System.out.println(post2);
		
	}
}

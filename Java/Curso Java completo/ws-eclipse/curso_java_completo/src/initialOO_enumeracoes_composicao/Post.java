package initialOO_enumeracoes_composicao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	private LocalDateTime moment;
	private String title;
	private String content;
	private int likes;
	private List<Comment> comments = new ArrayList<>(); 
	
	public Post() {
		
	}
	
	public Post(LocalDateTime moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComent(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComent(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes);
		sb.append(" Likes - ");
		String momentdate = fmt.format(this.moment);
		sb.append(momentdate + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments :\n");
		
		for(Comment comment : comments) {
			sb.append(comment);
		}
		
		return sb.toString();
	}
	
	
}

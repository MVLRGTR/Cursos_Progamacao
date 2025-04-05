package initialOO_enumeracoes_composicao;

public class Comment {
	private String comment;
	
	public Comment() {
		
	}
	
	public Comment(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String toString() {
		return "[Comment =" + comment + "]";
	}
	
	
}

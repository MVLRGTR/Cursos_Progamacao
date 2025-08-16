package exeMap;

import java.util.Objects;

public class Candidate implements Comparable<Candidate>{

	private String name;
	private int votes;
	
	public Candidate(String name,Integer votes) {
		this.name=name;
		this.votes=votes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	
	public void addVotes(int votes) {
		this.votes+=votes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Candidate other) {
		return this.name.compareToIgnoreCase(other.name);
	}
	
	
}

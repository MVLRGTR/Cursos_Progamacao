package entities;

public class Etapa {
	
	public String name;
	public int duration;
	public Etapa proximo = null;
	public Etapa anterior = null;
	
	public Etapa(String name,int duration) {
		this.name=name;
		this.duration=duration;
	}
}

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
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("entrou aqui");
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;

	    Etapa other = (Etapa) obj;
	    return duration == other.duration &&
	           (name != null ? name.equals(other.name) : other.name == null);
	}

	@Override
	public int hashCode() {
	    int result = 17;
	    result = 31 * result + (name != null ? name.hashCode() : 0);
	    result = 31 * result + duration;
	    return result;
	}

	@Override
	public String toString() {
		return "[Etapa = " + name + ", com duração = " + duration + " dias" + "]";
	}
}

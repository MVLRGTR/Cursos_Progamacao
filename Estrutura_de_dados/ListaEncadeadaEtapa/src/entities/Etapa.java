package entities;

import java.util.Objects;

public class Etapa {
	public String name;
	public int Duration;
	public Etapa proximo;
	
	public Etapa(String name,int Duration) {
		this.name = name;
		this.Duration = Duration;
		this.proximo = null;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;

        Etapa other = (Etapa) obj;
        return this.Duration == other.Duration && Objects.equals(this.name, other.name);
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Duration);
    }

	@Override
	public String toString() {
		return "[Etapa :" + name + ", Duration : " + Duration + "]";
	}
    
    
}

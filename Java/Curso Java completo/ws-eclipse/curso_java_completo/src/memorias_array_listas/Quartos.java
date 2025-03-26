package memorias_array_listas;

public class Quartos {
	private int numberRoom;
	private String nameRent;
	private String email;
	
	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String getNameRent() {
		return nameRent;
	}

	public void setNameRent(String nameRent) {
		this.nameRent = nameRent;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Quartos(int numberRoom,String nameRent, String email) {
		this.numberRoom = numberRoom;
		this.nameRent = nameRent;
		this.email = email;
	}
	
	public String toString(){
		return this.nameRent + ", " + this.email +", Room Number : " + this.numberRoom;
	}
	
}

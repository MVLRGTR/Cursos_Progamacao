package memorias_array_listas;

public class foreach {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		for (int i=0; i< vect.length; i++) {
		System.out.println(vect[i]);
		}
		for (String obj : vect) {
		System.out.println(obj);
		}

	}

}

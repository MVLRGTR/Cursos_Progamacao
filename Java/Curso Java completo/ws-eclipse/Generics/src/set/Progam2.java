package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Progam2 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();

		set.add("Tablet");
		set.add("TV");
		set.add("Notebook");

		//set.removeIf(x -> x.length() >=3 );
		set.removeIf(x -> x.charAt(0) == 'T');

		for (String p : set) {
			System.out.println(p);
		}

	}

}

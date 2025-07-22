package introGen;

import java.util.ArrayList;
import java.util.List;

//O GENERICS SERVE PARA QUE EU POSSA CRIAR UMA CLASSE COM VARIOS TIPOS E FAZER O SEU REUSSO 

public class PrintService<Type> {
	
	List<Type> list = new ArrayList<>();
	
	public void addValue(Type value) {
		list.add(value);
	}
	
	public Type first () {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty!!!");
		}
		return list.get(0);
	}
	
	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0 ; i < list.size();i++) {
			if(i != list.size()-1) {
				sb.append(list.get(i)+",");
			}else {
				sb.append(list.get(i));
			}
			
		}
		sb.append("]");
		return sb.toString();
	}
}

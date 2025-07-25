package tiposCoringa;

import java.util.Arrays;
import java.util.List;

public class Progam {

	public static void main(String[] args) {
		
		//List<Object> myObjs = new ArrayList<Object>();
		//List<Integer> myNumbers = new ArrayList<Integer>();
		//myObjs = myNumber;
		//APESAR DE OBJECT SER UM SUPER TIPO DE INTEGER LIST<OBJECT> NÃO É UM SUPER TIPO LIST<INTEGER>
				
		//O SUPER TIPO DE QUALQUER LISTA E LIST<?>
		
		
		//List<?> myObjs = new ArrayList<Object>();
		//List<Integer> myNumbers = new ArrayList<Integer>();
		//myObjs = myNumbers;
		
		//NO CASO ABAIXO CONSIGO IMPRIMIR LIST DE VARIAS CLASSES
		//UMA OBSERVAÇÃO IMPORTANTE É QUE O TIPO CORINGA DE LIST NÃO PERMITE A ADIÇÃO DE ELEMENTOS
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria","Alex","Joao");
		printList(myStrs);

	}

	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
		
	}

}

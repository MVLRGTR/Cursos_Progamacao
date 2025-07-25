package coringasDelimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Progam2 {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1,2,3,4,5);
		List<Double> myDoubles = Arrays.asList(3.14,5.25,6.35,7.62);
		List<Object> myObjects = new ArrayList<Object>();
		
		copy(myInts,myObjects);
		printList(myObjects);
		copy(myDoubles,myObjects);
		printList(myObjects);
	}
	
	public static void copy(List<? extends Number> source,List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}

}

//No metodo copy na lista source eu tenho o principio da covariancia onde eu consigo fazer o get da lista mas não o put,
// isso acontece porque ao tentar fazer a inserção de um tipo o compilador não vai conseguir identificar que a classe em questão
//que está sendo adicionada é a mesma que está na lista. 

//No metodo copy na lista destiny eu tenho o principio da contravariancia onde eu consigo fazer o put mas não consifgo fazer o get,
//isso ocorre pois nesse tipo de lista eu consigo colocar varias classes dentro dessa lista , mas na hora que eu declaro uma varivél ,
//para fazer o get dessa lista o compilador entende que pode vir qualquer tipo de object para dentro dessa variavél e assim gerar um erro


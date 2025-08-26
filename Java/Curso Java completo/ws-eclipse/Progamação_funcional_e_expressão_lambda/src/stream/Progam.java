package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Progam {

	/*
	 * As streams no java para processar coleções de dados de forma mais eficiente,
	 * concisa e com suporte a paralelismo, permitindo operações funcionais como
	 * filtrar, mapear e reduzir os elementos 
	 * 
	 * Processamento de dados: As streams
	 * atuam como um "wrapper" em torno de fontes de dados, facilitando a
	 * manipulação e o processamento de coleções e outros conjuntos de dados.
	 * 
	 * Funções e estilo funcional: Elas permitem o uso de expressões lambda e o
	 * paradigma funcional, tornando o código mais limpo, legível e fácil de manter.
	 * 
	 * Avaliação preguiçosa (Lazy Evaluation): As operações intermediárias em uma
	 * stream só são executadas quando uma operação terminal é invocada, otimizando
	 * o desempenho, pois o processamento só acontece quando um resultado final é
	 * necessário. 
	 * 
	 * Paralelismo: As streams podem processar dados em paralelo, o que
	 * aproveita o poder de múltiplos núcleos de processadores, aumentando a
	 * velocidade do processamento.
	 * 
	 * Principais categorias de operações:
	 * 
	 * Operações intermediárias: Não produzem um resultado final imediato, mas
	 * transformam ou filtram os elementos do stream. Exemplos incluem filter()
	 * (para selecionar elementos), map() (para transformar cada elemento) e
	 * sorted() (para ordenar os elementos).
	 * 
	 *  Operações terminais: Produzem um
	 * resultado final ou realizam uma ação final na stream. Exemplos incluem
	 * collect() (para agrupar os elementos em uma coleção) e reduce() (para
	 * combinar os elementos em um único valor).
	 */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 10);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Integer> st4 = Stream.iterate(new Integer[] {0,1},p -> new Integer[] {p[1],p[0]+p[1]} ).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(25).toArray()));
		
		int sum = list.stream().reduce(0, (x,y)-> x + y);
		System.out.println("Sum = "+ sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println("NewList Filter stream = "+newList);

	}

}

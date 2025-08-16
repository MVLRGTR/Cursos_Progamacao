package exeMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Progam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line;

		System.out.print("Entre com o caminho do arquivo :");
		String path = sc.nextLine();

		Map<String, Integer> candidates = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			line = br.readLine();

			while (line != null) {

				String[] parts = line.split(",");
				String name = parts[0];
				Integer votes = Integer.parseInt(parts[1]);

				
				if(candidates.containsKey(name)) {
					candidates.put(name, candidates.get(name)+votes);
				}else {
					candidates.put(name, votes);
				}
	
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro : " + e.getMessage());
		}
		
		for(String candidate : candidates.keySet()) {
			System.out.println("Candidato : " +candidate+ " votes : " + candidates.get(candidate));
		}
		sc.close();
	}

}

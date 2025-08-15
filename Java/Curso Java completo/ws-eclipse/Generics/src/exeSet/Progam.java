package exeSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		
		System.out.print("Entre com o caminho do arquivo :");
		String path = sc.nextLine();
		Set<LogEntry> set = new HashSet<>();
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))){
			
			line = br.readLine();
			
			while(line != null) {
				
				String[] parts = line.split(" ");
				String name = parts[0];
				String momentString = parts[1];
				
				OffsetDateTime offsetDateTime = OffsetDateTime.parse(momentString);
				LocalDateTime moment = offsetDateTime.toLocalDateTime();
				
				set.add(new LogEntry(name, moment));
				
				line = br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Error : "+ e.getMessage());
		}
		
		
		System.out.print("Quantidade total de usuarios : " + set.size());
		
		sc.close();
	}

}

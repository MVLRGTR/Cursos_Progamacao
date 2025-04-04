package initialOO_enumeracoes_composicao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgamWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Department department ;
		Work work;
		String name;
		String level;
		Double baseSalary;
		int numberContracts;
		
		System.out.print("Digite por favor o departamento :");
		department = new Department(sc.next());
		
		System.out.printf("%nEntre com as informções do trabalhador %n");
		
		System.out.print("Name :");
		name = sc.next();
		System.out.printf("Level :");
		level = sc.next();
		System.out.printf("Base Salarial :");
		baseSalary = sc.nextDouble();
		work = new Work(name,level,baseSalary,department);
		
		System.out.printf("%nQuantos contratos esse trabalhador tem ? ");
		numberContracts = sc.nextInt();
		
		for(int i = 0 ; i < numberContracts ; i++) {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date;
			String dateString;
			Double ValuePerHour;
			int hours;
			HourContract contract;
			
			System.out.println();
			System.out.printf("Entre com os valores do contrato %d :%n",i+1);
			System.out.printf("Data do contrato (DD/MM/ANO): ");
			dateString = sc.next();
			System.out.printf("Valor por hora :");
			ValuePerHour = sc.nextDouble();
			System.out.printf("Duração em horas :");
			hours = sc.nextInt();
			date = LocalDate.parse(dateString,fmt);
			
			contract = new HourContract(date, ValuePerHour, hours);
			
			work.addContract(contract);
			
		}
		
		System.out.println(work);
		System.out.print("Entre com o mês e o ano para calcular o rendimento (MM/YYYY): ");
		String dateSearch = sc.next();
		String[] monthYear = dateSearch.split("/");
		System.out.print(work.toString2(Integer.parseInt(monthYear[0]), Integer.parseInt(monthYear[1])));
		
		sc.close();
	}
}

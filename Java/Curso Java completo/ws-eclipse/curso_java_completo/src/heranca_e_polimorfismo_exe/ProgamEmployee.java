package heranca_e_polimorfismo_exe;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgamEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		Integer hours,numberEmployees;
		Double valuePerHour,additionalChager;
		Boolean outsourced = false;
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		System.out.printf("Enter the number of employess :");
		numberEmployees = sc.nextInt();
		
		for(int i = 0 ; i < numberEmployees ; i++) {
			System.out.println();
			System.out.printf("Employee %d data :",i+1);
			
			System.out.printf("%nOutsourced (y/n): ");
			String response = sc.next().trim().toLowerCase();
			outsourced = response.equals("y");
			
			System.out.printf("Name employee :");
			name = sc.next();
			
			System.out.printf("Hours :");
			hours = sc.nextInt();
			
			System.out.printf("Value per hour :");
			valuePerHour = sc.nextDouble();
			
			if(outsourced) {
				System.out.printf("Additional Chager:");
				additionalChager = sc.nextDouble();
				OutsourcedEmployee outEmployee = new OutsourcedEmployee(name,hours,valuePerHour,additionalChager);
				employees.add(outEmployee);
			}else {
				Employee employee = new Employee(name,hours,valuePerHour);
				employees.add(employee);
			}
		}
		
		System.out.println();
		
		for (Employee e : employees) {
			System.out.println(e.toString());;
		}
		
		sc.close();

	}

}

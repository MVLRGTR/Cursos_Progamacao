package memorias_array_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Progam_emplyoee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Emplyoee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered ? : ");
		int quantity = sc.nextInt();
		
		for(int i = 0 ; i < quantity;i++) {
			System.out.printf("%nEmplyoee #"+(i+1)+"%n");
			System.out.print("Id :");
			int id = sc.nextInt();
			
			if(i>0) {
				for(Emplyoee x : list) {
					while(x.getId() == id) {
						System.out.println("id already exists, enter another :");
						id = sc.nextInt();
					}
				}
			}
			System.out.print("Name :");
			String name = sc.next();
			System.out.print("Salary :");
			Double salary = sc.nextDouble();
			
			list.add(new Emplyoee(id,name, salary));
		}
		
		System.out.printf("%nEnter the employee id that will have salary increase:");
		int id = sc.nextInt();
		
		Boolean source = false;
		
		for(Emplyoee x : list) {
			if(x.getId()==id) {
				source = true;
				System.out.println("Enter the percentage :");
				x.updataSalary(sc.nextFloat());
			}
		}
		
		if(source==false) {
			System.out.println("This id does not exist!");
		}
		
		System.out.printf("%n");
		for(Emplyoee x : list) {
			System.out.println(x.toString());
		}
	
		sc.close();
	}

}

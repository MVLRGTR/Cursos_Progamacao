package interfaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparable {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\data\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0],Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list); //PARA QUE O MEU PROGAMA REALIZE O METODO SORT NA CLASSE EMPLOYEE PRECISO IMPLEMENTAR A INTERFACE COMPARABLE EM EMPLOYEE
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

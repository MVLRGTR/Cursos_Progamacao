package interfaces;

public class Employee implements Comparable<Employee>{
	//PARA QUE O MEU PROGAMA REALIZE O METODO SORT NA CLASSE EMPLOYEE PRECISO IMPLEMENTAR A INTERFACE COMPARABLE EM EMPLOYEE
	//QUE É UMA INTERFACE QUE OBRIGA EU IMPLEMENTAR NA CLASSE ATUAL O METODO DE COMPRAÇÃO NA PRÓPRIA CLASSE
	
	private String name;
	private Double salary;

	public Employee(String name, Double salary) {

		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		//return -salary.compareTo(other.getSalary()); comparar salario em ordem decrescente
		return name.compareTo(other.getName()); //AQUI APROVEITO O PROPRIO METODO DE COMPARE DA CLASSE STRING
	}

}

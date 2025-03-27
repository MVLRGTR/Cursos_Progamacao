package memorias_array_listas;

public class Emplyoee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Emplyoee(Integer id,String name,Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	public void updataSalary(float percent) {
		salary+=salary*(percent/100);
	}
	
	public String toString(){
		return String.format("Id: %d, Name: %s, Salary: R$ %.2f", id, name, salary);
	}

}

package initialOO_enumeracoes_composicao;

import java.util.ArrayList;

public class Work {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private ArrayList<HourContract> contracts;
	
	public Work(String name,String level, Double baseSalary, Department department) {
		this.name = name;
		this.level = WorkerLevel.valueOf(level);
		this.baseSalary = baseSalary;
		this.department = department;
		this.contracts = new ArrayList<HourContract>();
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
		return;
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
		return;
	}
	
	public Double income(Integer month , Integer year) {
		Double income = 0.00 ;
		for(HourContract contract : this.contracts) {
			if (contract.getDate().getMonthValue() == month && contract.getDate().getYear() == year) {
				income += contract.totalValue();
			}
		}
		income += baseSalary;
		return income;
	}

	public String toString() {
		return "Work [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", department=" + department.toString()
				+ ", contracts=" + contracts + " getLevel : " +level.getLevel() + "]";
	}
	
	public String toString2(Integer month , Integer year) {
		Double income = 0.00 ;
		for(HourContract contract : this.contracts) {
			if (contract.getDate().getMonthValue() == month && contract.getDate().getYear() == year) {
				income += contract.totalValue();
			}
		}
		income += baseSalary;
		return 	"Nome: "+this.name+"\n"+
				"Departamento : "+this.department+"\n"+
				"Rendimentos em "+month+"/"+year+" : R$:"+income;
	}
}





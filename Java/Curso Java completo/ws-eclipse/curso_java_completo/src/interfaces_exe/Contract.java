package interfaces_exe;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private ArrayList<Installment> installments ;
	
	
	public Contract() {
		installments = new ArrayList<Installment>();
	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		installments = new ArrayList<Installment>();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public ArrayList<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(Installment installments) {
		this.installments.add(installments);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Parcelas:\n");
		for(Installment inst : installments) {
			sb.append(inst.toString() + "\n");
		}
		return sb.toString();
		
	}
	
	
}

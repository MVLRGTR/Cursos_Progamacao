package interfaces_exe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment { //PARCELA
	
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dueDate;
	private Double amount;
	
	public Installment() {
		
	}

	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String toString() {
		return dueDate.format(fmt1) + " - " + String.format("%.2f", amount);
	}
	
	
	
}

package initialOO_enumeracoes_composicao;

import java.time.LocalDate;

public class HourContract {
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(LocalDate date, Double valuePerHour,Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Double totalValue() {
		return this.valuePerHour*this.hours;
	}
	
	public LocalDate dateContract() {
		return this.date;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
}

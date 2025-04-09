package heranca_e_polimorfismo_exe;

public class OutsourcedEmployee extends Employee{

	private Double additionalChager;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalChager) {
		super(name, hours, valuePerHour);
		this.additionalChager = additionalChager;
	}
	
	@Override
	public Double payment() {
		return super.payment() + (additionalChager*1.1);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + " - ");
		sb.append("$ "+ this.payment());
		return sb.toString();
		
	}
	

}

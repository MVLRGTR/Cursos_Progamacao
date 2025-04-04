package initialOO_enumeracoes_composicao;

import java.util.Date;

public class Order {
	
	private Integer Id;
	private Date moment;
	private OrderStatus status;
	
	public Order(Integer id, Date moment, OrderStatus status) {
		Id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString() {
		return "Order [id= " + this.Id + ", moment= " + this.moment + ", status= "+ this.status + "]";
	}
	
	
}

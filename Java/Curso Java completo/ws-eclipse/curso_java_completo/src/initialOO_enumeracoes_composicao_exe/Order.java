package initialOO_enumeracoes_composicao_exe;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items ;
	private Client client;
	
	public Order() {
		items = new ArrayList<OrderItem>();
	}

	public Order(Client client , Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
		items = new ArrayList<OrderItem>();
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total= 0.00 ;
		for(OrderItem item : items) {
			total+=item.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY : "+"\n");
		sb.append("Order Status : " + this.status);
		sb.append("Client :"+ client.toString());
		sb.append("Order items:");
		for(OrderItem item : items) {
			sb.append(item.toString());
		}
		sb.append("Total price : R$:"+this.total());
		
		return sb.toString();
	}
	
	
}

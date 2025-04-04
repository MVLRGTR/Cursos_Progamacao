package initialOO_enumeracoes_composicao;

import java.util.Date;

public class ProgamOrder {
	
	public static void main(String[] args) {
		Order order = new Order(1080,new Date(),OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //convertendo string para o enum
		
		System.out.println(os1);
		System.out.println(os2);
	}

}

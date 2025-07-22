package initialOO_enumeracoes_composicao;

public enum OrderStatus2 {
	PENDING_PAYMENT(1),
	PROCESSING(2),
	SHIPPED(3),
	DELIVERED(4);
	
	private final int status;
	
	OrderStatus2(int status){
		this.status=status;
	}
	
	
}

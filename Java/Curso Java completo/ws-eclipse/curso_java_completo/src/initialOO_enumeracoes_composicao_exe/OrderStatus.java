package initialOO_enumeracoes_composicao_exe;

public enum OrderStatus {
	PENDING_PAYMENT(0),
	PROCESSING(1),
	SHIPPED(2),
	DELIVERED(3);
	
	private final int level;
	
	OrderStatus(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
}

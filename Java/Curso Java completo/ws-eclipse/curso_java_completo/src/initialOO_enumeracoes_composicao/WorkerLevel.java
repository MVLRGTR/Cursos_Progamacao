package initialOO_enumeracoes_composicao;

public enum WorkerLevel {
	JUNIOR(1),
	MID_LEVEL(2),
	SENIOR(3);
	
	private final int level;
	
	WorkerLevel(int level){
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
}

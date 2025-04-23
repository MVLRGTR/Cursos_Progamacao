package interfaces;

public abstract class AbstractShape implements Shape { 
	//PARA QUE O COMPILADOR NÃO ME OBRIGUE A IMPLEMENTAR O METODO AREA AQUI E DEFINO ESSA CLASSE COMO ABSTRACT E LEVANDO ESSE METODO A SER IMPLEMENTADO NA PROXIMA CLASSE 
	//COM ISSO EU GANHO A FLEXIBILIDADE ENTRE HERDAR E CUMPRIR O CONTRATO
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}

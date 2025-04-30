package progam;

import entities.Fila;
import entities.Pedido;

public class UseFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		System.out.println("Emfileirando pedidos de revisão...");
		
		fila.inserir(new Pedido(2568,256489,"Peço revisão do valor pago"));
		fila.inserir(new Pedido(6588,252148,"Pedido etraviado"));
		fila.inserir(new Pedido(3685,158967,"Peço reembolso"));
		fila.inserir(new Pedido(4789,145879,"Peças faltando"));
		fila.inserir(new Pedido(2536,856974,"Valor incorreto"));
		
		System.out.println("Tamanho da fila de pedidos de revisão : "+fila.tamanho());
		System.out.println("Primeiro da fila : "+fila.mostrarFrente().valor.toString());
		
		while(!fila.estaVazio()) {
			System.out.println("Retirando da fila : "+fila.retirar().valor.toString());
		}
		
	}

}

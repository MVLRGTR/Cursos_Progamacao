package initialOO_enumeracoes_composicao_exe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgamOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate;
		String name ,email,nameItem;
		Double price;
		OrderStatus status;
		Integer itemsOrder,quantity;
		
		System.out.printf("Digite o nome do cliente :");
		name = sc.next();
		
		System.out.printf("Digite o e-mail do cliente :");
		email = sc.next();
		
		System.out.printf("Digite a data de nascimento do cliente (dd/mm/aaaa):");
		String birthDateStr = sc.next();
		
		try {
            birthDate = sdf.parse(birthDateStr);
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data: " + e.getMessage());
            birthDate = null;
        }
		
		Client client = new Client(name,email,birthDate);
		
		System.out.printf("Entre com o status da ordem : ");
		status =  OrderStatus.valueOf(sc.next());
		
		System.out.printf("Quantos items deseja adicionar no pedido :");
		itemsOrder = sc.nextInt();
		
		Date agora = new Date();
		
		Order order = new Order(client,agora,status);
		
		for(int i = 0 ; i < itemsOrder ; i++) {
			System.out.println("");
			System.out.printf("Digite o nome do produdo :");
			nameItem = sc.next();
			
			System.out.printf("Digite o Valor do Produto em R$:");
			price =  sc.nextDouble();
			
			System.out.printf("Digite a quantidade do Produto : ");
			quantity = sc.nextInt();
			
			Product produto = new Product(nameItem,price);
			
			OrderItem orderitem = new OrderItem(quantity,price,produto);
			
			order.addItem(orderitem);
			
		}
		
		System.out.println(order.toString());	
		
		sc.close();
	}

}

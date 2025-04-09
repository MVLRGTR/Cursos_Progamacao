package heranca_e_polimorfismo_exe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgamProduct {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int numberProducts;
		String name;
		Date dateManufacture;
		Double price, customsFee;
		char type;
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();

		System.out.printf("Enter the number of products :");
		numberProducts = sc.nextInt();

		for (int i = 0; i < numberProducts; i++) {
			System.out.println();

			System.out.printf("Common , used or imported (c/u/i) :");
			type = sc.next().toLowerCase().charAt(0);

			System.out.printf("Name :");
			name = sc.next();

			System.out.printf("Price :");
			price = sc.nextDouble();

			if (type == 'c') {
				products.add(new Product(name, price));
			}else if (type == 'u') {
				System.out.printf("Manufacture date (dd/mm/yyyy) :");
				try {
					dateManufacture = sdf.parse(sc.next());
					products.add(new UsedProduct(name, price , dateManufacture));
				} catch (ParseException e) {
					System.out.println("Invalid date format.");
				}

			}else {
				System.out.printf("Custom fee :");
				customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name,price,customsFee));
			}
		}
		System.out.println();
		
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}

package arquivos_exe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgamReadCsv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> products = new ArrayList<Product>();
		String line;
		
		System.out.printf("Digite o caminho do arquivos csv :");
		String path = sc.nextLine();
		
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
			
			line = br.readLine();
		
			while(line != null) {
				String[] partes = line.split(",");
				
				String name = partes[0];
				Double price = Double.parseDouble(partes[1]);
				Integer quantity = Integer.parseInt(partes[2]);
				
				products.add(new Product(name,price,quantity));
				line = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		File sourceFile = new File(path);
		File outFile = new File(sourceFile.getParent()+"\\out");
		boolean newFile = outFile.mkdir(); //CRIO A NOVA PASTA
		System.out.println("newfile :"+newFile);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(outFile+"\\summary.csv"))){
			for(Product product : products) {
				bw.write(product.toString());
				bw.newLine();
			}
			
		}catch (IOException e) {
			
		}
		
		sc.close();
	}

}

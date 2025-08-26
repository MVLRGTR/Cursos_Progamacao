package stream_exe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReaderPath{
	
	public static List<Product> Reader(String path){
		FileReader fr = null;
		BufferedReader br = null;
		List<Product> products = new ArrayList<>();
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line!=null) {
				String[] parts = line.split(",");
				String name = parts[0];
				Double value = Double.parseDouble(parts[1]);
				products.add(new Product(name,value));
				line = br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Erro message : "+e.getMessage());
		}finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return products;
	
	}
}

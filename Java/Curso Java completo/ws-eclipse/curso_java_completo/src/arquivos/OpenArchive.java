package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OpenArchive {

	public static void main(String[] args) {
		File file = new File("D:\\Progamação\\Cursos_Progamacao\\Java\\Curso Java completo\\ini.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}

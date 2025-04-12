package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {

	public static void main(String[] args) {
		// CRIA/RECRIA O ARQUIVO : NEW FileWriter(path)
		// ACRESCENTA AO ARQUIVO EXISTENTE : NEW FileWriter(path,true)

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night","Hello Word" };
		String path = "D:\\Progamação\\Cursos_Progamacao\\Java\\Curso Java completo\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

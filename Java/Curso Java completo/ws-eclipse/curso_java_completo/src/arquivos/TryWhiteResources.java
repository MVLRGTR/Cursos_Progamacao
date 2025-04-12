package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWhiteResources {

	public static void main(String[] args) {
		//DIFERENTEMENTE DO TRY COMUM O TRY RESOURCES E UM BLOCO QUE DECLARA UM OU MAIS RECURSO E GARANTE QUE ELES SERÃO FECHADOS AO FINAL DO BLOCO
		//O CÓDIGO ABAIXO É UMA LEVE MODIFICAÇÃO DO CÓDIGO FileReaderAndBufferRead 
		
		String path = "D:\\Progamação\\Cursos_Progamacao\\Java\\\\Curso Java completo\\ini.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine(); // LER A PROXIMA LINHA E QUANDO NÃO TEM MAIS NADA RETORNA O VALOR NULL
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

	}

}

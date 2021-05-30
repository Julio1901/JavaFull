package manipulaArquivos;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Escritor {
	public static void escreveArquivo(String caminhoArquivo, String linha) {
		try {
			FileOutputStream arquivo = new FileOutputStream(caminhoArquivo);
			PrintWriter pr = new PrintWriter(arquivo);
			pr.println(linha);
			pr.close();
			arquivo.close();
			
		} catch (Exception e) {
			System.out.println("Erro ao escrever o arquivo");
		}

	}
}
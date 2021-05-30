package manipulaArquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Leitor {

	public static void leitor(String caminhoArquivo) {
		
		try {
			FileInputStream arquivo = new FileInputStream(caminhoArquivo);
			InputStreamReader input = new InputStreamReader(arquivo);
			
			BufferedReader br = new BufferedReader(input);
			
			String linha;
			
			do {
				linha = br.readLine();
				if(linha != null) {
				System.out.println(linha);
				}
			}while(linha != null);
			
		}catch (Exception e) {
			System.out.println("Erro ao ler o arquivo de origem");
		}
		
	}

}

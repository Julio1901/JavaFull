package manipulaArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SeparaMascFem {

	public static void separaPorGenero(String arquivoOrigem) {

		try {
			FileInputStream arquivo = new FileInputStream(arquivoOrigem);
			InputStreamReader input = new InputStreamReader(arquivo);

			BufferedReader br = new BufferedReader(input);
			String linha;

			do {
				linha = br.readLine();
				if (linha != null) {

					String caminhoDestino;
					String[] linhaSplitada = linha.split(";");
					if (linhaSplitada[2].equals("sexo:masculino")) {
						caminhoDestino = "/home/julio/Desktop/test/homens.txt";
					} else {
						caminhoDestino = "/home/julio/Desktop/test/mulheres.txt";
					}

					FileWriter arquivoDestino = new FileWriter(caminhoDestino, true);
					BufferedWriter bw = new BufferedWriter(arquivoDestino);
					PrintWriter pr = new PrintWriter(bw);
					//TODO: Pensar em como abrir o arquivo uma única vez 
					pr.println(linha);
					pr.close();
				}
			} while (linha != null);

			arquivo.close();
			input.close();

			arquivo.close();

		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo");
		}
	}

}

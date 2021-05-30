package manipulaArquivos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escritor escritor = new Escritor();
		
		//escritor.escreveArquivo("/home/julio/Desktop/test/conseguiu.txt", "A resposta é 42");
		
		Leitor leitor = new Leitor();
		leitor.leitor("/home/julio/Desktop/test/arquivoPopulate.txt");
		
		
		SeparaMascFem  separa = new SeparaMascFem();
		
		separa.separaPorGenero("/home/julio/Desktop/test/arquivoPopulate.txt");
		
	}

}

package fundamentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) throws IOException {
		/*Formula de conversar de F para C:  (F -32) x 5/9 = C
		No java se você fizer 5/9 o resultado vai ser zero pois ele sempre retorna um valor inteiro para
		uma expressão realizada com números inteiros, é necessário especificar um dos pois operadores como ponto flutuante
		*/
		
		//Criando input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número que será convertido para Celsius: ");
		try {
			int valorEmFarenaid	= input.nextInt();
			final int ajuste = 32;
			int valorAjustado = valorEmFarenaid - ajuste;
			final double formulaConversao = 5/9.0;
			double valorEmCelsius = valorAjustado * formulaConversao;
			System.out.println("O resultado da conversão é: " + valorEmCelsius);
		} catch (Exception e) {
			System.out.println("Impossível realizar a ação. Motivo: " + e);
		} {
			
		}
	}
}

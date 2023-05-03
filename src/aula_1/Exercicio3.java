/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 */
package aula_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome;
		Integer idade;
		Float salario;
		Scanner leitor = null;
		
		try {
			leitor = new Scanner(System.in);
			leitor.useLocale(Locale.US); // Nos EUA, há o padrão com . para casas decimais.
			
			System.out.println("\nInforme um nome\n");
			nome = leitor.nextLine();
			System.out.println("\nInforme uma idade\n");
			idade = Integer.valueOf(leitor.nextInt());
			System.out.println("\nInforme um salario\n");
			salario = Float.valueOf((float) leitor.nextDouble());
			
			System.out.println("\nA idade do aluno "+ nome +" é "+idade.toString()+" anos e"
					+ "\nestagia recebendo o valor de "+ salario.toString());
		}
		finally {
		    if(leitor != null)
		    	leitor.close();
		}
	}

}

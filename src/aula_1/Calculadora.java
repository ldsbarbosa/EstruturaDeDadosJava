/**
 * @author Lucas da Silva Barbosa
 * Matr�cula: 202120194
 * Este � o exercicio 4
 */
package aula_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		List<Integer> variaveis = new ArrayList<Integer>(); // Mudar para List<int>
		Scanner leitor = null;
		
		try {
			leitor = new Scanner(System.in);
			
			System.out.println("Informe um n�mero inteiro para a primeira vari�vel.");
			variaveis.add(Integer.valueOf(leitor.nextInt()));
			
			System.out.println("Informe outro n�mero inteiro para a segunda vari�vel.");
			variaveis.add(Integer.valueOf(leitor.nextInt()));
			
			int soma;
			soma = variaveis.get(0) + variaveis.get(1);
			System.out.println("A soma das variaveis resultou em: " + soma);
		}
		finally {
		    if(leitor != null) {
		    	leitor.close();
		    }
		}
	}
}

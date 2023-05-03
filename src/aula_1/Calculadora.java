/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * Este é o exercicio 4
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
			
			System.out.println("Informe um número inteiro para a primeira variável.");
			variaveis.add(Integer.valueOf(leitor.nextInt()));
			
			System.out.println("Informe outro número inteiro para a segunda variável.");
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

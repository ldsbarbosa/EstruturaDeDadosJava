/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * Este é o exercicio 5
 */
package aula_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] args) {
		List<Float> variaveis = new ArrayList<Float>();
		Scanner leitor = null;
		
		try {
			leitor = new Scanner(System.in);
			leitor.useLocale(Locale.US);
			
			System.out.println("Informe um número inteiro para a primeira variável.");
			variaveis.add(Float.valueOf(leitor.nextFloat()));
			
			System.out.println("Informe outro número inteiro para a segunda variável.");
			variaveis.add(Float.valueOf(leitor.nextFloat()));
			
			float soma = variaveis.get(0) + variaveis.get(1);
			System.out.println(variaveis.get(0) + " + " + variaveis.get(1) + " = " + soma);
			
			float subtracao = variaveis.get(0) - variaveis.get(1);
			System.out.println(variaveis.get(0) + " - " + variaveis.get(1) + " = " + subtracao);
			
			float multiplicacao = variaveis.get(0) * variaveis.get(1);
			System.out.println(variaveis.get(0) + " * " + variaveis.get(1) + " = " + multiplicacao);
			
			float divisao = variaveis.get(0) / variaveis.get(1);
			System.out.println(variaveis.get(0) + " / " + variaveis.get(1) + " = " + divisao);
			
			float potencia = (float) Math.pow(variaveis.get(0),variaveis.get(1));
			System.out.println("A potenciacao das variaveis resultou em: " + potencia);
			
			float raizQuadrada1 = (float) Math.sqrt(variaveis.get(0));
			float raizQuadrada2 = (float) Math.sqrt(variaveis.get(1));
			System.out.println("A raiz quadrada da primeira variável resultou em: " + raizQuadrada1);
			System.out.println("A raiz quadrada da segunda variável resultou em: " + raizQuadrada2);
			
			float logaritmo1 = (float) Math.log(variaveis.get(0));
			float logaritmo2 = (float) Math.log(variaveis.get(1));
			System.out.println("O logaritmo da primeira variável resultou em: " + logaritmo1);
			System.out.println("O logaritmo da segunda variável resultou em: " + logaritmo2);
		}
		finally {
		    if(leitor != null) {
		    	leitor.close();
		    }
		}
	}
}
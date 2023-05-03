/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * Este é o exercicio 6
 */
package aula_1;

import java.util.Scanner;

public class VerificaNumPar {

	public static void main(String[] args) {
		Integer numero;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			
			System.out.println("Digite um número inteiro: ");
			numero = Integer.valueOf(leitor.nextInt());
			
			if(numero % 2 == 0) {
				System.out.println("O número "+ numero + " é par!");
			}else{
				System.out.println("O número "+ numero + " é impar!");
			}
		}
		finally {
		    if(leitor != null) {
		    	leitor.close();
		    }
		}
	}
}

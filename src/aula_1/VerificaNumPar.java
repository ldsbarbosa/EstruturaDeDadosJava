/**
 * @author Lucas da Silva Barbosa
 * Matr�cula: 202120194
 * Este � o exercicio 6
 */
package aula_1;

import java.util.Scanner;

public class VerificaNumPar {

	public static void main(String[] args) {
		Integer numero;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			
			System.out.println("Digite um n�mero inteiro: ");
			numero = Integer.valueOf(leitor.nextInt());
			
			if(numero % 2 == 0) {
				System.out.println("O n�mero "+ numero + " � par!");
			}else{
				System.out.println("O n�mero "+ numero + " � impar!");
			}
		}
		finally {
		    if(leitor != null) {
		    	leitor.close();
		    }
		}
	}
}

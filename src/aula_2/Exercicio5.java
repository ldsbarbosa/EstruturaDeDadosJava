/**
 * @author Lucas da Silva Barbosa
 * Matr�cula: 202120194
 */
package aula_2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int[] numerosAleatorios = new int[20];
		Random geradorAleatorio = new Random();
		Scanner leitor = new Scanner(System.in);
		String impressaoDoVetor = "";
		int adivinhaNumero;
		boolean acertou = false;
		
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = geradorAleatorio.nextInt(51);
		}
		System.out.println("Tente adivinhar um dos 20 n�meros sorteados de 0 at� 50");
		adivinhaNumero = leitor.nextInt();
		for(int i = 0; i < numerosAleatorios.length; i++) {
			if(adivinhaNumero == numerosAleatorios[i]) {
				acertou = true;
				System.out.println("Acertou, o n�mero que inseriu est� na posi��o "+i);
			}
		}
		if(acertou == false) {
			System.out.println("Errou!");
		}
	}
}

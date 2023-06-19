/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 */
package aula_2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int[] numerosAleatorios = new int[20];
		Random geradorAleatorio = new Random();
		try (Scanner leitor = new Scanner(System.in)) {
			int adivinhaNumero;
			boolean acertou = false;
			
			
			for(int i = 0; i < numerosAleatorios.length; i++) {
				numerosAleatorios[i] = geradorAleatorio.nextInt(51);
			}
			System.out.println("Tente adivinhar um dos 20 numeros sorteados de 0 ate 50");
			adivinhaNumero = leitor.nextInt();
			
			for(int i = 4; i >= 0; i--) {
				if(i == 0 || acertou) {
					break;
				}
				for (int num : numerosAleatorios) {
					if(adivinhaNumero == num) {
						acertou = true;
						System.out.println("Acertou! Vetor:");
						imprimirVetor(numerosAleatorios);
					}
				}
				if(!acertou) {
					System.out.println("Voce errou. Tentativas restantes: "+i);
					adivinhaNumero = leitor.nextInt();
				}
			}
			
			if(!acertou) {
				System.out.println("Infelizmente, todas estão erradas. Vetor:");
				imprimirVetor(numerosAleatorios);
			}
		}
	}
	
	public static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			if(i == vetor.length - 1) {
				System.out.print(vetor[i]+"]");
			} else {
				System.out.print(vetor[i]+", ");
			}
		}
	}
}

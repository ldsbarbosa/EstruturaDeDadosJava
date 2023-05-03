/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 */
package aula_2;

import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		int[] numerosAleatorios = new int[6];
		Random geradorAleatorio = new Random();
		String impressaoDoVetor = "";
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = geradorAleatorio.nextInt(61);
			impressaoDoVetor += numerosAleatorios[i] + " ";
			if(i == numerosAleatorios.length - 1) {
				System.out.println(impressaoDoVetor);
			}
		}
		
		int[] numerosAleatorios2 = new int[20];
		impressaoDoVetor = "";
		System.out.println("\n\n######\n\n");
		for(int i = 0; i < numerosAleatorios2.length; i++) {
			numerosAleatorios2[i] = geradorAleatorio.nextInt(51);
			impressaoDoVetor += numerosAleatorios2[i] + " ";
			if(i == numerosAleatorios2.length - 1) {
				System.out.println(impressaoDoVetor);
			}
		}
	}
}

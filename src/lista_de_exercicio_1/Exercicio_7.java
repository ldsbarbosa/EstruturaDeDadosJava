/**
 * 7.	Gerar N números inteiros aleatórios no intervalo de 0 a 1000 e preencha um vetor de 100 elementos,
 * 		ao final que exiba o maior e o menor inteiro em um vetor.
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_7 {
	public static void main(String[] args) {
		int numeroLinhas = 100;
		int[] conjuntoDeNumeros = new int[numeroLinhas];
		Random geradorAleatorio = new Random();
		int maiorNumero = 0, menorNumero = 1001;
		
		for(int i = 0; i < conjuntoDeNumeros.length; i++) {
			conjuntoDeNumeros[i] = geradorAleatorio.nextInt(1001);
			if(conjuntoDeNumeros[i] > maiorNumero) {
				maiorNumero = conjuntoDeNumeros[i];
			}
			if(conjuntoDeNumeros[i] < menorNumero) {
				menorNumero = conjuntoDeNumeros[i];
			}
			System.out.print(conjuntoDeNumeros[i]+"\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("Maior número gerado: " + maiorNumero);
		System.out.println("Menor número gerado: " + menorNumero);
	}
}
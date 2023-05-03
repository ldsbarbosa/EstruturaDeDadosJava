/**
 * 3.	Criar uma matriz de 3 dimensões, sendo 5 linhas, 3 colunas e 2 dimensões. Atribuir números inteiros,
 * 		gerados aleatoriamente pra matriz e ao final imprimir a matriz.
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_3 {
	public static void main(String[] args) {
		int numeroLinhas = 5, numeroColunas = 3, numeroDimensoes = 2;
		int[][][] matrizTridimensional = new int[numeroLinhas][numeroColunas][numeroDimensoes];
		Random geradorAleatorio = new Random();
		
		for(int i = 0; i < numeroLinhas; i++) {
			System.out.print("\n---\n####\n");
			System.out.print("Linha de número "+(i+1)+"\n");
			for(int j = 0; j < numeroColunas; j++) {
				for(int k = 0; k < numeroDimensoes; k++) {
					matrizTridimensional[i][j][k] = geradorAleatorio.nextInt(1000);
					System.out.print(matrizTridimensional[i][j][k]+"\t");
				}
				System.out.print("\n");
			}
		}
		
	}
}

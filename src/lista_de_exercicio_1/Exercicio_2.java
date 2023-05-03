/**
 * 2.	Criar uma matriz A de 5x5 com números inteiros aleatórios de 0 a 100 e criar uma matriz T (transposta) de 5x5;
 * 		Ao final imprimir as duas matrizes
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_2 {
	public static void main(String[] args) {
		Random geradorAleatorio = new Random();
		
		int linhas = 5, colunas = 5;
		int[][] matrizA = new int[linhas][colunas];
		int[][] matrizB = new int[linhas][colunas];
		
		System.out.println("Matriz A");
		for(int i = 0; i < linhas;i++) {
			for(int j = 0; j < colunas;j++) {
				matrizA[i][j] = geradorAleatorio.nextInt(100);
				System.out.print(matrizA[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
		
		System.out.println("Matriz B - Transposta");
		for(int i = 0; i < linhas;i++) {
			for(int j = 0; j < colunas;j++) {
				matrizB[i][j] = matrizA[j][i];
				System.out.print(matrizB[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
	}
}

/**
 * 4.	Criar duas matrizes A e B de n�meros inteiros e duas dimens�es com 5 linhas e 6 colunas.
 * 		A matriz A dever� ser formada por valores pares, enquanto a matriz B dever� ser formada por valores impares.
 * 		As entradas nas matrizes dever�o ser validadas pelo programa e n�o pelo usu�rio. � usar o comando para gerar os n�meros aleat�rios.
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_4 {
	public static void main(String[] args) {
		int numeroLinhas = 5, numeroColunas = 6, numeroDimensoes = 2;
		int[][][] matrizA = new int[numeroLinhas][numeroColunas][numeroDimensoes], matrizB = new int[numeroLinhas][numeroColunas][numeroDimensoes];
		Random geradorAleatorio = new Random();
		int numeroGerado;
		
		System.out.println("Matriz A");
		for(int i = 0; i < numeroLinhas; i++) {
			System.out.print("\n---\n####\n");
			System.out.print("Linha de n�mero "+(i+1)+"\n");
			for(int j = 0; j < numeroColunas; j++) {
				for(int k = 0; k < numeroDimensoes; k++) {
					numeroGerado = geradorAleatorio.nextInt(100);
					while(numeroGerado % 2 != 0) {
						numeroGerado = geradorAleatorio.nextInt(100);
					}
					matrizA[i][j][k] = numeroGerado;
					System.out.print(matrizA[i][j][k]+"\t");
				}
				System.out.print("\n");
			}
		}
		
		System.out.println("\n########\n--Matriz B--");
		for(int i = 0; i < numeroLinhas; i++) {
			System.out.print("\n---\n####\n");
			System.out.print("Linha de n�mero "+(i+1)+"\n");
			for(int j = 0; j < numeroColunas; j++) {
				for(int k = 0; k < numeroDimensoes; k++) {
					numeroGerado = geradorAleatorio.nextInt(100);
					while(numeroGerado % 2 == 0) {
						numeroGerado = geradorAleatorio.nextInt(100);
					}
					matrizB[i][j][k] = numeroGerado;
					System.out.print(matrizB[i][j][k]+"\t");
				}
				System.out.print("\n");
			}
		}
	}
}

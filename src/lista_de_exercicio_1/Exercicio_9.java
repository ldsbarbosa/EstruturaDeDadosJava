/**
 * 9.	Fa�a um programa que calcule a soma dos n�meros de uma matriz 3x5 de inteiros.
 * 		� usar o comando para gerar os n�meros aleat�rios.
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_9 {
	public static void main(String[] args) {
		int quantidadeLinhas = 3, quantidadeColunas = 5, somatorio = 0;
		int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];
		Random geradorAleatorio = new Random();
		
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				matriz[i][j] = geradorAleatorio.nextInt(10);
				System.out.print(matriz[i][j]+"\t");
				somatorio += matriz[i][j];
			}
			System.out.print("\n");
		}
		System.out.println("Somat�rio de todos os n�meros presentes na matriz: "+somatorio);
	}
}

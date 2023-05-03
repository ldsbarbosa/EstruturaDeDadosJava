/**
 * 8.	Faça um programa que calcule o determinante de uma matriz 3X3 de números inteiros.
 * 		– usar o comando para gerar os números aleatórios. Ao final exibir a matriz e o determinante.
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_8 {
	public static void main(String[] args) {
		int quantidadeLinhas = 3, quantidadeColunas = 3;
		int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];
		Random geradorAleatorio = new Random();
		
		System.out.println("Matriz");
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				matriz[i][j] = geradorAleatorio.nextInt(100);
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		// Para resolver o determinante de uma matriz 3x3, opto por usar a Regra de Sarrus
		// Entre parenteses, estão as diagonais(3 principais e 3 inversas)
		int determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[0][1] * matriz[1][2] * matriz[2][0]) + (matriz[0][2] * matriz[1][0] * matriz[2][1])
				- ((matriz[0][2] * matriz[1][1] * matriz[2][0]) + (matriz[0][0] * matriz[1][2] * matriz[2][1]) + (matriz[0][1] * matriz[1][0] * matriz[2][2]));
		System.out.println("Determinante: "+determinante);
		// Link útil para conferir o resultado: https://matrixcalc.org/pt/det.html
	}
}

/**
 * 9.	Faça um programa que calcule a soma dos números de uma matriz 3x5 de inteiros.
 * 		– usar o comando para gerar os números aleatórios.
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
		System.out.println("Somatório de todos os números presentes na matriz: "+somatorio);
	}
}

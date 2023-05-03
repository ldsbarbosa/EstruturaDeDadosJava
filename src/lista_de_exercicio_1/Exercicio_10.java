/**
 * 10. 	Faça um programa que calcule a e exiba quantos números pares há em uma matriz 3x5 de inteiros.
 *		– usar o comando para gerar os números aleatórios entre 0 e 1000.
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_10 {
	public static void main(String[] args) {
		int quantidadeLinhas = 3, quantidadeColunas = 5, quantidadePares = 0;
		int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];
		Random geradorAleatorio = new Random();
		
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				matriz[i][j] = geradorAleatorio.nextInt(10);
				System.out.print(matriz[i][j]+"\t");
				if(matriz[i][j] % 2 == 0 && matriz[i][j] != 0) {
					quantidadePares++;
				}
			}
			System.out.print("\n");
		}
		System.out.println("Quantidade de números pares presentes na matriz: "+quantidadePares);
	}
}

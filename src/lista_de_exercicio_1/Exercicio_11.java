/**
 *11.	Faça um programa que multiplique todos os elementos de uma matriz de inteiros 9x9 pelo valor de A que foi lido pelo teclado.
 *		Ao final imprimir a matriz resultante. – usar o comando para gerar os números aleatórios entre 0 e 100.
 */
package lista_de_exercicio_1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_11 {
	public static void main(String[] args) {
		int quantidadeLinhas = 9, quantidadeColunas = 9, multiplicador;
		int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];
		Random geradorAleatorio = new Random();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Matriz\n");
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				matriz[i][j] = geradorAleatorio.nextInt(100);
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("\nEscolha um valor para multiplicar todos os elementos da matriz: \n");
		multiplicador = leitor.nextInt();
		
		System.out.println("Resultado abaixo: \n");
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				matriz[i][j] = matriz[i][j] * multiplicador;
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
	}
}

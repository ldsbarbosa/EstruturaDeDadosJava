/**
 * 12.	Crie um programa que declare uma matriz de 5x5
 * 		– usar o comando para gerar os números aleatórios no intervalo de 0 a 100.
 * 		E depois ler um numero e procurar o numero na matriz e ao encontrar o numero informe a posição (qual a linha e qual a coluna o numero foi encontrado),
 * 		caso o numero não exista na matriz exiba uma mensagem, informando que o numero não existe na matriz.
 * 		Se o numero for encontrado em mais de uma posição deverá mostrar também a posição linha e coluna que o número foi encontrado.
 */
package lista_de_exercicio_1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_12 {
	public static void main(String[] args) {
		int quantidadeLinhas = 9, quantidadeColunas = 9, escolha, contador = 0;
		int[][] matriz = new int[quantidadeLinhas][quantidadeColunas];
		boolean achouONumero = false;
		Random geradorAleatorio = new Random();
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				matriz[i][j] = geradorAleatorio.nextInt(100);
			}
		}
		System.out.println("\nEscolha um número inteiro, de 0 a 100, para encontrá-lo na matriz: \n");
		escolha = leitor.nextInt();
		
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				if(escolha == matriz[i][j]) {
					contador++;
					System.out.println("Você achou o número "+matriz[i][j]+" "+contador+" vez(es)!\nEle está na linha ["+i+"] e na coluna ["+j+"]!");
					achouONumero = true;
				}
			}
		}
		if(!achouONumero) {
			System.out.println("Você não achou o número, segue a matriz para conferência: ");
			System.out.println("\nMatriz\n");
			for(int i = 0; i < quantidadeLinhas; i++) {
				for(int j = 0; j < quantidadeColunas; j++) {
					System.out.print(matriz[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
	}
}

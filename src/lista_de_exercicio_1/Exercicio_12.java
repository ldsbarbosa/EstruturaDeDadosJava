/**
 * 12.	Crie um programa que declare uma matriz de 5x5
 * 		� usar o comando para gerar os n�meros aleat�rios no intervalo de 0 a 100.
 * 		E depois ler um numero e procurar o numero na matriz e ao encontrar o numero informe a posi��o (qual a linha e qual a coluna o numero foi encontrado),
 * 		caso o numero n�o exista na matriz exiba uma mensagem, informando que o numero n�o existe na matriz.
 * 		Se o numero for encontrado em mais de uma posi��o dever� mostrar tamb�m a posi��o linha e coluna que o n�mero foi encontrado.
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
		System.out.println("\nEscolha um n�mero inteiro, de 0 a 100, para encontr�-lo na matriz: \n");
		escolha = leitor.nextInt();
		
		for(int i = 0; i < quantidadeLinhas; i++) {
			for(int j = 0; j < quantidadeColunas; j++) {
				if(escolha == matriz[i][j]) {
					contador++;
					System.out.println("Voc� achou o n�mero "+matriz[i][j]+" "+contador+" vez(es)!\nEle est� na linha ["+i+"] e na coluna ["+j+"]!");
					achouONumero = true;
				}
			}
		}
		if(!achouONumero) {
			System.out.println("Voc� n�o achou o n�mero, segue a matriz para confer�ncia: ");
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

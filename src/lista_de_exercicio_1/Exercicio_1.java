/**
 * 1.	Criar uma matriz de 5x5 e ao final exibir a matriz e o somat�rio dos elementos situados acima da diagonal principal,
 * 		usar o comando para gerar os n�meros aleat�rios.
 */
package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_1 {
	public static void main(String[] args) {
		Random geradorAleatorio = new Random();
		
		int linhas = 5, colunas = 5, somatorio = 0;
		int[][] numeros = new int[linhas][colunas]; // O primeiro colchete refere-se � linha, enquanto o segundo refere-se � colunas
		
		for(int i = 0; i < linhas;i++) {
			for(int j = 0; j < colunas;j++) {
				numeros[i][j] = geradorAleatorio.nextInt(10);
				System.out.print(numeros[i][j] + "\t");
				if(j > i) {
					somatorio += numeros[i][j];
				}
			}
			System.out.print("\n\n");
		}
		System.out.println("Somat�rio dos elementos situados acima da diagonal principal: "+somatorio);
	}
}

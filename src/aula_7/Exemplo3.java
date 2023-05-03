package aula_7;

import java.util.Random;

public class Exemplo3 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(5);
		int[][] matriz = new int[numeroAleatorio+1][numeroAleatorio];
		System.out.println("MATRIZ NORMAL");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(9);
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
		System.out.println("MATRIZ TRANSPOSTA");
		for(int i = 0; i < matrizTransposta.length; i++) {
			for(int j = 0; j < matrizTransposta[i].length; j++) {
				matrizTransposta[i][j] = matriz[j][i];
				System.out.print(matrizTransposta[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

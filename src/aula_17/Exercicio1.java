package aula_17;

public class Exercicio1 {
	public static void main(String[] args) {
		int[][] matriz = {
				{0, -4, 220},
				{-42, 60, 58},
				{7, 0, 0},
				{78, -30, 27},
			};
		
		System.out.println("Impressão da matriz.");
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Linha ["+(i+1)+"]");
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
				if(j == matriz[i].length - 1) {
					System.out.print("\n");
				}
			}
			
		}
	}
}

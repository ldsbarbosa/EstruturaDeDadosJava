package aula_9_professora;

public class Exercicio9 {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3 };
		int[][] matriz = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] += vetor[i];
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.print("\n");
		}
		System.out.println(matriz[2][0] + ", " + matriz[1][1]);

	}

}

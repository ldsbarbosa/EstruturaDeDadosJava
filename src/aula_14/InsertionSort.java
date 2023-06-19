/**
 * Insertion Sort ou ordenação por inserção é o método que percorre um vetor
 * de elementos da esquerda para a direita e
 * à medida que avança vai ordenando os elementos à esquerda.
 * 
 * https://www.youtube.com/watch?v=S5no2qT8_xg - INSERTION SORT | Algoritmos #5
 */
package aula_14;

public class InsertionSort {
	public static void main(String[] args) {
		//int[] vetor = { 64, 34, 25, 12, 22, 11, 90 };
		int[] vetor = { 64, 34, 25, 12 };
		insertionSort(vetor);
		System.out.println("Vetor ordenado:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	public static void insertionSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 1; i < n; i++) {
			int chave = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] > chave) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = chave;
		}
	}
}

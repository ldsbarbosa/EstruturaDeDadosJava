/**
 * O Quicksort é o algoritmo mais eficiente na ordenação por comparação.
 * Nele se escolhe um elemento chamado de pivô, a partir disto é organizada a lista
 * para que todos os números anteriores a ele sejam menores que ele,
 * e todos os números posteriores a ele sejam maiores que ele.
 * 
 * https://www.youtube.com/watch?v=wx5juM9bbFo - QUICKSORT | Algoritmos #8
 */
package aula_14;

public class QuickSort {
	public static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) { // Verifica se o vetor possui mais de um elemento para ordenar

			int pivo = escolherPivo(vetor, inicio, fim); // Escolhendo o pivô
			pivo = particionar(vetor, inicio, fim, pivo); // Realizando a partição e ordenação do vetor
			// Chamando recursivamente o QuickSort para as duas partições
			quickSort(vetor, inicio, pivo - 1);
			quickSort(vetor, pivo + 1, fim);
		}
	}

	public static int escolherPivo(int[] vetor, int inicio, int fim) {
		return vetor[inicio]; // O primeiro elemento será o pivô
	}

	public static int particionar(int[] vetor, int inicio, int fim, int pivo) {
		int i = inicio + 1;
		int j = fim;

		while (i <= j) {
			// Encontra elementos do lado errado do pivô e troca suas posições
			if (vetor[i] <= pivo) {
				i++; // Lado certo do pivo
			} else if (vetor[j] > pivo) {
				j--; // Lado certo do pivo
			} else {
				
				// Troca os elementos de posição, pois estão no lado errado do pivo
				int temp = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = temp;
				i++;
				j--;
			}
		}

		// Coloca o pivô na posição correta
		int temp = vetor[inicio];
		vetor[inicio] = vetor[j];
		vetor[j] = temp;

		return j; // Retorna a posição final do pivô
	}

	public static void main(String[] args) {
		int[] vetor = { 9, 2, 7, 5, 4, 1, 6, 10, 3, 8 };
		//int[] vetor = { 9, 2, 7, 5, 4};
		quickSort(vetor, 0, vetor.length - 1);

		// Laço for responsável pela impressão do vetor ordenado
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
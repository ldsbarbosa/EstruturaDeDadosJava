/**
 * O Quicksort � o algoritmo mais eficiente na ordena��o por compara��o.
 * Nele se escolhe um elemento chamado de piv�, a partir disto � organizada a lista
 * para que todos os n�meros anteriores a ele sejam menores que ele,
 * e todos os n�meros posteriores a ele sejam maiores que ele.
 * 
 * https://www.youtube.com/watch?v=wx5juM9bbFo - QUICKSORT | Algoritmos #8
 */
package aula_14;

public class QuickSort {
	public static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) { // Verifica se o vetor possui mais de um elemento para ordenar

			int pivo = escolherPivo(vetor, inicio, fim); // Escolhendo o piv�
			pivo = particionar(vetor, inicio, fim, pivo); // Realizando a parti��o e ordena��o do vetor
			// Chamando recursivamente o QuickSort para as duas parti��es
			quickSort(vetor, inicio, pivo - 1);
			quickSort(vetor, pivo + 1, fim);
		}
	}

	public static int escolherPivo(int[] vetor, int inicio, int fim) {
		return vetor[inicio]; // O primeiro elemento ser� o piv�
	}

	public static int particionar(int[] vetor, int inicio, int fim, int pivo) {
		int i = inicio + 1;
		int j = fim;

		while (i <= j) {
			// Encontra elementos do lado errado do piv� e troca suas posi��es
			if (vetor[i] <= pivo) {
				i++; // Lado certo do pivo
			} else if (vetor[j] > pivo) {
				j--; // Lado certo do pivo
			} else {
				
				// Troca os elementos de posi��o, pois est�o no lado errado do pivo
				int temp = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = temp;
				i++;
				j--;
			}
		}

		// Coloca o piv� na posi��o correta
		int temp = vetor[inicio];
		vetor[inicio] = vetor[j];
		vetor[j] = temp;

		return j; // Retorna a posi��o final do piv�
	}

	public static void main(String[] args) {
		int[] vetor = { 9, 2, 7, 5, 4, 1, 6, 10, 3, 8 };
		//int[] vetor = { 9, 2, 7, 5, 4};
		quickSort(vetor, 0, vetor.length - 1);

		// La�o for respons�vel pela impress�o do vetor ordenado
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
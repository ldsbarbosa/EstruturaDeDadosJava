/**
 * Este algoritmo � baseado em se passar sempre o menor valor
 * do vetor para a primeira posi��o, depois o segundo menor
 * valor para a segunda posi��o e assim sucessivamente, at�
 * os �ltimos dois elementos.
 *
 */
package aula_14;

public class SelectionSort {
	public static void main(String[] args) {
		int[] vetor = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		selectionSort(vetor);
		System.out.println("Vetor ordenado:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}

	private static void selectionSort(int[] vetor) {
		int tamanhoDoVetor = vetor.length;
		for (int indiceExterno = 0; indiceExterno < tamanhoDoVetor - 1; indiceExterno++) {
			int indiceMenor = indiceExterno;
			for (int indiceInterno = indiceExterno + 1; indiceInterno < tamanhoDoVetor; indiceInterno++) {
				if (vetor[indiceInterno] < vetor[indiceMenor]) {
					indiceMenor = indiceInterno;
				}
			}
			int aux = vetor[indiceExterno];
			vetor[indiceExterno] = vetor[indiceMenor];
			vetor[indiceMenor] = aux;
		}
	}
}

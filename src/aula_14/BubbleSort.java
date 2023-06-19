/**
 * Bubble sort é o algoritmo mais simples, mas o menos eficientes. 
 * 
 * Bubble Sort (Ordenação por Bolha) é um algoritmo simples de ordenação
 * que compara elementos adjacentes e os troca de posição se estiverem na
 * ordem errada. Esse processo é repetido várias vezes até que todo o vetor esteja ordenado.
 *
 */

package aula_14;

public class BubbleSort {
	public static void main(String[] args) {
		//int[] vetor = { 64, 34, 25, 12, 22, 90, 11, 22, 100, 14, 10};
		int[] vetor = { 64, 34, 25 };
		System.out.println("\nVetor antes de ser ordenado:");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		bubbleSort(vetor);
		System.out.println("\nVetor ordenado:");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}

	private static void bubbleSort(int[] vetor) {
		// primeiroIndice = Vai excluindo os últimos elementos que já foram ordenados
		// segundoIndice = Serve para selecionar o elemento e seu próximo para comparar. Se estiverem fora de ordem, inverte.
		// variavelAuxiliar = Guarda o elemento que será trocado
		int tamanhoDoVetor = vetor.length;
		int variavelAuxiliar;
		for (int primeiroIndice = 0; primeiroIndice < tamanhoDoVetor - 1; primeiroIndice++) {
			for (int segundoIndice = 0; segundoIndice < tamanhoDoVetor - primeiroIndice - 1; segundoIndice++) {
				if(vetor[segundoIndice] > vetor[segundoIndice + 1]) { // Se estiver fora de ordem, ordena
					variavelAuxiliar = vetor[segundoIndice];
					vetor[segundoIndice] = vetor[segundoIndice + 1];
					vetor[segundoIndice + 1] = variavelAuxiliar;
				}
			}
		}
	}
}

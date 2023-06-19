/**
 * Bubble sort � o algoritmo mais simples, mas o menos eficientes. 
 * 
 * Bubble Sort (Ordena��o por Bolha) � um algoritmo simples de ordena��o
 * que compara elementos adjacentes e os troca de posi��o se estiverem na
 * ordem errada. Esse processo � repetido v�rias vezes at� que todo o vetor esteja ordenado.
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
		// primeiroIndice = Vai excluindo os �ltimos elementos que j� foram ordenados
		// segundoIndice = Serve para selecionar o elemento e seu pr�ximo para comparar. Se estiverem fora de ordem, inverte.
		// variavelAuxiliar = Guarda o elemento que ser� trocado
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

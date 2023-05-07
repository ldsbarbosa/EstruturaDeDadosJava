package metodos_eficientes_ordenacao_livro;

public class QuickSort {
	public static void quicksort(int[] vetor) {
		quick(vetor, 0, vetor.length - 1);
	}

	private static void quick(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int pivo = divide(vetor, inicio, fim);
			quick(vetor, inicio, pivo - 1);
			quick(vetor, pivo + 1, fim);
		}
	}

	private static int divide(int[] vetor, int inicio, int fim) {
		int pivo = vetor[fim];
		int i = inicio, aux;
		for (int j = inicio; j < fim; j++) {
			if (vetor[j] < pivo) {
				aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				i++;
			}
		}
		vetor[fim] = vetor[i];
		vetor[i] = pivo;
		return i;
	}
}

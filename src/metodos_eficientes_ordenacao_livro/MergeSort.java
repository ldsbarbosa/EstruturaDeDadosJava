package metodos_eficientes_ordenacao_livro;

public class MergeSort {

	public static void mergesort(int[] vetor) {
		merge(vetor, 0, vetor.length - 1);
	}

	private static void merge(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			merge(vetor, inicio, meio);
			merge(vetor, meio + 1, fim);
			combina(vetor, inicio, meio, fim);
		}
	}

	private static void combina(int[] vetor, int inicio, int meio, int fim) {
		int[] aux = new int[vetor.length];
		int i = inicio;
		int j = meio + 1;
		for (int l = inicio; l <= fim; l++) {
			aux[l] = vetor[l];
		}
		for (int k = inicio; k <= fim; k++) {
			if (i > meio)
				vetor[k] = aux[j++];
			else if (j > fim)
				vetor[k] = aux[i++];
			else if (aux[i] < aux[j])
				vetor[k] = aux[i++];
			else
				vetor[k] = aux[j++];
		}
	}
}

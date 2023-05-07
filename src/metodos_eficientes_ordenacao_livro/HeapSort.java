package metodos_eficientes_ordenacao_livro;

public class HeapSort {
	public static void heapsort(int[] vetor) {
		int aux;
		constroi_heap(vetor);
		for (int i = vetor.length - 1; i >= 1; i--) {
			aux = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = aux;
			descida(vetor, 0, i);
		}
	}

	private static void descida(int[] vetor, int i, int tam) {
		int e = 2 * i + 1;
		int d = 2 * i + 2;
		int maior = i;
		if ((e < tam) && (vetor[e] > vetor[maior]))
			maior = e;
		if ((d < tam) && (vetor[d] > vetor[maior]))
			maior = d;
		if (maior != i) {
			int aux = vetor[i];
			vetor[i] = vetor[maior];
			vetor[maior] = aux;
			descida(vetor, maior, tam);
		}
	}

	private static void constroi_heap(int[] vetor) {
		for (int i = (vetor.length / 2) - 1; i >= 0; i--)
			descida(vetor, i, vetor.length);
	}
}

package metodos_simples_ordenacao_livro;

public class MetodosDeOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static void bubbleSort(int vetor[]) {
		int aux;
		int tam = vetor.length;
		for (int i = 0; i < tam - 1; i++) {
			for (int j = 0; j < tam - 1 - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
	}

	public static void selectionSort(int vetor[]) {
		int aux;
		int tam = vetor.length;
		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; j++) {
				if (vetor[j] < vetor[i]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
	}

	public static void insertionSort(int vetor[]) {
		int aux;
		int tam = vetor.length;
		int j;
		for (int i = 1; i < tam; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && aux < vetor[j]) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = aux;
		}
	}
}

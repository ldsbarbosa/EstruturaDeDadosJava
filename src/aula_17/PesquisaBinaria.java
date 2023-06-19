package aula_17;

public class PesquisaBinaria {
	public static void main(String[] args) {
		int[] vetor = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		int elementoProcurado = 56;
		int resultado = pesquisaBinaria(vetor, elementoProcurado);
		if (resultado == -1) {
			System.out.println("O elemento não foi encontrado no vetor.");
		} else {
			System.out.println("O elemento foi encontrado no índice " + resultado + " do vetor.");
		}
	}

	public static int pesquisaBinaria(int[] vetor, int elemento) {
		int esquerda = 0;
		int direita = vetor.length - 1;
		while (esquerda <= direita) {
			int meio = (esquerda + direita) / 2;

			if (vetor[meio] == elemento) {
				System.out.println(vetor[meio]);
				return meio;
			}
			if (vetor[meio] < elemento) {
				System.out.println(vetor[meio]);
				esquerda = meio + 1;
			} else {
				System.out.println(vetor[meio]);
				direita = meio - 1;
			}
		}
		return -1; // Retorna -1 se o elemento não for encontrado
	}
}

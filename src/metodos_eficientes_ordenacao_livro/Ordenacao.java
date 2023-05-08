// Link passado no livro para HeapSort: https://www.toptal.com/developers/sorting-algorithms/heap-sort
package metodos_eficientes_ordenacao_livro;

public class Ordenacao {

	public static void main(String[] args) {
		int vetor1[] = { 38, 27, 43, 3, 9, 82, 10 };
		int vetor2[] = { 38, 27, 43, 3, 9, 82, 10 };
		int vetor3[] = { 38, 27, 43, 3, 9, 82, 10 };
		for (int val : vetor1) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("\n###MERGE SORT###\n");
		MergeSort.mergesort(vetor1);
		for (int val : vetor1) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("\n###QUICKSORT###\n");
		QuickSort.quicksort(vetor2);
		for (int val : vetor2) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("\n###HEAPSORT###\n");
		HeapSort.heapsort(vetor3);
		for (int val : vetor3) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

}

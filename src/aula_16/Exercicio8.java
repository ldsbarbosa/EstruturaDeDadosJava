package aula_16;

public class Exercicio8 {
	public static void main(String[] args) {
		int vet[] = {81,15,4,20,7,47,14,20,4};
		//selectionSort(vet);
		//bubbleSort(vet);
		//insertionSort(vet);
	}
	
	private static void selectionSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 0; i < n - 1; i++) {
			int indiceMenor = i;
			for (int j = i + 1; j < n; j++) {
				if (vetor[j] < vetor[indiceMenor]) {
					indiceMenor = j;
				}
			}
			int aux = vetor[i];
			vetor[i] = vetor[indiceMenor];
			vetor[indiceMenor] = aux;
			System.out.println("["+vetor[0]+","+vetor[1]+","+vetor[2]+","+vetor[3]+
					","+vetor[4]+","+vetor[5]+","+vetor[6]+","+vetor[7]+","+vetor[8]+"]");
		}
	}
	
	public static void insertionSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 1; i < n; i++) {
			int chave = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] > chave) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = chave;
			System.out.println("["+vetor[0]+","+vetor[1]+","+vetor[2]+","+vetor[3]+
					","+vetor[4]+","+vetor[5]+","+vetor[6]+","+vetor[7]+","+vetor[8]+"]");
		}
	}
	
	private static void bubbleSort(int[] vetor) {
		int n = vetor.length;
		int aux;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if(vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
			System.out.println("["+vetor[0]+","+vetor[1]+","+vetor[2]+","+vetor[3]+
					","+vetor[4]+","+vetor[5]+","+vetor[6]+","+vetor[7]+","+vetor[8]+"]");
		}
	}
}

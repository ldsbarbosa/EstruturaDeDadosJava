package aula_8_professora;

public class Exercicio {

	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5};
		int soma = 0;
		for (int i =0; i< vetor.length;i++) {
			soma += vetor[i];
		}

		System.out.println("SOMA=   "+soma);
		
	}

}

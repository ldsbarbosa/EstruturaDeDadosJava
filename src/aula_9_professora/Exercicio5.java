package aula_9_professora;

public class Exercicio5 {

	public static void main(String[] args) {
		String[][] nomes = { { "João", "Maria" }, { "José", "Ana", "Paulo" }, { "Luiz", "Carla", "Pedro", "Mariana" } };

		System.out.println("quantidade de linhas " + nomes.length);
		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				System.out.print(nomes[i][j] + " ");
			}
			System.out.println();
		}

	}

}

package aula_6;

public class Exemplo1 {

	public static void main(String[] args) {
		// Declaração e inicialização da matriz
		// Matriz quadrada 2x2 (duas linhas e duas colunas)
		String nomes[][] = {
				// Coluna 0 - Coluna 1
				{"Ana",		"Paulo"}, // Linha 0
				{"Maria",	"Lucas"}, // Linha 1
				{"Daniela","Daniel"} // Linha 2
			};
		// São necessários duas estruturas "for" para imprimir uma matriz de duas dimensões
		// Uma matriz de duas dimensões
		for(int i = 0; i < nomes.length; i++) {
			for(int j = 0; j < nomes[i].length; j++) {
				System.out.print("Nome ["+i+"]["+j+"]:\t");
				System.out.print(nomes[i][j]+"\t\t");
			}
			System.out.println();
		}
	}
}

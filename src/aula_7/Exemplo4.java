package aula_7;

public class Exemplo4 {

	public static void main(String[] args) {
		String[] nome = new String[4];
		nome[0] = "Ana";
		nome[1] = "Cláudio";
		nome[2] = "Daniel";
		nome[3] = "Fernando";
		double[][] notas = {
				{3.5, 6.0, 5.4},
				{8.5, 7.0, 8.3},
				{5.6, 7.8, 4.2},
				{5.5, 6.7, 8.2}
		};
		
		for(int l = 0; l < nome.length; l++) {
			System.out.println("Aluno ["+nome[l]+"]\nNotas:");
			for(int c = 0; c < notas[l].length; c++) {
				System.out.print(notas[l][c]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		double[] media = new double[4];
		double soma = 0;
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
			}
			media[i] = soma / (notas[i].length);
			if(media[i] > 6) {
				System.out.println("O aluno "+nome[i]+" foi aprovado com média "+media[i]);
			}else {
				System.out.println("O aluno "+nome[i]+" foi reprovado. A média foi "+media[i]);
			}
			soma = 0;
		}

	}
}

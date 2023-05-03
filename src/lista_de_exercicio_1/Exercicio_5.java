/**
 * 5.	Preencher uma matriz NOTA de 4 colunas e 10 linhas com as notas de cada bimestre do aluno.
 * 		Calcule e média aritmética de cada linha e armazene em um vetor de tamanho 10.
 * 		– usar o comando para gerar os números aleatórios entre 0 e 10.
 */
package lista_de_exercicio_1;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;

public class Exercicio_5 {
	public static void main(String[] args) {
		// -- Modelagem do Problema --
		// Tendo em vista que o aluno fica 3 meses de férias (Janeiro, Julho e Dezembro), sobram 9 meses.
		// Nesses 9 meses, podemos incluir, anualmente, 4 bimestres (8 meses).
		// Um aluno tem 10 bimestres, já que cada linha receberá uma média aritmética e será armazenado em um vetor de 10 posições
		// Portanto, as colunas são 4 avaliações que decorrem em um bimestre. e cada linha é um bimestre, o que constitui um curso de 2,5 anos.
		
		Locale.setDefault(Locale.US);
		
		int numeroLinhas = 10, numeroColunas = 4;
		float[][]notas = new float[numeroLinhas][numeroColunas];
		float[]mediaFinal = new float[numeroLinhas];
		float notaBimestral = 0;
		
		Random geradorAleatorio = new Random();
		DecimalFormat formatadorDeNumero = new DecimalFormat("00.00");
		
		for(int i = 0; i < numeroLinhas; i++) {
			for(int j = 0; j < numeroColunas; j++) {
				notas[i][j] = Float.parseFloat(formatadorDeNumero.format(geradorAleatorio.nextFloat() * 10));
				notaBimestral += notas[i][j];
				System.out.print("Nota "+(j+1)+": "+notas[i][j]+"\t");
			}
			mediaFinal[i] = notaBimestral / numeroColunas;
			System.out.print("Media Final "+(i+1)+": "+mediaFinal[i]+"\n\n");
			notaBimestral = 0;
		}
	}
}

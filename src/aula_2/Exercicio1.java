/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 */
package aula_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		String nome;
		float[] notas = new float[5];
		float media = 0;
		Scanner leitor = new Scanner(System.in);
		leitor.useLocale(Locale.US);
		
		System.out.println("Qual o nome do aluno?");
		nome = leitor.nextLine();
		for(int i = 0; i<notas.length; i++) {
			System.out.println("Qual a nota da prova "+(i+1)+"?");
			notas[i] = leitor.nextFloat();
			media += notas[i];
			if(i == notas.length - 1) {
				media = media / notas.length;
			}
		}
		System.out.println("As notas do aluno(a) "+nome+" resultou na média "+media);
	}
}

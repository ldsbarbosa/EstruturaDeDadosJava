/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 */
package aula_2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String[] nomeAlunos = new String[5];
		try (Scanner leitor = new Scanner(System.in)) {
			for (int i = 0; i < nomeAlunos.length; i++) {
				System.out.println("Digite o nome do aluno " + i);
				nomeAlunos[i] = leitor.nextLine(); // ou leitor.next()
			}
		}

		System.out.println("Imprimindo todos os nomes");
		for (int i = 0; i < nomeAlunos.length; i++) {
			System.out.println(nomeAlunos[i]);
		}
	}
}

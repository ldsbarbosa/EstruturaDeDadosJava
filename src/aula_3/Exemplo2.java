/**
 * @author Lucas Barbosa
 * Matricula: 202120194
 * Testar Cadastro de Vários Aluno
 */
package aula_3;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			// Estrutura de Dados do tipo - Vetor(array) de Aluno
			Aluno[] alunos = new Aluno[5];
			
			//Estrutura de Repetição para entrada de dados
			for(int i = 0; i < alunos.length; i++) {
				alunos[i] = new Aluno();
				System.out.println("Digite a matrícula do aluno\n");
				alunos[i].matricula = leitor.nextInt();
				System.out.println("Digite o nome do aluno\n");
				alunos[i].nome = leitor.next();
				System.out.println("Digite a primeira nota do aluno\n");
				alunos[i].nota1 = leitor.nextDouble();
				System.out.println("Digite a segunda nota do aluno\n");
				alunos[i].nota2 = leitor.nextDouble();
				alunos[i].calcularMedia();
			}
			
			//Estrutura de Repetição para saída de dados
			for(int i = 0; i < alunos.length; i++) {
				alunos[i].imprimirDados();
			}
		} finally {
			leitor.close();
		}
	}
}

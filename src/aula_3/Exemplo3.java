package aula_3;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			// Estrutura de Dados do tipo - Vetor(array) de Aluno
			System.out.println("Quantos alunos deseja cadastrar?\n");
			int qtdAlunos = leitor.nextInt();
			Aluno2[] alunos = new Aluno2[qtdAlunos];
			
			//Estrutura de Repetição para entrada de dados
			int matricula;
			String nome;
			for(int i = 0; i < alunos.length; i++) {
				System.out.println("Digite a matrícula do aluno\n");
				matricula = leitor.nextInt();
				System.out.println("Digite o nome do aluno\n");
				nome = leitor.next();
				alunos[i] = new Aluno2(matricula, nome);
				System.out.println("Digite a primeira nota do aluno\n");
				alunos[i].getNota().add(leitor.nextDouble());
				System.out.println("Digite a segunda nota do aluno\n");
				alunos[i].getNota().add(leitor.nextDouble());
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

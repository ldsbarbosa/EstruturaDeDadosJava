/**
 * @author Lucas Barbosa
 * Matricula: 202120194
 * Testar Cadastro de Aluno
 */
package aula_3;

import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			//criar um objeto da classe Aluno, ou Instanciar um Aluno.
			Aluno aluno1 = new Aluno();
			Aluno aluno2 = new Aluno();
			
			//ler e calcular dados do aluno1
			System.out.println("Digite a matrícula do aluno\n");
			aluno1.matricula = leitor.nextInt();
			System.out.println("Digite o nome do aluno\n");
			aluno1.nome = leitor.next();
			System.out.println("Digite a primeira nota do aluno\n");
			aluno1.nota1 = leitor.nextDouble();
			System.out.println("Digite a segunda nota do aluno\n");
			aluno1.nota2 = leitor.nextDouble();
			aluno1.calcularMedia();
			
			
			//ler e calcular dados do aluno2
			System.out.println("Digite a matrícula do aluno\n");
			aluno2.matricula = leitor.nextInt();
			System.out.println("Digite o nome do aluno\n");
			aluno2.nome = leitor.next();
			System.out.println("Digite a primeira nota do aluno\n");
			aluno2.nota1 = leitor.nextDouble();
			System.out.println("Digite a segunda nota do aluno\n");
			aluno2.nota2 = leitor.nextDouble();
			aluno2.calcularMedia();
			
			//imprimir dados
			aluno1.imprimirDados();
			aluno2.imprimirDados();
		}finally {
			leitor.close();
		}
	}
}

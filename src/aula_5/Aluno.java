package aula_5;

public class Aluno {
	private int matricula;
	private String nome, situacao;
	private double nota1, nota2, media;
	
	public Aluno(int matricula, String nome, double nota1, double nota2) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = (nota1 + nota2) / 2;
		if(media >= 5) {
			this.situacao = "Aprovado";
		}else {
			this.situacao = "Reprovado";
		}
	}
	
	@Override
	public String toString() { // Imprimir Dados
		return "Matrícula: "+ matricula + "\nNome: " + nome + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media
				+ "\nSituação: " + situacao;
	}
	
	public String imprimirDados() { // Imprimir Dados
		return "Matrícula: "+ matricula + "\nNome: " + nome + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media
				+ "\nSituação: " + situacao + "\n";
	}
	
	
}

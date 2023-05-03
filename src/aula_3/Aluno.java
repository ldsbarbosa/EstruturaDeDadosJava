package aula_3;

public class Aluno {
	public int matricula;
	public String nome;
	public double media, nota1, nota2;
	
	public void calcularMedia(){
		this.media = (this.nota1 + this.nota2) / 2;
	}
	public void imprimirDados() {
		System.out.println(
				"Matrícula:	"+matricula+"\n"+
				"Nome:		"+nome+"\n"+
				"Media:		"+media+"\n");
	}
}

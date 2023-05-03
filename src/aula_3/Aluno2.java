package aula_3;

import java.util.List;
import java.util.ArrayList;

public class Aluno2 {
	private int matricula;
	private String nome;
	private double media = 0;
	private List<Double> nota;
	
	public List<Double> getNota() {
		return nota;
	}

	public void setNota(List<Double> nota) {
		this.nota = nota;
	}

	public Aluno2(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota = new ArrayList<Double>();
	}
	
	public void calcularMedia(){
		for(int i = 0; i < this.nota.size(); i++) {
			this.media += this.nota.get(i);
		}
	}
	
	public void imprimirDados() {
		System.out.println(
				"Matrícula:	"+matricula+"\n"+
				"Nome:		"+nome+"\n"+
				"Media:		"+media+"\n");
	}
}

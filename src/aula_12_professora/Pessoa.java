package aula_12_professora;

public class Pessoa {
	
	public int id;
	public String nome;
	public int idade;
	
	public Pessoa(int id, String nome,int idade) {
		this.id=id;
		this.nome=nome;
		this.idade=idade;
	}
	
	public String toString() {
		return id +"  "+nome+"  "+idade +" anos";
	}

}

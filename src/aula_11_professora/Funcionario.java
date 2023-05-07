package aula_11_professora;

public class Funcionario {
	
	public String nome;
	public String cargo;
	
	
	public Funcionario(String nome,String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public String toString() {
		return nome + " - "+cargo;
	}
	
	
	

}

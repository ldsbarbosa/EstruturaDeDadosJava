package aula_12_professora;

public class Cliente {
	
	public String cpf;
	public String nome;
	
	//metodo construtor
	public Cliente(String cpf, String nome) {
		this.cpf=cpf;
		this.nome=nome;
	}
	
	
	public String toString() {
		return cpf+ " " +nome;
	}
	
	

}

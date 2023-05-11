package aula_12;

public class Pessoa {
	private Integer id;
	private String nome;
	private Integer idade;
	
	public Pessoa(Integer id, String nome, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [" + id + "]\nNome: " + nome + " || Idade: " + idade;
	}
	
	
}

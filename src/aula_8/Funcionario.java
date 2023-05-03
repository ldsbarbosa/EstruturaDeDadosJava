/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * 
 */
package aula_8;

public class Funcionario {
	private String nome, cargo;
	private double salario;
	private int idade;
	
	public Funcionario(String nome, String cargo, double salario, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimirDados() {
		System.out.println("Funcionario ["+this.nome+"]\nIdade: "+this.idade+
				"\nSalario: "+this.salario+
				"\nCargo: "+this.cargo);
	}
}

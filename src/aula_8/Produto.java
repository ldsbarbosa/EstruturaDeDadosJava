/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * 
 */
package aula_8;

public class Produto {
	private String nome;
	private String codigo;
	private int quantidade;
	
	public Produto(String nome, String codigo, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void subtrairProduto(int quantidade) {
		if(quantidade > this.quantidade || quantidade < 0) {
			return;
		}
		this.quantidade -= quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		if(quantidade < 0) {
			return;
		}
		this.quantidade += quantidade;
	}
	
	public void imprimirDados() {
		System.out.println("Produto ["+this.nome+"]\nCódigo: "+this.codigo+"\nQuantidade: "+this.quantidade);
	}
	
}

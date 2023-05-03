package aula_8_professora;
//declaração da classe
public class Produto {
	
	//atributos da classe
	public int codigo;
	public String nome;
	public int quantidade;
	
	//metodo construtor
	public Produto(int codigo, String nome, int quantidade) {
		this.codigo = codigo;
		this.nome =nome;
		this.quantidade = quantidade;
	}
	
	public void imprimirDados() {
		System.out.println("Código....: "+codigo+"\n"+
				           "Produto...: "+nome+"\n"+
				           "Quantidade: "+quantidade+"\n");
	}
	
	
	
	

}

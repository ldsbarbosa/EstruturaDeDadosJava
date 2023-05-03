package aula_6;

public class Viagem implements Comparable<Viagem>{
	private int idViagem, quantidadeDias, quantidadePessoas;
	private String destino;
	private double preco, precoTotal;
	
	public Viagem(int id, String dest, int qtdeDias, double preco, int qtdePes) {
		this.idViagem = id;
		this.destino = dest;
		this.quantidadeDias = qtdeDias;
		this.preco = preco;
		this.quantidadePessoas = qtdePes;
		this.calcularTotal(this.preco,this.quantidadePessoas,this.quantidadeDias);
	}
	
	public void calcularTotal(double preco, int qtdePes,int qtdeDias) {
		this.precoTotal = preco * qtdePes * qtdeDias;
		// return this.precoTotal;
	}
	
	public void imprimirDados() {
		System.out.println("Viagem ["+idViagem+"]\n"+
	"\tDestino: "+ this.destino +
	"\tQuantidade de dias: "+ this.quantidadeDias +
	"\tQuantidade de pessoas: "+ this.quantidadePessoas +
	"\tPreco unitário: R$"+ this.preco +
	"\tPreco Total: R$"+ this.precoTotal);
	}
	
	public double getPrecoTotal() {
		return precoTotal;
	}

	@Override
	public int compareTo(Viagem o) {
		return ((int) ( this.precoTotal - o.getPrecoTotal() ));
	}
}

package aula_3;

public class Conta {
	public String nome;
	public String numConta;
	public double saldo;
	
	public Conta(String nome, String numConta, double saldo) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public Conta() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public void depositar(double valor){
		saldo += valor;
	}
	public void sacar(double valor){
		if(valor > saldo) {
			return;
		}
		saldo -= valor;
	}
	public void imprimirDados() {
		System.out.println(
				"Nome do cliente:	"+nome+"\n"+
				"Número da conta:	"+numConta+"\n"+
				"Saldo:			  R$"+saldo+"\n");
	}
}

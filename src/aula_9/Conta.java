package aula_9;

public class Conta {
	private int numero;
	private double saldo;
	private String titular;
	public Conta(int numero, double saldo, String titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Conta ["+getNumero()+"]\n"
				+ "Titular: "+getTitular()+"\n"
				+ "Saldo: "+getSaldo();
	}
	
}

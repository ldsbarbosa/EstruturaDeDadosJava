package aula_13_exercicio;

public class NoD {
	public String valor;
	public NoD proximo;
	public NoD anterior;
	public NoD(String valor) {
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}
}

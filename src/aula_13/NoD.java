package aula_13;

public class NoD {
	public int valor;
	public NoD proximo;
	public NoD anterior;
	public NoD(int valor) {
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}
}

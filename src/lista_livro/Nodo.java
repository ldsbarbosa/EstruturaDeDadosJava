/**
 * Lista simplesmente encadeada
 */

package lista_livro;

public class Nodo {
	private float dado;
	private Nodo proximo;
	
	public Nodo() { }
	
	public Nodo(float dado, Nodo proximo) {
		this.dado = dado;
		this.proximo = proximo;
	}

	public float getDado() {
		return dado;
	}
	
	public void setDado(float dado) {
		this.dado = dado;
	}
	
	public Nodo getProximo() {
		return proximo;
	}
	
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
}

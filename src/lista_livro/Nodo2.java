/**
 * Lista duplamente encadeada
 */
package lista_livro;

public class Nodo2 {
	private float dado;
	private Nodo2 proximo;
	private Nodo2 anterior;
	
	public float getDado() {
		return dado;
	}
	
	public void setDado(float dado) {
		this.dado = dado;
	}
	
	public Nodo2 getProximo() {
		return proximo;
	}
	
	public void setProximo(Nodo2 proximo) {
		this.proximo = proximo;
	}

	public Nodo2 getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo2 anterior) {
		this.anterior = anterior;
	}
	
}

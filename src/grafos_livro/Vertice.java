package grafos_livro;

import java.util.ArrayList;
import java.util.List;

public class Vertice<T> {
	private final T valor;
	private List<Vertice<T>> vizinhos;

	public Vertice(T val) {
		this.valor = val;
	}

	public T getValor() {
		return valor;
	}

	public boolean adicionarAresta(Vertice<T> vert) {
		if (this.vizinhos == null) {
			this.vizinhos = new ArrayList<Vertice<T>>();
		}
		if (this.vizinhos.contains(vert)) {
			return false;
		} else {
			this.vizinhos.add(vert);
			return true;
		}
	 }

	public int contarVizinhos() {
		return (this.vizinhos == null) ? 0 : this.vizinhos.size();
	}

	@Override
	public boolean equals(Object obj) {
		return ((Vertice<T>) obj).getValor().equals(this.valor);
	}

	public List<Vertice<T>> getVizinhos() {
		return vizinhos;
	}
}
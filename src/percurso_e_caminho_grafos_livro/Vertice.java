package percurso_e_caminho_grafos_livro;

import java.util.ArrayList;
import java.util.List;

public class Vertice<T> {
	private final T valor;
	private EstadoVertice estado;
	private List<Vertice<T>> vizinhos;
	private int peso;

	public Vertice(T val) {
		this.valor = val;
		this.peso = 0;
	}

	public T getValor() {
		return valor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void marcar(EstadoVertice estado) {
		this.estado = estado;
	}

	public boolean ehVisitado() {
		return this.estado == EstadoVertice.VISITADO;
	}

	public boolean adicionarAresta(Vertice<T> vert) {
		if (this.vizinhos == null)
			this.vizinhos = new ArrayList<Vertice<T>>();
		if (this.vizinhos.contains(vert)) {
			return false;
		} else {
			this.vizinhos.add(vert);
			return true;
		}
	}

	public List<Vertice<T>> getVizinhos() {
		return vizinhos;
	}
}

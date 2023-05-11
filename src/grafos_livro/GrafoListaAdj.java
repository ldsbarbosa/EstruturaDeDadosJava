package grafos_livro;

import java.util.ArrayList;
import java.util.List;

public class GrafoListaAdj<T> {
	private int numArestas;
	private List<Vertice<T>> listaAdj;

	public GrafoListaAdj() {
		this.listaAdj = new ArrayList<Vertice<T>>();
	}

	public int getNumVertices() {
		return this.listaAdj.size();
	}

	public void adicionarAresta(Vertice<T> v1, Vertice<T> v2) {
		Vertice<T> vert = this.listaAdj.stream().filter(v -> v.equals(v1)).findFirst().orElse(null);
		if (vert == null) {
			v1.adicionarAresta(v2);
			this.listaAdj.add(v1);
			++this.numArestas;
		} else {
			if (vert.adicionarAresta(v2))
				++this.numArestas;
		}
	}
}

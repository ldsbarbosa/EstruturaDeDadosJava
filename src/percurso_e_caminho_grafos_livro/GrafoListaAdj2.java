package percurso_e_caminho_grafos_livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class GrafoListaAdj2<T> {
	private int numArestas;
	private List<Vertice<T>> listaAdj;
	private Map<Aresta<T>, Integer> pesoArestas;

	public GrafoListaAdj2() {
		this.listaAdj = new ArrayList<Vertice<T>>();
		this.pesoArestas = new HashMap<>();
	}

	public int getNumVertices() {
		return this.listaAdj.size();
	}

	public int getNumArestas() {
		return this.numArestas;
	}

	public Vertice<T> obterVertice(Vertice<T> vertice) {
		return this.listaAdj.stream().filter(v -> v.equals(vertice)).findFirst().get();
	}

	public List<Vertice<T>> obterAdjacentes(Vertice<T> vertice) {
		return this.listaAdj.stream().filter(v -> v.equals(vertice)).findFirst().get().getVizinhos();
	}

	private void marcarVertices(EstadoVertice estado) {
		this.listaAdj.forEach(v -> {
			v.marcar(estado);
			v.getVizinhos().forEach(n -> n.marcar(estado));
		});
	}

	public boolean ehAlcancavelPor(Vertice<T> vertice) {
		return this.listaAdj.stream().filter(v -> v.equals(vertice)).findFirst().get().ehVisitado();
	}

	public void buscarEmProfundidade(Vertice<T> inicio) {
		this.marcarVertices(EstadoVertice.NAO_VISITADO);
		Stack<Vertice<T>> pilhaTrajeto = new Stack<>();
		pilhaTrajeto.push(inicio);
		while (!pilhaTrajeto.isEmpty()) {
			Vertice<T> vertice = pilhaTrajeto.pop();
			if (!vertice.ehVisitado()) {
				vertice.marcar(EstadoVertice.VISITADO);
				if (vertice.getVizinhos() != null) {
					vertice.getVizinhos().forEach(pilhaTrajeto::push);
				}
			}
		}
	}

	public void adicionarAresta(Vertice<T> orig, Vertice<T> dest) {
		Vertice<T> vert = this.listaAdj.stream().filter(v -> v.equals(orig)).findFirst().orElse(null);

		if (vert == null) {
			orig.adicionarAresta(dest);
			this.listaAdj.add(orig);
			++this.numArestas;
		} else {
			if (vert.adicionarAresta(dest)) {
				++this.numArestas;
			}
		}

		if (this.listaAdj.stream().filter(v -> v.equals(dest)).findFirst().orElse(null) == null) {
			this.listaAdj.add(dest);
		}
	}

	public void adicionarArestaNaoOrientada(Vertice<T> orig, Vertice<T> dest) {
		this.adicionarAresta(orig, dest);
		this.adicionarAresta(dest, orig);
	}

	public void buscarEmLargura(Vertice<T> inicio) {
		this.marcarVertices(EstadoVertice.NAO_VISITADO);
		inicio.marcar(EstadoVertice.VISITADO);
		Queue<Vertice<T>> filaTrajeto = new LinkedList<>();
		filaTrajeto.add(inicio);
		while (!filaTrajeto.isEmpty()) {
			Vertice<T> vertice = filaTrajeto.remove();
			if (vertice.getVizinhos() != null) {
				vertice.getVizinhos().forEach(w -> {
					if (!w.ehVisitado()) {
						w.marcar(EstadoVertice.VISITADO);
						filaTrajeto.add(w);
					}
				});
			}
		}
	}

	public void adicionarAresta(Vertice<T> orig, Vertice<T> dest, Integer peso) {
		this.adicionarAresta(orig, dest);
		this.pesoArestas.put(new Aresta<T>(orig, dest, peso), peso);
	}

	public Map<Vertice<T>, Vertice<T>> executarDijkstra(Vertice<T> inicio) {
		Aresta<T> aresta = new Aresta<>();
		Map<Vertice<T>, Vertice<T>> predecessor = new HashMap<>();
		List<Vertice<T>> fila = new ArrayList<>();
		this.listaAdj.forEach(v -> {
			v.setPeso(Integer.MAX_VALUE);
			fila.add(v);
			predecessor.put(v, null);
		});
		inicio.setPeso(0);
		List<Vertice<T>> processados = new ArrayList<>();
		while (!fila.isEmpty()) {
			fila.sort(Comparator.comparing(Vertice<T>::getPeso));
			Vertice<T> vertice = fila.remove(0);
			processados.add(vertice);
			if (vertice.getVizinhos() != null) {
				vertice.getVizinhos().forEach(w -> {
					if (!processados.contains(w)) {
						aresta.setVertices(vertice, w);
						int novoPeso = vertice.getPeso() + pesoArestas.get(aresta);
						if (novoPeso < w.getPeso()) {
							w.setPeso(novoPeso);
							predecessor.put(w, vertice);
						}
					}
				});
			}
		}
		return predecessor;
	}
}

package grafos_livro;

import java.util.stream.IntStream;

public class GrafoMatrizAdj {
	private static final int COM_ARESTA = 1;
	private static final int SEM_ARESTA = 0;
	private final int numVertices;
	private int numArestas;
	private int[][] matrizAdj;

	public GrafoMatrizAdj(int numVertices) {
		this.numVertices = numVertices;
		this.matrizAdj = new int[numVertices][numVertices];
	}

	public void adicionarAresta(int orig, int dest) {
		if (this.matrizAdj[orig][dest] == SEM_ARESTA) {
			this.matrizAdj[orig][dest] = COM_ARESTA;
			++this.numArestas;
		}
	}

	public int getNumVertices() {
		return this.numVertices;
	}

	public int getNumArestas() {
		return this.numArestas;
	}
}

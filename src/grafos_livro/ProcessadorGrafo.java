package grafos_livro;

public class ProcessadorGrafo {
	public static void main(String[] args) {
		GrafoListaAdj<Integer> grafo = new GrafoListaAdj<>();
		grafo.adicionarAresta(new Vertice<Integer>(9), new Vertice<Integer>(10));
		grafo.adicionarAresta(new Vertice<Integer>(9), new Vertice<Integer>(11));
		grafo.adicionarAresta(new Vertice<Integer>(9), new Vertice<Integer>(12));
		grafo.adicionarAresta(new Vertice<Integer>(10), new Vertice<Integer>(9));
		grafo.adicionarAresta(new Vertice<Integer>(11), new Vertice<Integer>(9));
		grafo.adicionarAresta(new Vertice<Integer>(11), new Vertice<Integer>(12));
		grafo.adicionarAresta(new Vertice<Integer>(12), new Vertice<Integer>(9));
		grafo.adicionarAresta(new Vertice<Integer>(12), new Vertice<Integer>(11));
		GrafoMatrizAdj grafoMatrizAdj = new GrafoMatrizAdj(4);
		grafoMatrizAdj.adicionarAresta(0, 1);
		grafoMatrizAdj.adicionarAresta(0, 2);
		grafoMatrizAdj.adicionarAresta(0, 3);
		grafoMatrizAdj.adicionarAresta(1, 0);
		grafoMatrizAdj.adicionarAresta(2, 0);
		grafoMatrizAdj.adicionarAresta(2, 3);
		grafoMatrizAdj.adicionarAresta(3, 0);
		grafoMatrizAdj.adicionarAresta(3, 2);
	}
}

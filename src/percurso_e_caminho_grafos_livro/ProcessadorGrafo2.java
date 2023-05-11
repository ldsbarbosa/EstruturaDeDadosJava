package percurso_e_caminho_grafos_livro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProcessadorGrafo2 {
	public static void main(String[] args) {
		// Criacao do grafo
		Map<String, Vertice<String>> vertices = new	HashMap<>();
		Arrays.asList(new String[] { "s", "t", "x", "y", "z"
		}) .forEach(v -> vertices.put(v, new Vertice<String>(v)));
		String[][] arestas = new String[][]
				{{"s", "t", "10"}, {"s", "y", "5"}, {"t", "y", "2"},
				{"t", "x", "1"}, {"y", "t", "3"}, {"y", "x", "9"},
				{"y", "z", "2"}, {"x", "z", "4"}, {"z", "x", "6"},
				{"z", "s", "7"}};
		GrafoListaAdj2<String> grafo = new GrafoListaAdj2<>(); Arrays.asList(arestas).forEach(a ->
		grafo.adicionarAresta( vertices.get(a[0]),vertices.get(a[1]),Integer.valueOf(a[2])));
		// Chamada ao algoritmo de Dijkstra
		Map<Vertice<String>, Vertice<String>> rota = grafo.executarDijkstra(vertices.get("s"));
		// Impressao dos vertices com valors de distancia e
		// respectivo vertice antecessor
		System.out.println("Menor Caminho");
		rota.forEach((k, v) -> {
			System.out.println(k + " -> " + v);
		});
	}
}

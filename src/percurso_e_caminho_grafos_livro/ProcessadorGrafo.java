package percurso_e_caminho_grafos_livro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProcessadorGrafo {
	public static void main(String[] args) {
		Map<String, Vertice<String>> vertices = new HashMap<>();
		Arrays.asList( new String[] { "s", "a", "b", "c", "d", "e" }).forEach(v -> vertices.put( v, new Vertice<String>(v)));
		String[][] arestas = new String[][]
				{{"s", "a"},{"s", "b"},{"a", "c"},{"b", "c"},{"b", "d"},{"c", "e"},{"c", "d"},{"d", "e"}};
		GrafoListaAdj2<String> grafo = new GrafoListaAdj2<>();
		Arrays.asList(arestas).forEach(a -> 
			grafo.adicionarArestaNaoOrientada(vertices.get(a[0]), vertices.get(a[1]))
		);
		grafo.buscarEmProfundidade(vertices.get("s")); System.out.println("Eh alcancavel: " + grafo.ehAlcancavelPor(vertices.
		get("e")));
	}
}

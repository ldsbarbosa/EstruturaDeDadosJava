package aula_10;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Exemplo8 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abobóra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		// Ex.10
		palavras.add("Siriguela");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Laranja");
		palavras.add("Siriguela");
		palavras.add("Siriguela");
		System.out.println(palavras);
		System.out.println(filtrarPorAparecimentoImpar(palavras));
	}
	
	// Ex. 10
	// Escreva um método em Java que receba uma Queue como parâmetro,
	// e retorne uma nova Queue contendo apenas as palavras que
	// aparecem um número ímpar de vezes na fila original.
	// Dica: utilize um mapa auxiliar para contar quantas vezes cada elemento aparece na fila.
	
	public static Queue<String> filtrarPorAparecimentoImpar(Queue<String> fila){
		Map<String, Integer> contagem = new HashMap<String, Integer>();
	    for (String palavra : fila) {
	        contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
	    }
	    Queue<String> filaFiltrada = new LinkedList<String>();
	    for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
	        if (entrada.getValue() % 2 != 0) {
	            filaFiltrada.add(entrada.getKey());
	        }
	    }
	    return filaFiltrada;
	}
}

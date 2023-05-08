package aula_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exemplo4 {
	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abobóra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		// Ex.6
		System.out.println(inverteFila(palavras));
	}
	
	// Ex. 6
	// Escreva um método em Java que receba uma Queue como parâmetro,
	// e retorne uma nova Queue com os elementos invertidos, ou seja,
	// o primeiro elemento da fila original deve ser o último elemento da nova fila,
	// o segundo elemento deve ser o penúltimo elemento, e assim por diante.
	// Dica: utilize uma pilha auxiliar para inverter a ordem dos elementos.
	public static Queue<String> inverteFila(Queue<String> palavras){
		Stack<String> palavrasInvertidas = new Stack<String>();
		while(!palavras.isEmpty()) {
			String palavraRemovida = palavras.remove();
			palavrasInvertidas.push(palavraRemovida);
		}
		while(!palavrasInvertidas.empty()) {
			String palavraRemovida = palavrasInvertidas.pop();
			palavras.add(palavraRemovida);
		}
		return palavras;
	}
}

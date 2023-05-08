package aula_10;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo2 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abobóra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		
		// Para executar as soluções, basta descomentar
		// Ex.1
		enfileirar(palavras, "Tomate");
		System.out.println(palavras);
		
		// Ex.2
		desenfileirar(palavras);
		System.out.println(palavras);
		
		// Ex.3
		System.out.println(verOTopo(palavras));
		
		// Ex.4
		System.out.println(isEmpty(palavras));
	}
	
	// Ex. 1
	// Escreva um método em Java que receba uma Queue e um elemento x como parâmetros,
	// e adicione o elemento x no final da fila.
	// Utilize a operação .add() para realizar esta operação.
	public static void enfileirar(Queue<String> fila, String palavra) { // First In
	    fila.add(palavra); // offer() não lança exceção
	}
	
	// Ex. 2
	// Escreva um método em Java que receba uma Queue como parâmetro,
	// e remova o primeiro elemento da fila.
	// Utilize a operação .remove() para realizar esta operação.
	public static void desenfileirar(Queue<String> fila) { // First Out
	    fila.remove(); // poll() não lança exceção
	}
	
	// Ex. 3
	// Escreva um método em Java que receba uma Queue como parâmetro,
	// e retorne o primeiro elemento da fila sem removê-lo.
	// Utilize a operação .element() para realizar esta operação.
	public static String verOTopo(Queue<String> fila) {
	    return fila.element(); // peek() não lança exceção
	}
	
	// Ex. 4
	//Escreva um método em Java que receba uma Queue como parâmetro,
	// e retorne true se a fila estiver vazia, ou false caso contrário.
	// Utilize a operação .isEmpty() para realizar esta operação.
	public static boolean isEmpty(Queue<String> fila) {
	    return fila.isEmpty();
	}
}

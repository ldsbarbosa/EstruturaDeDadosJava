package aula_10;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo2 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abob�ra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		
		// Para executar as solu��es, basta descomentar
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
	// Escreva um m�todo em Java que receba uma Queue e um elemento x como par�metros,
	// e adicione o elemento x no final da fila.
	// Utilize a opera��o .add() para realizar esta opera��o.
	public static void enfileirar(Queue<String> fila, String palavra) { // First In
	    fila.add(palavra); // offer() n�o lan�a exce��o
	}
	
	// Ex. 2
	// Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e remova o primeiro elemento da fila.
	// Utilize a opera��o .remove() para realizar esta opera��o.
	public static void desenfileirar(Queue<String> fila) { // First Out
	    fila.remove(); // poll() n�o lan�a exce��o
	}
	
	// Ex. 3
	// Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e retorne o primeiro elemento da fila sem remov�-lo.
	// Utilize a opera��o .element() para realizar esta opera��o.
	public static String verOTopo(Queue<String> fila) {
	    return fila.element(); // peek() n�o lan�a exce��o
	}
	
	// Ex. 4
	//Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e retorne true se a fila estiver vazia, ou false caso contr�rio.
	// Utilize a opera��o .isEmpty() para realizar esta opera��o.
	public static boolean isEmpty(Queue<String> fila) {
	    return fila.isEmpty();
	}
}

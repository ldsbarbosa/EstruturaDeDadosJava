package aula_10;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo3 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		Queue<String> palavras2 = new LinkedList<String>();
		
		// Inser��es, palavras 1
		palavras.add("Abob�ra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		
		// Inser��es, palavras 2
		palavras2.add("Kiwi");
		palavras2.add("Hortel�");
		palavras2.add("Arroz");
		palavras2.add("Feij�o");
		palavras2.add("Beringela");
		System.out.println(interleave(palavras, palavras2));
	}

	// Ex. 5
	// Escreva um m�todo em Java que receba duas Queues como par�metros,
	// e combine os elementos das duas filas em uma terceira fila,
	// de modo que os elementos fiquem alternados entre as duas filas.
	// Utilize as opera��es .offer() e .poll() para realizar esta opera��o.
	public static Queue<String> interleave(Queue<String> fila1, Queue<String> fila2) {
	    Queue<String> resultado = new LinkedList<String>();
	    while (!fila1.isEmpty() || !fila2.isEmpty()) {
	        if (!fila1.isEmpty()) {
	            resultado.add(fila1.remove());
	        }
	        if (!fila2.isEmpty()) {
	            resultado.add(fila2.remove());
	        }
	    }
	    return resultado;
	}

}

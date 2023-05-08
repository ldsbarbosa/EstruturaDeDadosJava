package aula_10;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exemplo7 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abob�ra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		
		// Ex.9
		palavras.add("Siriguela");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Laranja");
		palavras.add("Siriguela");
		System.out.println(palavras);
		System.out.println(possuiElementoRepetido(palavras));
	}
	
	// Ex. 9
	// Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e retorne true se a fila cont�m pelo menos um elemento repetido, ou false caso contr�rio.
	// Dica: utilize um conjunto auxiliar para verificar se um elemento j� apareceu na fila.
	
	public static boolean possuiElementoRepetido(Queue<String> fila){
		Set<String> elementosUnicos = new HashSet<String>();
	    while (!fila.isEmpty()) {
	        String elemento = fila.poll();
	        if (elementosUnicos.contains(elemento)) {
	            return true;
	        }
	        elementosUnicos.add(elemento);
	    }
	    return false;
	}
}

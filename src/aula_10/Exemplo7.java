package aula_10;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exemplo7 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abobóra");
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
	// Escreva um método em Java que receba uma Queue como parâmetro,
	// e retorne true se a fila contém pelo menos um elemento repetido, ou false caso contrário.
	// Dica: utilize um conjunto auxiliar para verificar se um elemento já apareceu na fila.
	
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

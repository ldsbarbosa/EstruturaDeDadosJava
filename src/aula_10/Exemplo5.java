package aula_10;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exemplo5 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abobóra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		
		 //Ex.7
		palavras.add("Siriguela");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Laranja");
		palavras.add("Siriguela");
		System.out.println(palavras);
		System.out.println(tirarRepeticao(palavras));
	}
	
	// Ex. 7
	// Escreva um método em Java que receba uma Queue como parâmetro,
	// e remova todos os elementos repetidos da fila,
	// mantendo apenas a primeira ocorrência de cada elemento.
	// Dica: utilize um conjunto auxiliar para verificar se um elemento já apareceu na fila.
	
	public static Queue<String> tirarRepeticao(Queue<String> fila){
		Set<String> elementosUnicos = new HashSet<String>();
	    Queue<String> filaSemRepetidos = new LinkedList<String>();
	    while (!fila.isEmpty()) {
	        String elemento = fila.poll();
	        if (elementosUnicos.add(elemento)) {
	            filaSemRepetidos.offer(elemento);
	        }
	    }
	    return filaSemRepetidos;
	}

}

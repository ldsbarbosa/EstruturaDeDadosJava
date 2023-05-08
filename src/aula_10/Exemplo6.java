package aula_10;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo6 {

	public static void main(String[] args) {
		Queue<String> palavras = new LinkedList<String>();
		palavras.add("Abobóra");
		palavras.add("Laranja");
		palavras.add("Ameixa");
		palavras.add("Siriguela");
		palavras.add("Banana");
		
		// Ex.8
		System.out.println(selecionarApenarComecoVogal(palavras));

	}
	
	// Ex. 8
	// Escreva um método em Java que receba uma Queue como parâmetro,
	// e retorne uma nova Queue contendo apenas palavras que começam com vogais da fila original.
	// Dica: crie uma nova fila e adicione apenas palavras que começam com vogais da fila original.
	public static Queue<String> selecionarApenarComecoVogal(Queue<String> fila){
		Queue<String> filaFiltrada = new LinkedList<String>();
	    for (String palavra : fila) {
	        if ("aeiouAEIOU".indexOf(palavra.charAt(0)) != -1) {
	            filaFiltrada.add(palavra);
	        }
	    }
	    return filaFiltrada;
	}

}

// Exerc�cios gerados pelo ChatGPT
package aula11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
		
		// Ex.5
//		Queue<String> palavras2 = new LinkedList<String>();
//		palavras2.add("Kiwi");
//		palavras2.add("Hortel�");
//		palavras2.add("Arroz");
//		palavras2.add("Feij�o");
//		palavras2.add("Beringela");
//		System.out.println(interleave(palavras, palavras2));
		
		// Ex.6
//		System.out.println(inverteFila(palavras));
		
		// Ex.7
//		palavras.add("Siriguela");
//		palavras.add("Laranja");
//		palavras.add("Ameixa");
//		palavras.add("Laranja");
//		palavras.add("Siriguela");
//		System.out.println(palavras);
//		System.out.println(tirarRepeticao(palavras));
		
		// Ex.8
//		System.out.println(selecionarApenarComecoVogal(palavras));
		
		// Ex.9
//		palavras.add("Siriguela");
//		palavras.add("Laranja");
//		palavras.add("Ameixa");
//		palavras.add("Laranja");
//		palavras.add("Siriguela");
//		System.out.println(palavras);
//		System.out.println(possuiElementoRepetido(palavras));
		
		// Ex.10
//		palavras.add("Siriguela");
//		palavras.add("Laranja");
//		palavras.add("Ameixa");
//		palavras.add("Laranja");
//		palavras.add("Siriguela");
//		palavras.add("Siriguela");
//		System.out.println(palavras);
//		System.out.println(filtrarPorAparecimentoImpar(palavras));		
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
	
	// Ex. 6
	// Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e retorne uma nova Queue com os elementos invertidos, ou seja,
	// o primeiro elemento da fila original deve ser o �ltimo elemento da nova fila,
	// o segundo elemento deve ser o pen�ltimo elemento, e assim por diante.
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


	
	// Ex. 7
	// Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e remova todos os elementos repetidos da fila,
	// mantendo apenas a primeira ocorr�ncia de cada elemento.
	// Dica: utilize um conjunto auxiliar para verificar se um elemento j� apareceu na fila.
	
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
	
	// Ex. 8
	// Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e retorne uma nova Queue contendo apenas palavras que come�am com vogais da fila original.
	// Dica: crie uma nova fila e adicione apenas palavras que come�am com vogais da fila original.
	
	public static Queue<String> selecionarApenarComecoVogal(Queue<String> fila){
		Queue<String> filaFiltrada = new LinkedList<String>();
	    for (String palavra : fila) {
	        if ("aeiouAEIOU".indexOf(palavra.charAt(0)) != -1) {
	            filaFiltrada.add(palavra);
	        }
	    }
	    return filaFiltrada;
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
	
	// Ex. 10
	// Escreva um m�todo em Java que receba uma Queue como par�metro,
	// e retorne uma nova Queue contendo apenas as palavras que
	// aparecem um n�mero �mpar de vezes na fila original.
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

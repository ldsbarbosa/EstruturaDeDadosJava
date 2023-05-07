/*
 *  7- Implemente uma função para ordenar uma pilha em ordem crescente,
 * utilizando apenas uma pilha adicional como espaço de armazenamento temporário.
 */
package aula_11;

import java.util.Stack;

public class Exercicio7 {
	public static void main(String[] args) {
	    Stack<Integer> pilha = new Stack<Integer>();
	    pilha.push(10);
	    pilha.push(5);
	    pilha.push(8);
	    pilha.push(2);
	    pilha.push(7);
	    pilha.push(3);

	    ordenarPilha(pilha);

	    while (!pilha.isEmpty()) {
	      System.out.println(pilha.pop());
	    }
	  }

	  public static void ordenarPilha(Stack<Integer> pilha) {
	    if (!pilha.isEmpty()) {
	      int elemento = pilha.pop();
	      ordenarPilha(pilha);
	      inserirOrdenado(pilha, elemento);
	    }
	  }

	  public static void inserirOrdenado(Stack<Integer> pilha, int elemento) {
	    if (pilha.isEmpty() || elemento > pilha.peek()) {
	      pilha.push(elemento);
	    } else {
	      int temp = pilha.pop();
	      inserirOrdenado(pilha, elemento);
	      pilha.push(temp);
	    }
	  }
}

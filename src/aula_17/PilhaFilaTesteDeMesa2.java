package aula_17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilhaFilaTesteDeMesa2 {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Stack<String> pilha = new Stack<>();

		fila.offer("A");
		pilha.push("E");
		pilha.push("I");
		pilha.push(fila.poll());
		fila.offer("O");
		pilha.pop();
		pilha.push("U");

		System.out.println("Estado final da pilha: " + pilha);
		System.out.println("Estado final da fila: " + fila);
	}

}

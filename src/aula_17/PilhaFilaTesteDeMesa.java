package aula_17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilhaFilaTesteDeMesa {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Stack<String> pilha = new Stack<>();

		fila.offer("A");
		pilha.push("B");
		fila.poll();
		pilha.push("C");
		pilha.pop();
		fila.offer("D");
		fila.poll();
		pilha.pop();

		System.out.println("Estado final da pilha: " + pilha);
		System.out.println("Estado final da fila: " + fila);
	}
}

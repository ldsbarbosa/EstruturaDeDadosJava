package aula_17;

import java.util.Stack;

public class TesteDeMesaPilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<>();

		// Operações na pilha
		pilha.push("A");
		pilha.push("B");
		pilha.pop();
		pilha.push("C");
		pilha.pop();
		pilha.push("D");

		System.out.println("Estado final da pilha: " + pilha);
	}
}

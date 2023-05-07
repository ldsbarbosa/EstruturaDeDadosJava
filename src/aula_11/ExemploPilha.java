package aula_11;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		// Assim tambem funciona:
		// Stack<String> pilha = new Stack<>();
		pilha.push("Senhor dos Aneis");
		pilha.push("Sistemas Operacionais Modernos");
		pilha.push("Redes de Computadores");
		pilha.push("O diário de um banana");
		System.out.println("(peek)Topo da pilha: " + pilha.peek()); // peek() para pilhas lança exceção se tiver erro
		// System.out.println("(top)Topo da pilha: "+pilha.top()); // O método top()
		// não existe na classe Stack, que serviria para ver o elemento do topo sem remover.
		// Isso se dá por que seria um método implementado em uma pilha que o próprio desenvolvedor faria 
		while (!pilha.empty()) {
			System.out.println("Elemento do topo: " + pilha.pop()); // pop() lança exceção,
		}

	}

}

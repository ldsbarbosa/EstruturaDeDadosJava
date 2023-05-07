package aula_11;

import java.util.Stack;

public class Exercicio1 {
	public static void main(String[] args) {
		// • Criar um programa em java que declare uma pilha chamada
		// pilhaOrigem do tipo inteiro e adicione os números 1,2,3,4,5 nela.
		Stack<Integer> pilhaOrigem = new Stack<>();
		for (int i = 1; i <= 5; i++) {
			pilhaOrigem.push(Integer.valueOf(i)); // pilhaOrigem.push(i); Também funciona
		}

		// • Declare outra pilha de inteiro chamada pilhaDestino
		Stack<Integer> pilhaDestino = new Stack<>();

		// • Retire os elementos da pilhaOrigem e empilhe na pilhaDestino
		while (!pilhaOrigem.empty()) {
			System.out.println(pilhaOrigem.peek());
			pilhaDestino.push(pilhaOrigem.pop());
		}

		// • Desempilhe a pilhaDestino, imprimindo todos os elementos dela
		while (!pilhaDestino.empty()) {
			// System.out.println(pilhaDestino.pop()); Tambem funciona
			System.out.println(pilhaDestino.pop().toString());
		}

		// • Ao final verifique se as duas pilhas estão vazias
		if (pilhaOrigem.empty() && pilhaDestino.empty()) {
			System.out.println("Ambas as pilhas estão vazias.");
		} else {
			if (pilhaOrigem.empty()) {
				System.out.println("A pilha de origem está vazia.");
			} else {
				System.out.println("A pilha de origem possui elementos.");
			}
			if (pilhaDestino.empty()) {
				System.out.println("A pilha de destino está vazia.");
			} else {
				System.out.println("A pilha de destino possui elementos.");
			}
		}
	}
}

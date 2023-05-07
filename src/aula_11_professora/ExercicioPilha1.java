package aula_11_professora;

import java.util.Stack;

public class ExercicioPilha1 {

	public static void main(String[] args) {
		Stack<Integer> pilhaOrigem =new Stack<>();
		Stack<Integer> pilhaDestino =new Stack<>();
		
		pilhaOrigem.push(1);
		pilhaOrigem.push(2);
		pilhaOrigem.push(3);
		pilhaOrigem.push(4);
		pilhaOrigem.push(5);
		
		System.out.println("Pilha de Origem:");
		while (! pilhaOrigem.empty()) {
			//imprime o elemento do topo sem remover
			System.out.println(pilhaOrigem.peek());
			//remove da pilhaOrigem e adiciona na pilhaDestino
			pilhaDestino.push(pilhaOrigem.pop());
		}
		
		System.out.println("Pilha de Destino");
		while (! pilhaDestino.empty()) {
			//imprime o elemento do topo removendo
			System.out.println(pilhaDestino.pop());
		}
		
		System.out.println("A pilhaOrigem está vazia ="
		                       +pilhaOrigem.empty());
		System.out.println("A pilhaDestino está vazia ="+pilhaDestino.empty());
	}

}

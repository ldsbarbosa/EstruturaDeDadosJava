package aula_16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercicio16 {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		Stack<Integer> pilha = new Stack<>();
		pilha.push(5);
		pilha.push(8);
		pilha.push(2);
		pilha.push(1);
		
		fila.add(3);
		fila.add(6);
		fila.add(4);
		fila.add(9);
		
		pilha.pop();
		fila.add(pilha.pop());
		System.out.println("pilhaDados: "+pilha);
		System.out.println("filaDados: "+fila);
	}
}

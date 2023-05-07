/*
 * 5- Implemente uma função para verificar se uma sequência de parênteses (abertos e fechados)
 * está balanceada, ou seja, se cada parêntese aberto tem um parêntese fechado correspondente.
 * Utilize uma pilha para realizar a verificação.
 */
package aula_11;

import java.util.Stack;

public class Exercicio5 {
	public static void main(String[] args) {
		String sequencia = "()(()()()())()()"; // exemplo de sequência de parênteses
		if (verificarBalanceamento(sequencia)) {
			System.out.println("A sequência está balanceada");
		} else {
			System.out.println("A sequência não está balanceada");
		}
	}

	public static boolean verificarBalanceamento(String sequencia) {
		Stack<Character> pilha = new Stack<Character>();
		for (int i = 0; i < sequencia.length(); i++) {
			char c = sequencia.charAt(i);
			if (c == '(') {
				pilha.push(c);
			} else if (c == ')') {
				if (pilha.isEmpty()) {
					return false;
				} else {
					pilha.pop();
				}
			}
		}
		return pilha.isEmpty();
	}
}
/*
 * 5- Implemente uma fun��o para verificar se uma sequ�ncia de par�nteses (abertos e fechados)
 * est� balanceada, ou seja, se cada par�ntese aberto tem um par�ntese fechado correspondente.
 * Utilize uma pilha para realizar a verifica��o.
 */
package aula_11;

import java.util.Stack;

public class Exercicio5 {
	public static void main(String[] args) {
		String sequencia = "()(()()()())()()"; // exemplo de sequ�ncia de par�nteses
		if (verificarBalanceamento(sequencia)) {
			System.out.println("A sequ�ncia est� balanceada");
		} else {
			System.out.println("A sequ�ncia n�o est� balanceada");
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
package aula_11_professora;

import java.util.Random;
import java.util.Stack;

public class PilhaNumeros {

	public static void main(String[] args) {
		Stack<Integer> pilhaPar = new Stack<>();
		Stack<Integer> pilhaImpar = new Stack<>();
		Integer numSorteado;
		Random geradorNum = new Random();
		
		for (int i=1 ; i<=10; i++) {
			numSorteado  = geradorNum.nextInt(101);
			if (numSorteado % 2 == 0) {
				pilhaPar.push(numSorteado);
			}else {
				pilhaImpar.push(numSorteado);
			}
		}
		
		System.out.println("Tamanho da pilha de numeros  "+pilhaPar);
		System.out.println("Tamanho da pilha de numeros impares "+pilhaImpar.size());
		
		System.out.println("Numeros pares");
		while (! pilhaPar.empty()) {
			System.out.println(pilhaPar.pop());
		}
		
		System.out.println("Numeros impares");
		while (! pilhaImpar.empty()) {
			System.out.println(pilhaImpar.pop());
		}
		
	}

}

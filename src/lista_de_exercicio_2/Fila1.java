// Implemente uma fila utilizando duas pilhas.
package lista_de_exercicio_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Fila1 {
	public static void main(String[] args) {
		//Fila
		Queue<Integer> fila = new LinkedList<Integer>();
		
		// Pilhas
		Stack<Integer> pilha1 = new Stack<Integer>();
		Stack<Integer> pilha2 = new Stack<Integer>();
		Random aleatorio = new Random();
		int tamanhoTotal = 10 + aleatorio.nextInt(11); // Mínimo 20, máximo 40
		for(int i = 0; i < tamanhoTotal; i++) {
			pilha1.push(aleatorio.nextInt(1000));
			pilha2.push(aleatorio.nextInt(1000));
		}
		System.out.println("Pilhas um, de tamanho "+pilha1.size()+": ");
		System.out.println(pilha1);
		System.out.println("Pilha dois, de tamanho "+pilha2.size()+": ");
		System.out.println(pilha2);
		while( !pilha1.empty() && !pilha2.empty()) {
			if(!pilha1.empty()) {
				fila.offer(pilha1.pop());
			}
			if(!pilha2.empty()) {
				fila.offer(pilha2.pop());
			}
		}
		System.out.println("\n##Fila formada a partir das pilhas##");
		System.out.println(fila);
	}
}

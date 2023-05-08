// Implemente uma pilha que mantenha o menor elemento em tempo constante.
package lista_de_exercicio_2;

import java.util.Random;
import java.util.Stack;

public class Pilha1 {
	private Stack<Integer> pilha;
	private Stack<Integer> menorElemento;

	public Pilha1() {
		pilha = new Stack<>();
		menorElemento = new Stack<>();
	}

	public void push(int valor) {
		pilha.push(valor);
		if (menorElemento.isEmpty() || valor <= menorElemento.peek()) {
			menorElemento.push(valor);
		}
	}

	public int pop() {
		int valor = pilha.pop();
		if (valor == menorElemento.peek()) {
			menorElemento.pop();
		}
		return valor;
	}
	
	public Stack<Integer> getPilha() {
		return this.pilha;
	}

	public int getMenorElemento() throws Exception {
		if(menorElemento.isEmpty()) {
			throw new Exception("Não há menor elemento.");
		}
		return menorElemento.peek();
	}

	public static void main(String[] args) {
		Pilha1 pilha = new Pilha1();
		Random aleatorio = new Random();
		int tamanhoTotal = 5 + aleatorio.nextInt(2), retirada = tamanhoTotal - aleatorio.nextInt(5);
		for(int i = 0; i < tamanhoTotal; i++) {
			pilha.push(aleatorio.nextInt(21));
		}
		
		System.out.println("Pilha: " + pilha.getPilha());
		try {
			System.out.println("Menor elemento da pilha: " + pilha.getMenorElemento());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for(int i = 0; i < retirada; i++) {
			pilha.pop();
		}

		System.out.println("Pilha: " + pilha.getPilha());
		try {
			System.out.println("Menor elemento da pilha: " + pilha.getMenorElemento());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

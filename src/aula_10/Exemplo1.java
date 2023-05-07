package aula_10;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo1 {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("elemento1");
		fila.add("elemento2");
		fila.add("elemento3");
		System.out.println("Elementos na fila: "+ fila);
		String primeiroElemento = fila.peek(); // Índice 0, cabeça
		System.out.println("Primeiro elemento na fila: " + primeiroElemento);
		fila.remove();
		System.out.println("Elementos na fila após remover o primeiro: " + fila);
		// Agora, elemento 2 é a cabeça.
	}
}

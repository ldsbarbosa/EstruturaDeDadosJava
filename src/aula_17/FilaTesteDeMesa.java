package aula_17;

import java.util.LinkedList;
import java.util.Queue;

public class FilaTesteDeMesa {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<>();

		// Operações na fila
		fila.offer(3);
		fila.offer(7);
		fila.poll();
		fila.offer(5);
		fila.poll();
		fila.offer(9);

		System.out.println("Estado final da fila: " + fila);
	}
}

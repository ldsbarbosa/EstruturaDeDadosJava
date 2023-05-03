package fila_livro;

import java.util.Queue;
import java.util.LinkedList;

public class Principal2 {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		for( int i = 0; i < 10; i++) {
			fila.add(i);
		}
		System.out.println("Elementos na fila: "+fila);
		fila.remove();
		System.out.println("Elementos na fila: "+fila);
	}
}

package aula_10_professora;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploIFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("elemento1");
		fila.add("elemento2");
		fila.add("elemento3");
		System.out.println("Fila = "+fila);
		System.out.println("Primeiro da fila = "+fila.element());
		System.out.println("Fila = "+fila);
		
		fila.poll();
		System.out.println("Fila = "+fila);
		
		fila.poll();
		System.out.println("Fila = "+fila);
		
		
		fila.poll();
		System.out.println("Fila = "+fila);
		
		fila.poll();
		System.out.println("Fila = "+fila);
		
		
	}

}

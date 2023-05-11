package aula_12_professora;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestarFilaPilhaCliente {

	public static void main(String[] args) {
		
		//cria a fila de cliente
		Queue<Cliente> filaCliente = new LinkedList<>();
		//cria a pilha de cliente
		Stack<Cliente> pilhaCliente = new Stack<>();
		
		//adicionar 5 clientes na fila
		Cliente c =new Cliente("111.111.111-11","Maria");
		
		filaCliente.add(c);
		filaCliente.add(new Cliente("222.222.222-22", "Paulo"));
		filaCliente.add(new Cliente("333.333.333-33", "João"));
		filaCliente.add(new Cliente("444.444.444-44", "Ricardo"));
		filaCliente.add(new Cliente("555.555.555-55", "Ana"));
		
		//imprimir fila
		System.out.println("Fila");
		for (Cliente cliente: filaCliente) {
			System.out.println(cliente);
			
		}
		
		//adicionar na pilha
		for (Cliente cliente: filaCliente) {
			pilhaCliente.push(cliente);
		}
		
		
		//remove da fila
		while (! filaCliente.isEmpty()) {
			filaCliente.remove();
		}
		
		System.out.println("Fila está vazia "+filaCliente.isEmpty());
		
		
		System.out.println("Pilha");
		while (! pilhaCliente.isEmpty()) {
			System.out.println(pilhaCliente.pop());
		}
		
		System.out.println("Pilha está vazia "+pilhaCliente.isEmpty());

	}

}

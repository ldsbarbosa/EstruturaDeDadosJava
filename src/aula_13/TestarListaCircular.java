package aula_13;

public class TestarListaCircular {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		lista.adicionar(10);
		lista.adicionar(20);
		lista.adicionar(30);
		System.out.println("Lista original:");
		lista.imprimir();
		lista.remover(20);
		System.out.println("Lista após remover 20:");
		lista.imprimir();
	}
}

package aula_13_2_professora;

public class TestarListaDuplamenteEncadeada {
	
	    public static void main(String[] args) {
	        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

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
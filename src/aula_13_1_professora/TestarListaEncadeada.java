package aula_13_1_professora;

public class TestarListaEncadeada {
	public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionar(50);

        lista.imprimir();
    }
}
package lista_livro;

public class Principal2 {
	public static void main(String[] args) {
		//criando uma lista duplamente encadeada vazia
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		//adicionando elementos no início da lista
		lista.adicionarNoInicio(10);
		lista.adicionarNoInicio(20);
		lista.adicionarNoInicio(30);
		
		//adicionando elementos no final da lista
		lista.adicionarNoFinal(40);
		lista.adicionarNoFinal(50);
		
		//adicionando um elemento depois de outro
		Nodo2 nodo = lista.getPrimeiro().getProximo().getProximo();
		lista.adicionarDepois(nodo, 35);
		
		//removendo um elemento da lista
		Nodo2 nodoRemovido = lista.getPrimeiro().getProximo();
		lista.removerNodo(nodoRemovido);
		
		//imprimindo a lista
		Nodo2 nodoAtual = lista.getPrimeiro();
		while(nodoAtual != null) {
			System.out.println(nodoAtual.getDado());
			nodoAtual = nodoAtual.getProximo();
		}
	}
}

package aula_13_exercicio;

public class ListaCircular {
	private NoC cursor;
	
	public ListaCircular() {
		this.cursor = null;
	}
	
	public void adicionar(String valor) {
		NoC novoNo = new NoC(valor);
		
		if(cursor == null) {
			novoNo.proximo = novoNo; // O primeiro na lista aponta para si mesmo
			cursor = novoNo;
		} else {
			novoNo.proximo = cursor.proximo; // O novo nó aponta para o segundo nó na lista
			cursor.proximo = novoNo; // O primeiro nó aponta para o novo nó
			cursor = novoNo; // O novo nó se torna o primeiro nó
		}
	}
	
	public void remover(String valor) {
		if(cursor == null) {
			return; // Lista vazia, não há nada para remover
		}
		NoC atual = cursor;
		while(atual.proximo != cursor) {
			if(atual.proximo.valor.equals(valor)) {
				atual.proximo = atual.proximo.proximo; // Remove o nó apontado pelo próximo nó
				break;
			}
			atual = atual.proximo;
		}
		if(cursor.valor.equals(valor)) {
			atual.proximo = atual.proximo.proximo;
			cursor = atual; // Atualiza o primeiro nó se o nó removido for o primeiro
		}
	}
	
	public void imprimir() {
		if(cursor == null) {
			System.out.println("Lista vazia");
			return;
		}
		NoC atual = cursor.proximo;
		System.out.println(cursor.valor+" -> ");
		while(atual != cursor) {
			System.out.println(atual.valor + " -> ");
			atual = atual.proximo;
		}
		System.out.println();
	}
}

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
			novoNo.proximo = cursor.proximo; // O novo n� aponta para o segundo n� na lista
			cursor.proximo = novoNo; // O primeiro n� aponta para o novo n�
			cursor = novoNo; // O novo n� se torna o primeiro n�
		}
	}
	
	public void remover(String valor) {
		if(cursor == null) {
			return; // Lista vazia, n�o h� nada para remover
		}
		NoC atual = cursor;
		while(atual.proximo != cursor) {
			if(atual.proximo.valor.equals(valor)) {
				atual.proximo = atual.proximo.proximo; // Remove o n� apontado pelo pr�ximo n�
				break;
			}
			atual = atual.proximo;
		}
		if(cursor.valor.equals(valor)) {
			atual.proximo = atual.proximo.proximo;
			cursor = atual; // Atualiza o primeiro n� se o n� removido for o primeiro
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

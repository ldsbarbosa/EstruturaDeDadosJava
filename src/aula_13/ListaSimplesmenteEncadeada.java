package aula_13;

public class ListaSimplesmenteEncadeada {
	private NoS primeiro;
	private NoS ultimo;
	public ListaSimplesmenteEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
	}
	public void adicionar(int valor) {
		NoS novoNo = new NoS(valor);
		
		if(primeiro == null) {
			primeiro = novoNo;
			ultimo = novoNo;
		} else {
			ultimo.proximo = novoNo;
			ultimo = novoNo;
		}
	}
	public void imprimir() {
		NoS atual = primeiro;
		while(atual != null) {
			System.out.println(atual.valor);
			atual = atual.proximo;
		}
	}
}

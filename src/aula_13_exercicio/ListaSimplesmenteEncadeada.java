package aula_13_exercicio;

public class ListaSimplesmenteEncadeada {
	private NoS primeiro;
	private NoS ultimo;
	public ListaSimplesmenteEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
	}
	public void adicionar(String valor) {
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

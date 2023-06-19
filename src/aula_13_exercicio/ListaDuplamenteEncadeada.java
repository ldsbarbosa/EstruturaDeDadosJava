package aula_13_exercicio;

public class ListaDuplamenteEncadeada {
	private NoD primeiro;
	private NoD ultimo;
	public ListaDuplamenteEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
	}
	public void adicionar(String valor) {
		NoD novoNo = new NoD(valor);
		
		if(primeiro == null) {
			primeiro = novoNo;
			ultimo = novoNo;
		} else {
			ultimo.proximo = novoNo;
			novoNo.anterior = ultimo;
			ultimo = novoNo;
		}
	}
	
	public void remover(String valor) {
		NoD atual = primeiro;
		
		while(atual != null) {
			if(atual.valor.equals(valor)) {
				NoD anterior = atual.anterior;
				NoD proximo = atual.proximo;
				
				if(anterior != null) {
					anterior.proximo = proximo;
				} else {
					primeiro = proximo;
				}
				
				if(proximo != null) {
					proximo.anterior = proximo;
				} else {
					ultimo = proximo;
				}
				break;
			}
			atual = atual.proximo;
		}
	}
	
	public void imprimir() {
		NoD atual = primeiro;
		while(atual != null) {
			System.out.println(atual.valor);
			atual = atual.proximo;
		}
	}
}

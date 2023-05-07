package lista_livro;

public class ListaSimplesmenteEncadeada {
	Nodo primeiro, ultimo; // head(cabeça) e tail(cauda)
	
	public Nodo getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Nodo primeiro) {
		this.primeiro = primeiro;
	}

	public Nodo getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo ultimo) {
		this.ultimo = ultimo;
	}
	
	public int medirTamanho() {
		if(this.getPrimeiro() == null) {
			return 0;
		}else {
			int tamanho = 1;
			Nodo nodo = this.getPrimeiro();
			while(nodo.getProximo() != null) {
				tamanho++;
				nodo = nodo.getProximo();
			}
			return tamanho;
		}
	}

	public void adicionarNoInicio(float valor) {
		Nodo novoNodo = new Nodo(valor,this.getPrimeiro());
//		novoNodo.setDado(valor);
//		novoNodo.setProximo(this.getPrimeiro());
		this.setPrimeiro(novoNodo);
	}
	
	public void adicionarNoFinal(float valor) {
		Nodo novoNodo = new Nodo();
		novoNodo.setDado(valor);
		if(this.getPrimeiro() == null) {
			this.setPrimeiro(novoNodo);
		}else {
			Nodo nodoFinal = this.getPrimeiro();
			while(nodoFinal.getProximo() != null) { // Não há indexação. É necessário percorrer a lista.
				nodoFinal = nodoFinal.getProximo();
			}
			nodoFinal.setProximo(novoNodo);
		}
	}
	
	public void removerPrimeiroNodo() {
		if(this.getPrimeiro() != null) { // Tratar a exceção de apontar para nulo, caso da lista estar vazia
			Nodo nodoRemover = this.getPrimeiro();
			this.setPrimeiro(nodoRemover.getProximo());
		} else {
			System.out.println("A lista está vazia.");
		}
	}
}

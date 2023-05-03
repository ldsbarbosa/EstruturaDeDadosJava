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

	public void adicionarNoInicio(float valor) {
		Nodo novoNodo = new Nodo();
		novoNodo.setDado(valor);
		novoNodo.setProximo(this.getPrimeiro());
		this.setPrimeiro(novoNodo);
	}
	
	public void adicionarNoFinal(float valor) {
		Nodo novoNodo = new Nodo();
		novoNodo.setDado(valor);
		if(this.getPrimeiro() == null) {
			this.setPrimeiro(novoNodo);
		}else {
			Nodo nodoFinal = this.getPrimeiro();
			while(nodoFinal.getProximo() != null) {
				nodoFinal = nodoFinal.getProximo();
			}
			nodoFinal.setProximo(novoNodo);
		}
	}
	
	public void removerPrimeiroNodo() {
		if(this.getPrimeiro() != null) {
			Nodo nodoRemover = this.getPrimeiro();
			this.setPrimeiro(nodoRemover.getProximo());
		}
	}
}

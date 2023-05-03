package lista_livro;

public class ListaDuplamenteEncadeada {

	Nodo2 primeiro, ultimo; // head(cabeça) e tail(cauda)
	
	public Nodo2 getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Nodo2 primeiro) {
		this.primeiro = primeiro;
	}

	public Nodo2 getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo2 ultimo) {
		this.ultimo = ultimo;
	}
	
	public void adicionarNoInicio(float valor) {
	    Nodo2 novoNodo = new Nodo2();
	    novoNodo.setDado(valor);
	    novoNodo.setProximo(this.getPrimeiro());
	    if (this.getPrimeiro() != null) {
	        this.getPrimeiro().setAnterior(novoNodo);
	    }
	    this.setPrimeiro(novoNodo);
	}

	public void adicionarNoFinal(float valor) {
	    Nodo2 novoNodo = new Nodo2();
	    novoNodo.setDado(valor);
	    if(this.getPrimeiro() == null) {
	        this.setPrimeiro(novoNodo);
	    } else {
	        Nodo2 nodoFinal = this.getPrimeiro();
	        while(nodoFinal.getProximo() != null) {
	            nodoFinal = nodoFinal.getProximo();
	        }
	        nodoFinal.setProximo(novoNodo);
	        novoNodo.setAnterior(nodoFinal);
	    }
	}
	
	public void adicionarDepois(Nodo2 nodo, float valor) {
		Nodo2 nodoPosterior = nodo.getProximo();
		Nodo2 novoNodo = new Nodo2();
		novoNodo.setDado(valor);
		novoNodo.setProximo(nodoPosterior);
		novoNodo.setAnterior(nodo);
		
		nodo.setProximo(novoNodo);
		if(nodoPosterior != null) {
			nodoPosterior.setAnterior(novoNodo);
		}
	}
	
	public void removerNodo(Nodo2 nodo) {
	    if (this.getPrimeiro() == null) {
	        return; // lista vazia
	    }

	    if (this.getPrimeiro() == nodo) {
	        this.setPrimeiro(nodo.getProximo());
	        if (nodo.getProximo() != null) {
	            nodo.getProximo().setAnterior(null);
	        } else {
	            this.setUltimo(null);
	        }
	        return;
	    }

	    Nodo2 anterior = nodo.getAnterior();
	    Nodo2 proximo = nodo.getProximo();
	    if(anterior != null) {
	    	anterior.setProximo(proximo);
	    }
	    if (proximo != null) {
	        proximo.setAnterior(anterior);
	    } else {
	        this.setUltimo(anterior);
	    }
	}

}

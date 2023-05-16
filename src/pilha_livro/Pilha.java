package pilha_livro;

public class Pilha {
	private Integer[] elementos;
	private int quantidadeDeElementos = 0;
	public void tamanho(int valor) {
		elementos = new Integer[valor];
	}
	public void empilhar(int valor) {
		int ultimoElemento = 0;
		for(Integer elemento : elementos) {
			if(elemento != null) {
				ultimoElemento++;
			}
		}
		elementos[ultimoElemento] = valor;
		this.quantidadeDeElementos++;
	}
	public void desempilhar() {
		int cont = 0;
		elementos[this.quantidadeDeElementos - 1] = null;
		Integer[] aux = new Integer[elementos.length];
		for(Integer elemento : elementos) {
			if(elemento != null) {
				aux[cont] = elemento;
				cont++;
			}
		}
		elementos = aux;
		this.quantidadeDeElementos--;
	}
	public void imprimir() {
		String pilha = "[";
		for(int i = (elementos.length - 1); i >= 0; i--){
			Integer elemento = elementos[i];
			if(elemento != null) {
				pilha += elemento;
				pilha += ", ";
			}
		}
		if(pilha.length() > 2) {
			pilha = pilha.substring(0, pilha.lastIndexOf(", "));
		}
		pilha += "]";
		System.out.print(pilha);
	}
}

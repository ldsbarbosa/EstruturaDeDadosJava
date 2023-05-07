package arvore_binaria_livro;

public class ArvoreBinaria implements Arvore {
	private NodoArvore raiz;

	public ArvoreBinaria() {
		this.raiz = null;
	}

	@Override
	public NodoArvore pesquisa(int valor) {
		NodoArvore nodoResultado = pesquisaRecursivo(raiz, valor);
		return nodoResultado;
	}

	private NodoArvore pesquisaRecursivo(NodoArvore raiz, int valor) {
		if (raiz != null) {
			if (valor == raiz.getChave()) {
				return raiz;
			} else if (valor < raiz.getChave()) {
				return pesquisaRecursivo(raiz.getFilhoEsquerda(), valor);
			} else {
				return pesquisaRecursivo(raiz.getFilhoDireita(), valor);
			}
		}
		return null;
	}

	@Override
	public void inserir(int valor) {
		if (raiz == null) {
			raiz = new NodoArvore(valor);
		} else {
			insere(raiz, valor);
		}
	}

	private void insere(NodoArvore raiz, int valor) {
		if (valor < raiz.getChave()) {
			if (raiz.getFilhoEsquerda() == null) {
				NodoArvore novoNodo = new NodoArvore(valor);
				raiz.setFilhoEsquerda(novoNodo);
			} else {
				insere(raiz.getFilhoEsquerda(), valor);
			}
		} else if (valor > raiz.getChave()) {
			if (raiz.getFilhoDireita() == null) {
				NodoArvore novoNodo = new NodoArvore(valor);
				raiz.setFilhoDireita(novoNodo);
			} else {
				insere(raiz.getFilhoDireita(), valor);
			}
		}
	}

	@Override
	public void remover(int valor) {
		NodoArvore nodo = pesquisa(valor);
		if (nodo == null) {
			System.out.println("O valor " + valor + " não está na árvore.");
		} else if (nodo.getFilhoEsquerda() == null && nodo.getFilhoDireita() == null) {
			removeFolha(nodo);
		} else if (nodo.getFilhoEsquerda() != null && nodo.getFilhoDireita() != null) {
			removeDoisFilhos(nodo);
		} else {
			removeUmFilho(nodo);
		}
	}

	private NodoArvore buscaPai(NodoArvore raiz, int valor) {
		if (raiz != null) {
			if (valor < raiz.getChave()) {
				if (raiz.getFilhoEsquerda() != null && raiz.getFilhoEsquerda().getChave() == valor) {
					return raiz;
				} else {
					return buscaPai(raiz.getFilhoEsquerda(), valor);
				}
			} else if (valor > raiz.getChave()) {
				if (raiz.getFilhoDireita() != null && raiz.getFilhoDireita().getChave() == valor) {
					return raiz;
				} else {
					return buscaPai(raiz.getFilhoDireita(), valor);
				}
			}
		}
		return null;
	}

	private void removeFolha(NodoArvore nodo) {
		NodoArvore pai = buscaPai(this.raiz, nodo.getChave());
		if (pai == null) {
			this.raiz = null;
		} else if (pai.getFilhoEsquerda() != null && pai.getFilhoEsquerda() == nodo) {
			pai.setFilhoEsquerda(null);
		} else {
			pai.setFilhoDireita(null);
		}
	}

	private void removeUmFilho(NodoArvore nodo) {
		NodoArvore pai = buscaPai(this.raiz, nodo.getChave());
		if (pai == null) {
		}
	}

	private NodoArvore max(NodoArvore raiz) {
		if (raiz.getFilhoDireita() == null) {
			return raiz;
		} else {
			return max(raiz.getFilhoDireita());
		}
	}

	private void removeDoisFilhos(NodoArvore nodo) {
		NodoArvore pai = buscaPai(this.raiz, nodo.getChave());
		NodoArvore max = max(nodo.getFilhoEsquerda());
		NodoArvore paiMax = buscaPai(nodo, max.getChave());
		nodo.setChave(max.getChave());
		if (max.getFilhoEsquerda() == null) {
			if (paiMax == nodo) {
				paiMax.setFilhoEsquerda(null);
			} else {
				paiMax.setFilhoDireita(null);
			}
		} else {
			paiMax.setFilhoDireita(max.getFilhoEsquerda());
		}
	}

	@Override
	public void imprime_preFixado() {
		preFixado(this.raiz);
	}

	private void preFixado(NodoArvore raiz) {
		if (raiz == null)
			return;
		System.out.print(raiz.getChave() + " ");
		preFixado(raiz.getFilhoEsquerda());
		preFixado(raiz.getFilhoDireita());
	}
}
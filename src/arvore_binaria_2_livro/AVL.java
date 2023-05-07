package arvore_binaria_2_livro;

public class AVL {
	Nodo2 raiz;

	int altura(Nodo2 no) {
		if (no == null)
			return 0;
		return no.altura;
	}

	int obterFatorBalanceamento(Nodo2 no) {
		if (no == null)
			return 0;
		return altura(no.esq) - altura(no.dir);
	}

	void atualizarAltura(Nodo2 no) {
		no.altura = 1 + Math.max(altura(no.esq), altura(no.dir));
	}

	Nodo2 nodoMaisAEsq(Nodo2 Nodo) {
		Nodo2 atual = Nodo;
		while (atual.esq != null) {
			atual = atual.esq;
		}
		return atual;
	}

	Nodo2 rotacionarADir(Nodo2 y) {
		Nodo2 x = y.esq;
		Nodo2 z = x.dir;
		x.dir = y;
		y.esq = z;
		atualizarAltura(x);
		atualizarAltura(y);
		return x;
	}

	Nodo2 rotacionarAEsq(Nodo2 x) {
		Nodo2 y = x.dir;
		Nodo2 z = y.esq;
		y.esq = x;
		x.dir = z;
		atualizarAltura(x);
		atualizarAltura(y);
		return y;
	}

	Nodo2 rebalancear(Nodo2 z) {
		atualizarAltura(z);
		int fator = obterFatorBalanceamento(z);
		if (fator > 1) {
			if (altura(z.dir.dir) > altura(z.dir.esq)) {
				z = rotacionarAEsq(z);
			} else {
				z.dir = rotacionarADir(z.dir);
				z = rotacionarAEsq(z);
			}
		} else if (fator < -1) {
			if (altura(z.esq.esq) > altura(z.esq.dir))
				z = rotacionarADir(z);
			else {
				z.esq = rotacionarAEsq(z.esq);
				z = rotacionarADir(z);
			}
		}
		return z;
	}

	Nodo2 insert(Nodo2 Nodo, int valor) {
		if (Nodo == null) {
			return new Nodo2(valor);
		} else if (Nodo.valor > valor) {
			Nodo.esq = insert(Nodo.esq, valor);
		} else if (Nodo.valor < valor) {
			Nodo.dir = insert(Nodo.dir, valor);
		} else {
			throw new RuntimeException("Duplicidade!");
		}
		return rebalancear(Nodo);
	}

	Nodo2 delete(Nodo2 Nodo, int valor) {
		if (Nodo == null) {
			return Nodo;
		} else if (Nodo.valor > valor) {
			Nodo.esq = delete(Nodo.esq, valor);
		} else if (Nodo.valor < valor) {
			Nodo.dir = delete(Nodo.dir, valor);
		} else {
			if (Nodo.esq == null || Nodo.dir == null) {
				Nodo = (Nodo.esq == null) ? Nodo.dir : Nodo.esq;
			} else {
				Nodo2 nodoMaisAEsq = nodoMaisAEsq(Nodo.dir);
				Nodo.valor = nodoMaisAEsq.valor;
				Nodo.dir = delete(Nodo.dir, Nodo.valor);
			}
		}
		if (Nodo != null) {
			Nodo = rebalancear(Nodo);
		}
		return Nodo;
	}

}

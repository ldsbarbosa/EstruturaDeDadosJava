package arvore_binaria_2_livro;

public class DSW {
	private ABP arvore;

	public DSW(ABP arvore) {
		if (arvore != null && arvore.raiz != null) {
			this.arvore = arvore;
			criarEspinhaDorsal();
			criarABPBalanceada();
		}
	}

	private void criarEspinhaDorsal() {
		Nodo avo = null;
		Nodo pai = this.arvore.raiz;
		Nodo filhoAEsq;
		while (pai != null) {
			filhoAEsq = pai.esq;
			if (filhoAEsq != null) {
				avo = rotacionarADir(avo, pai, filhoAEsq);
				pai = filhoAEsq;
			} else {
				avo = pai;
				pai = pai.dir;
			}
		}
	}

	private void criarABPBalanceada() {
		int n = 0;
		for (Nodo tmp = this.arvore.raiz; null != tmp; tmp = tmp.dir, ++n)
			;
		int h = (int) (Math.log(n + 1) / Math.log(2));
		int m = (int) Math.pow(2, h) - 1;
		realizarRotacoes(n - m);
		while (m > 1)
			realizarRotacoes(m /= 2);
	}

	private void realizarRotacoes(int numRotacoes) {
		Nodo avo = null;
		Nodo pai = this.arvore.raiz;
		Nodo filho = this.arvore.raiz.dir;
		for (; numRotacoes > 0 && filho != null; --numRotacoes) {
			rotacionarAEsq(avo, pai, filho);
			avo = filho;
			pai = avo.dir;
			filho = pai.dir;
		}
	}

	private Nodo rotacionarADir(Nodo avo, Nodo pai, Nodo filhoAEsq) {
		if (avo != null) {
			avo.dir = filhoAEsq;
		} else {
			this.arvore.raiz = filhoAEsq;
		}
		pai.esq = filhoAEsq.dir;
		filhoAEsq.dir = pai;
		return avo;
	}

	private void rotacionarAEsq(Nodo avo, Nodo pai, Nodo filhoADir) {
		if (avo != null) {
			avo.dir = filhoADir;
		} else {
			this.arvore.raiz = filhoADir;
		}
		pai.dir = filhoADir.esq;
		filhoADir.esq = pai;
	}
}

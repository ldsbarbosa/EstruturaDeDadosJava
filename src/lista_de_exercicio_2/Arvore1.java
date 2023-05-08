// Implemente um algoritmo para contar o n�mero de folhas em uma �rvore bin�ria.

package lista_de_exercicio_2;

class NodoArvore {
    int valor;
    NodoArvore filhoEsquerda;
    NodoArvore filhoDireita;

    public NodoArvore(int valor) {
        this.valor = valor;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }
}

public class Arvore1 {
    NodoArvore raiz;

    public Arvore1() {
        this.raiz = null;
    }

    // M�todo para contar o n�mero de folhas na �rvore
    public int contarFolhas() {
        return contarFolhasRecursivo(raiz);
    }

    // M�todo auxiliar recursivo para contar as folhas na �rvore
    private int contarFolhasRecursivo(NodoArvore nodo) {
        if (nodo == null)
            return 0;

        if (nodo.filhoEsquerda == null && nodo.filhoDireita == null)
            return 1;

        int folhasEsquerda = contarFolhasRecursivo(nodo.filhoEsquerda);
        int folhasDireita = contarFolhasRecursivo(nodo.filhoDireita);

        return folhasEsquerda + folhasDireita;
    }

    public static void main(String[] args) {
        // Criando a �rvore
        Arvore1 arvore = new Arvore1();
        arvore.raiz = new NodoArvore(1);
        arvore.raiz.filhoEsquerda = new NodoArvore(2);
        arvore.raiz.filhoDireita = new NodoArvore(3);
        arvore.raiz.filhoEsquerda.filhoEsquerda = new NodoArvore(4);
        arvore.raiz.filhoEsquerda.filhoDireita = new NodoArvore(5);
        arvore.raiz.filhoDireita.filhoEsquerda = new NodoArvore(6);
        arvore.raiz.filhoDireita.filhoDireita = new NodoArvore(7);

        // Contando o n�mero de folhas na �rvore
        int numeroFolhas = arvore.contarFolhas();
        System.out.println("N�mero de folhas na �rvore: " + numeroFolhas);
    }
}

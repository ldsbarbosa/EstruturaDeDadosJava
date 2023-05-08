// Escreva uma função para verificar se duas árvores binárias são idênticas.
package lista_de_exercicio_2;

class NodoArvore2 {
    int valor;
    NodoArvore2 filhoEsquerda;
    NodoArvore2 filhoDireita;

    public NodoArvore2(int valor) {
        this.valor = valor;
        this.filhoEsquerda = null;
        this.filhoDireita = null;
    }
}

public class Arvore2 {
    NodoArvore2 raiz1;
    NodoArvore2 raiz2;

    public Arvore2() {
        this.raiz1 = null;
        this.raiz2 = null;
    }

    // Método para verificar se duas árvores são idênticas
    public boolean saoIdenticas(Arvore2 arvore2) {
        return saoIdenticasRecursivo(this.raiz1, arvore2.raiz2);
    }

    // Método auxiliar recursivo para verificar a identidade das árvores
    private boolean saoIdenticasRecursivo(NodoArvore2 nodo1, NodoArvore2 nodo2) {
        // Se ambos os nós forem nulos, são idênticos
        if (nodo1 == null && nodo2 == null)
            return true;

        // Se um dos nós for nulo, não são idênticos
        if (nodo1 == null || nodo2 == null)
            return false;

        // Verifica se os valores dos nós são iguais
        if (nodo1.valor != nodo2.valor)
            return false;

        // Verifica a identidade dos filhos esquerdos e direitos recursivamente
        boolean filhosEsquerdaIdenticos = saoIdenticasRecursivo(nodo1.filhoEsquerda, nodo2.filhoEsquerda);
        boolean filhosDireitaIdenticos = saoIdenticasRecursivo(nodo1.filhoDireita, nodo2.filhoDireita);

        // Retorna true se todos os nós e filhos forem idênticos
        return filhosEsquerdaIdenticos && filhosDireitaIdenticos;
    }

    public static void main(String[] args) {
        // Criando a primeira árvore
        Arvore2 arvore1 = new Arvore2();
        arvore1.raiz1 = new NodoArvore2(1);
        arvore1.raiz1.filhoEsquerda = new NodoArvore2(2);
        arvore1.raiz1.filhoDireita = new NodoArvore2(3);
        arvore1.raiz1.filhoEsquerda.filhoEsquerda = new NodoArvore2(4);
        arvore1.raiz1.filhoEsquerda.filhoDireita = new NodoArvore2(5);

        // Criando a segunda árvore
        Arvore2 arvore2 = new Arvore2();
        arvore2.raiz2 = new NodoArvore2(1);
        arvore2.raiz2.filhoEsquerda = new NodoArvore2(2);
        arvore2.raiz2.filhoDireita = new NodoArvore2(3);
        arvore2.raiz2.filhoEsquerda.filhoEsquerda = new NodoArvore2(4);
        arvore2.raiz2.filhoEsquerda.filhoDireita = new NodoArvore2(5);

        // Verificando se as árvores são idênticas
        boolean saoIdenticas = arvore1.saoIdenticas(arvore2);

        // Exibindo o resultado
        if (saoIdenticas)
            System.out.println("As árvores são idênticas.");
        else
            System.out.println("As árvores não são idênticas.");
    }
}



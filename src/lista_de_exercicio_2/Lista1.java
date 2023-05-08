// Implemente uma lista encadeada reversa, ou seja,
// a ordem dos elementos deve ser invertida em relação à lista original.
package lista_de_exercicio_2;

public class Lista1 {
    static class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static class ListaEncadeadaReversa {
        private No cabeca;

        public void adicionar(int valor) {
            No novoNo = new No(valor);
            if (cabeca == null) {
                cabeca = novoNo;
            } else {
                novoNo.proximo = cabeca;
                cabeca = novoNo;
            }
        }

        public void imprimir() {
            No noAtual = cabeca;
            while (noAtual != null) {
                System.out.print(noAtual.valor + " ");
                noAtual = noAtual.proximo;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListaEncadeadaReversa lista = new ListaEncadeadaReversa();

        // Adicione elementos à lista
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionar(5);

        System.out.println("Lista original:");
        lista.imprimir();

        System.out.println("Lista reversa:");
        // Imprime a lista na ordem reversa
        imprimirListaReversa(lista.cabeca);
    }

    private static void imprimirListaReversa(No no) {
        if (no == null) {
            return;
        }
        imprimirListaReversa(no.proximo);
        System.out.print(no.valor + " ");
    }
}

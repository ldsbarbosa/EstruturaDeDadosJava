// Escreva uma função que verifique se uma lista está ordenada em ordem crescente.
package lista_de_exercicio_2;

public class Lista2 {
    static class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    static class ListaOrdenada {
        private No cabeca;

        public void adicionar(int valor) {
            No novoNo = new No(valor);
            if (cabeca == null) {
                cabeca = novoNo;
            } else if (valor < cabeca.valor) {
                novoNo.proximo = cabeca;
                cabeca = novoNo;
            } else {
                No noAtual = cabeca;
                while (noAtual.proximo != null && valor > noAtual.proximo.valor) {
                    noAtual = noAtual.proximo;
                }
                novoNo.proximo = noAtual.proximo;
                noAtual.proximo = novoNo;
            }
        }

        public boolean estaOrdenada() {
            No noAtual = cabeca;
            while (noAtual != null && noAtual.proximo != null) {
                if (noAtual.valor > noAtual.proximo.valor) {
                    return false;
                }
                noAtual = noAtual.proximo;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ListaOrdenada lista = new ListaOrdenada();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionar(5);

        System.out.println("A lista está ordenada? " + lista.estaOrdenada());

        lista.adicionar(2);
        System.out.println("A lista está ordenada? " + lista.estaOrdenada());
    }
}


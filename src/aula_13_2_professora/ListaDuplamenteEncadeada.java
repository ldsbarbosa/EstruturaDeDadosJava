package aula_13_2_professora;

public class ListaDuplamenteEncadeada {
    private No primeiro;
    private No ultimo;

    public ListaDuplamenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adicionar(int valor) {
        No novoNo = new No(valor);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            ultimo = novoNo;
        }
    }

    public void remover(int valor) {
        No atual = primeiro;

        while (atual != null) {
            if (atual.valor == valor) {
                No anterior = atual.anterior;
                No proximo = atual.proximo;

                if (anterior != null) {
                    anterior.proximo = proximo;
                } else {
                    primeiro = proximo;
                }

                if (proximo != null) {
                    proximo.anterior = anterior;
                } else {
                    ultimo = anterior;
                }

                break;
            }

            atual = atual.proximo;
        }
    }

    public void imprimir() {
        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}

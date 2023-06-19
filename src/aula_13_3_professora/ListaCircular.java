package aula_13_3_professora;

public class ListaCircular {
    private No primeiro;

    public ListaCircular() {
        this.primeiro = null;
    }

    public void adicionar(int valor) {
        No novoNo = new No(valor);

        if (primeiro == null) {
            novoNo.proximo = novoNo; // O primeiro n� na lista aponta para si mesmo
            primeiro = novoNo;
        } else {
            novoNo.proximo = primeiro.proximo; // O novo n� aponta para o segundo n� na lista, ou para onde o primeiro n� aponta
            primeiro.proximo = novoNo; // O primeiro n� aponta para o novo n�
            primeiro = novoNo; // O novo n� se torna o primeiro n�
        }
    }

    public void remover(int valor) {
        if (primeiro == null) {
            return; // Lista vazia, n�o h� nada para remover
        }

        No atual = primeiro;
        while (atual.proximo != primeiro) {
            if (atual.proximo.valor == valor) {
                atual.proximo = atual.proximo.proximo; // Remove o n� apontado pelo pr�ximo n� atual
                break;
            }
            atual = atual.proximo;
        }
        if (primeiro.valor == valor) {
            primeiro = atual; // Atualiza o primeiro n� se o n� removido for o primeiro
        }
    }

    public void imprimir() {
        if (primeiro == null) {
            System.out.println("Lista vazia");
            return;
        }

        System.out.print(primeiro.valor + " -> ");
        
        No atual = primeiro.proximo;
        while (atual != primeiro) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

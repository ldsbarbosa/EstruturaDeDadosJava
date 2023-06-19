package aula_13_3_professora;

public class ListaCircular {
    private No primeiro;

    public ListaCircular() {
        this.primeiro = null;
    }

    public void adicionar(int valor) {
        No novoNo = new No(valor);

        if (primeiro == null) {
            novoNo.proximo = novoNo; // O primeiro nó na lista aponta para si mesmo
            primeiro = novoNo;
        } else {
            novoNo.proximo = primeiro.proximo; // O novo nó aponta para o segundo nó na lista, ou para onde o primeiro nó aponta
            primeiro.proximo = novoNo; // O primeiro nó aponta para o novo nó
            primeiro = novoNo; // O novo nó se torna o primeiro nó
        }
    }

    public void remover(int valor) {
        if (primeiro == null) {
            return; // Lista vazia, não há nada para remover
        }

        No atual = primeiro;
        while (atual.proximo != primeiro) {
            if (atual.proximo.valor == valor) {
                atual.proximo = atual.proximo.proximo; // Remove o nó apontado pelo próximo nó atual
                break;
            }
            atual = atual.proximo;
        }
        if (primeiro.valor == valor) {
            primeiro = atual; // Atualiza o primeiro nó se o nó removido for o primeiro
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

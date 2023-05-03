package lista_livro;

public class ListaCircular {
    Nodo3 cursor; // head(cabeça) e tail(cauda)

    public void proximo() {
        if (cursor != null) {
            cursor = cursor.getProximo();
        }
    }

    public Nodo3 getCursor() {
        return cursor;
    }

    public void inserir(float valor) {
        Nodo3 nodo = new Nodo3();
        nodo.setDado(valor);
        if (this.cursor == null) {
            this.cursor = nodo;
            this.cursor.setProximo(this.cursor);
        } else {
            Nodo3 proximo = cursor.getProximo();
            cursor.setProximo(nodo);
            nodo.setProximo(proximo);
        }
    }

    public void excluir() {
        if (cursor == null) {
            return;
        } else if (cursor == cursor.getProximo()) {
            cursor = null;
        } else {
            Nodo3 nodoExcluir = cursor.getProximo();
            cursor.setProximo(nodoExcluir.getProximo());
        }
    }
}


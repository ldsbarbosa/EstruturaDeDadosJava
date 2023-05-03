package lista_livro;

public class Principal3 {

    public static void main(String[] args) {

        ListaCircular lista = new ListaCircular();

        System.out.println("Inserindo elementos");
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        System.out.println("Cursor: " + lista.getCursor().getDado());

        System.out.println("Percorrendo a lista");
        Nodo3 nodoAtual = lista.getCursor();
        do {
            System.out.println("Nodo: " + nodoAtual.getDado());
            nodoAtual = nodoAtual.getProximo();
        } while (nodoAtual != lista.getCursor());


        System.out.println("Excluindo elementos");
        lista.excluir();
        System.out.println("Cursor: " + lista.getCursor().getDado());

        System.out.println("Percorrendo a lista após excluir elementos");
        nodoAtual = lista.getCursor();
        do {
            System.out.println("Nodo: " + nodoAtual.getDado());
            nodoAtual = nodoAtual.getProximo();
        } while (nodoAtual != lista.getCursor());
    }
}

package lista_livro;

public class Principal1 {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        
        // Adicionando elementos no início da lista
        lista.adicionarNoInicio(3.5f);
        lista.adicionarNoInicio(2.0f);
        lista.adicionarNoInicio(1.5f);
        System.out.println("Lista após adicionar elementos no início:");
        imprimirLista(lista);
        
        // Adicionando elementos no final da lista
        lista.adicionarNoFinal(4.5f);
        lista.adicionarNoFinal(5.0f);
        lista.adicionarNoFinal(6.0f);
        System.out.println("Lista após adicionar elementos no final:");
        imprimirLista(lista);
        
        // Removendo o primeiro elemento da lista
        lista.removerPrimeiroNodo();
        System.out.println("Lista após remover o primeiro elemento:");
        imprimirLista(lista);
    }
    
    private static void imprimirLista(ListaSimplesmenteEncadeada lista) {
        Nodo nodoAtual = lista.getPrimeiro();
        while(nodoAtual != null) {
            System.out.print(nodoAtual.getDado() + " ");
            nodoAtual = nodoAtual.getProximo();
        }
        System.out.println();
    }
}

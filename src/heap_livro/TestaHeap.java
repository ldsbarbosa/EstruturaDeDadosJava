package heap_livro;

public class TestaHeap {
    public static void main(String[] args) {
        HeapMaximo heap = new HeapMaximo(10);

        heap.inserir(4);
        heap.inserir(8);
        heap.inserir(2);
        heap.inserir(10);
        heap.inserir(6);

        System.out.println("Heap inicial:");
        heap.imprimirHeap();

        int maximo = heap.getMaximo();
        System.out.println("M�ximo do heap: " + maximo);

        heap.removerMaximo();
        System.out.println("Heap ap�s remo��o do m�ximo:");
        heap.imprimirHeap();
    }
}

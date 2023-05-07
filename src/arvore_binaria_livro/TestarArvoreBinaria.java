package arvore_binaria_livro;

import javax.swing.JOptionPane;

public class TestarArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo valores na �rvore
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(2);
        arvore.inserir(4);
        arvore.inserir(6);
        arvore.inserir(8);

        // Pesquisando valores na �rvore
        int valorPesquisado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para pesquisar:"));
        NodoArvore nodoEncontrado = arvore.pesquisa(valorPesquisado);
        if (nodoEncontrado != null) {
            System.out.println("Valor encontrado na �rvore: " + nodoEncontrado.getChave());
        } else {
            System.out.println("Valor n�o encontrado na �rvore.");
        }

        // Removendo valores da �rvore
        int valorRemovido = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para remover:"));
        arvore.remover(valorRemovido);
        System.out.println("�rvore ap�s a remo��o:");
        arvore.imprime_preFixado();
    }
}


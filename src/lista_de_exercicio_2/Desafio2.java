// Implemente uma árvore de busca binária balanceada (AVL Tree)
// e escreva funções para inserir e remover elementos.
package lista_de_exercicio_2;

class No {
    int valor;
    No esquerda;
    No direita;
    int altura;

    public No(int valor) {
        this.valor = valor;
        this.altura = 1;
    }
}

public class Desafio2 {
    private No raiz;

    // Retorna a altura de um nó
    private int altura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }

    // Retorna o fator de balanceamento de um nó
    private int fatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return altura(no.esquerda) - altura(no.direita);
    }

    // Atualiza a altura de um nó
    private void atualizarAltura(No no) {
        int alturaEsquerda = altura(no.esquerda);
        int alturaDireita = altura(no.direita);
        no.altura = Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    // Realiza uma rotação simples para a direita
    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        atualizarAltura(y);
        atualizarAltura(x);

        return x;
    }

    // Realiza uma rotação simples para a esquerda
    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        atualizarAltura(x);
        atualizarAltura(y);

        return y;
    }

    // Insere um elemento na árvore
    public void inserir(int valor) {
        raiz = inserirNo(raiz, valor);
    }

    // Função auxiliar para inserir um nó na árvore
    private No inserirNo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirNo(no.direita, valor);
        } else {
            return no; // Não permitir valores duplicados
        }

        atualizarAltura(no);

        int balanceamento = fatorBalanceamento(no);

        // Realizar as rotações necessárias para balancear a árvore
        if (balanceamento > 1 && valor < no.esquerda.valor) {
            return rotacaoDireita(no);
        }

        if (balanceamento < -1 && valor > no.direita.valor) {
            return rotacaoEsquerda(no);
        }

        if (balanceamento > 1 && valor > no.esquerda.valor) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (balanceamento < -1 && valor < no.direita.valor) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    // Remove um elemento da árvore
    public void remover(int valor) {
        raiz = removerNo(raiz, valor);
    }

    // Função auxiliar para remover um nó da árvore
    private No removerNo(No no, int valor) {
        if (no == null) {
            return no;
        }

        if (valor < no.valor) {
            no.esquerda = removerNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = removerNo(no.direita, valor);
        } else {
            // Nó a ser removido encontrado

            // Caso 1: Nó é uma folha ou possui apenas um filho
            if (no.esquerda == null || no.direita == null) {
                No filho = (no.esquerda != null) ? no.esquerda : no.direita;

                // Caso 1.1: Nó não possui filhos
                if (filho == null) {
                    no = null;
                } else { // Caso 1.2: Nó possui um filho
                    no = filho;
                }
            } else { // Caso 2: Nó possui dois filhos
                No sucessor = encontrarSucessor(no.direita);
                no.valor = sucessor.valor;
                no.direita = removerNo(no.direita, sucessor.valor);
            }
        }

        // Se o nó foi removido, retorna null
        if (no == null) {
            return null;
        }

        atualizarAltura(no);

        int balanceamento = fatorBalanceamento(no);

        // Realizar as rotações necessárias para balancear a árvore
        if (balanceamento > 1 && fatorBalanceamento(no.esquerda) >= 0) {
            return rotacaoDireita(no);
        }

        if (balanceamento > 1 && fatorBalanceamento(no.esquerda) < 0) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (balanceamento < -1 && fatorBalanceamento(no.direita) <= 0) {
            return rotacaoEsquerda(no);
        }

        if (balanceamento < -1 && fatorBalanceamento(no.direita) > 0) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    // Encontra o nó sucessor para a remoção
    private No encontrarSucessor(No no) {
        No atual = no;
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }

    // Exibe os elementos da árvore em ordem
    public void exibirEmOrdem() {
        exibirEmOrdem(raiz);
    }

    // Função auxiliar para exibir os elementos da árvore em ordem
    private void exibirEmOrdem(No no) {
        if (no != null) {
            exibirEmOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            exibirEmOrdem(no.direita);
        }
    }

    // Exibe os elementos da árvore em pré-ordem
    public void exibirPreOrdem() {
        exibirPreOrdem(raiz);
    }

    // Função auxiliar para exibir os elementos da árvore em pré-ordem
    private void exibirPreOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            exibirPreOrdem(no.esquerda);
            exibirPreOrdem(no.direita);
        }
    }

    // Exibe os elementos da árvore em pós-ordem
    public void exibirPosOrdem() {
        exibirPosOrdem(raiz);
    }

    // Função auxiliar para exibir os elementos da árvore em pós-ordem
    private void exibirPosOrdem(No no) {
        if (no != null) {
            exibirPosOrdem(no.esquerda);
            exibirPosOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public static void main(String[] args) {
        Desafio2 avlTree = new Desafio2();
        avlTree.inserir(10);
        avlTree.inserir(20);
        avlTree.inserir(30);
        avlTree.inserir(40);
        avlTree.inserir(50);
        avlTree.inserir(25);

        System.out.println("Árvore em Ordem:");
        avlTree.exibirEmOrdem();
        System.out.println();

        System.out.println("Árvore em Pré-Ordem:");
        avlTree.exibirPreOrdem();
        System.out.println();

        System.out.println("Árvore em Pós-Ordem:");
        avlTree.exibirPosOrdem();
        System.out.println();

        avlTree.remover(30);

        System.out.println("Árvore em Ordem após remover o valor 30:");
        avlTree.exibirEmOrdem();
        System.out.println();
    }
}



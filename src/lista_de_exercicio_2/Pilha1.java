// Implemente uma pilha que mantenha o menor elemento em tempo constante.
package lista_de_exercicio_2;

import java.util.Stack;

public class Pilha1 {
    private Stack<Integer> pilha;
    private Stack<Integer> menorElemento;

    public Pilha1() {
        pilha = new Stack<>();
        menorElemento = new Stack<>();
    }

    public void push(int valor) {
        pilha.push(valor);
        if (menorElemento.isEmpty() || valor <= menorElemento.peek()) {
            menorElemento.push(valor);
        }
    }

    public int pop() {
        int valor = pilha.pop();
        if (valor == menorElemento.peek()) {
            menorElemento.pop();
        }
        return valor;
    }

    public int getMenorElemento() {
        return menorElemento.peek();
    }

    public static void main(String[] args) {
        Pilha1 pilha = new Pilha1();

        pilha.push(4);
        pilha.push(2);
        pilha.push(6);
        pilha.push(1);

        System.out.println("Menor elemento da pilha: " + pilha.getMenorElemento());

        pilha.pop();
        pilha.pop();

        System.out.println("Menor elemento da pilha: " + pilha.getMenorElemento());
    }
}


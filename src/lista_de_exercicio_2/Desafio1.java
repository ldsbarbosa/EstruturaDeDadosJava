// Implemente uma estrutura de dados chamada "Deque" (Double-Ended Queue),
// que permite inser��es e remo��es em ambas as extremidades em tempo constante.
package lista_de_exercicio_2;

import java.util.EmptyStackException;

public class Desafio1<T> {
    private Node<T> front; // Refer�ncia para o in�cio do deque
    private Node<T> rear; // Refer�ncia para o final do deque
    private int size; // Tamanho do deque

    // Construtor
    public Desafio1() {
        front = null;
        rear = null;
        size = 0;
    }

    // Verifica se o deque est� vazio
    public boolean isEmpty() {
        return size == 0;
    }

    // Retorna o tamanho do deque
    public int size() {
        return size;
    }

    // Insere um elemento no in�cio do deque
    public void insertFront(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    // Insere um elemento no final do deque
    public void insertRear(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    // Remove e retorna o elemento do in�cio do deque
    public T removeFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T removedElement = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return removedElement;
    }

    // Remove e retorna o elemento do final do deque
    public T removeRear() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T removedElement = rear.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return removedElement;
    }

    // Retorna o elemento do in�cio do deque
    public T getFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return front.data;
    }

    // Retorna o elemento do final do deque
    public T getRear() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return rear.data;
    }

    // Classe interna que representa um n� do deque
    private static class Node<T> {
        private T data; // Dado do n�
        private Node<T> prev; // Refer�ncia para o n� anterior
        private Node<T> next; // Refer�ncia para o pr�ximo n�

        // Construtor
        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Desafio1<Integer> deque = new Desafio1<>();

        deque.insertFront(2);
        deque.insertFront(4);
        deque.insertRear(6);
        deque.insertRear(8);

        System.out.println("Tamanho do deque: " + deque.size());
        System.out.println("Elemento do in�cio do deque: " + deque.getFront());
        System.out.println("Elemento do final do deque: " + deque.getRear());

        System.out.println("Removendo elemento do in�cio do deque: " + deque.removeFront());
        System.out.println("Removendo elemento do final do deque: " + deque.removeRear());

        System.out.println("Tamanho do deque ap�s remo��es: " + deque.size());
        System.out.println("Elemento do in�cio do deque ap�s remo��es: " + deque.getFront());
        System.out.println("Elemento do final do deque ap�s remo��es: " + deque.getRear());
    }
}


// Escreva um programa para verificar se uma sequência de operações de enfileirar
// e desenfileirar em uma fila pode ser convertida em outra sequência utilizando
// apenas as operações de desenfileirar e enfileirar.

package lista_de_exercicio_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Fila2 {
    public static boolean verificarSequencia(Queue<Integer> sequencia1, Queue<Integer> sequencia2) {
        Stack<Integer> auxiliar = new Stack<>();
        while (!sequencia1.isEmpty()) {
            int elemento = sequencia1.poll();
            if (elemento == sequencia2.peek()) {
                sequencia2.poll();
                while (!auxiliar.isEmpty()) {
                    if (auxiliar.pop() == sequencia2.peek()) {
                        sequencia2.poll();
                    } else {
                        break;
                    }
                }
            } else {
                auxiliar.push(elemento);
            }
        }
        return sequencia2.isEmpty();
    }

    public static void main(String[] args) {
        Queue<Integer> sequencia1 = new LinkedList<>();
        Queue<Integer> sequencia2 = new LinkedList<>();
        Random aleatorio = new Random();
        int tamanhoTotal = 2 + aleatorio.nextInt(3); // Mínimo 2, máximo 4
        
        for(int i = 0; i < tamanhoTotal; i++) {
        	sequencia1.offer(aleatorio.nextInt(5)); // 0 até 4
            sequencia2.offer(aleatorio.nextInt(5));
        }
        System.out.println("Sequencia(Fila) 1: "+sequencia1);
        System.out.println("Sequencia(Fila) 2: "+sequencia2);
        boolean resultado = verificarSequencia(sequencia1, sequencia2);
        System.out.println("As sequências são equivalentes? " + resultado);
    }
}

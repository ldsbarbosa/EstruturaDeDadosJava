/*
 *  8- Escreva um programa para verificar se uma sequ�ncia de opera��es de push e pop em uma pilha
 * pode ser convertida em outra sequ�ncia utilizando apenas as opera��es de swap (troca) e pop.
 * As opera��es de swap permitem trocar os dois elementos no topo da pilha.
 * A fun��o deve retornar verdadeiro se a convers�o for poss�vel, e falso caso contr�rio.
 */
package aula_11;

import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] operacoes1 = {1, 2, 3, 4, 5};
        int[] operacoes2 = {2, 1, 5, 4, 3};
        System.out.println(podeConverter(operacoes1, operacoes2)? "Pode!": "N�o foi poss�vel.");
    }

    public static boolean podeConverter(int[] operacoes1, int[] operacoes2) {
        Stack<Integer> pilha = new Stack<>();
        int i = 0;
        for (int operacao : operacoes1) {
            pilha.push(operacao);
            while (!pilha.empty() && pilha.peek() == operacoes2[i]) {
                pilha.pop();
                i++;
            }
        }
        return pilha.empty();
    }
}


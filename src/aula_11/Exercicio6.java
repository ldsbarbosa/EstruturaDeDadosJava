/*
 * 6- Escreva um programa para encontrar o maior retângulo em um histograma de barras.
 * O histograma é representado por um array de inteiros, onde cada valor representa a altura de uma barra.
 * Utilize uma pilha para manter uma lista de posições crescentes das barras.
 */
package aula_11;

import java.util.Stack;

public class Exercicio6 {

    public static void main(String[] args) {
        int[] histograma = {2, 1, 5, 6, 2};
        int areaMaxima = encontrarMaiorRetangulo(histograma);
        System.out.println("A área máxima do retângulo no histograma é: " + areaMaxima);
    }

    public static int encontrarMaiorRetangulo(int[] histograma) {
        Stack<Integer> stack = new Stack<Integer>();
        int areaMaxima = 0;
        int i = 0;
        while (i < histograma.length) {
            if (stack.isEmpty() || histograma[i] >= histograma[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int altura = histograma[stack.pop()];
                int largura = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = altura * largura;
                if (area > areaMaxima) {
                    areaMaxima = area;
                }
            }
        }
        while (!stack.isEmpty()) {
            int altura = histograma[stack.pop()];
            int largura = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area = altura * largura;
            if (area > areaMaxima) {
                areaMaxima = area;
            }
        }
        return areaMaxima;
    }
}



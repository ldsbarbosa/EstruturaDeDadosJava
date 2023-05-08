// Escreva um programa para verificar se uma sequência de parênteses (abertos e fechados) está balanceada utilizando uma pilha.
package lista_de_exercicio_2;

import java.util.Stack;

public class Pilha2 {
    public static boolean verificaBalanceamento(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                if (pilha.isEmpty() || pilha.pop() != '(') {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String expressao1 = "((()))"; // Balanceada
        String expressao2 = "((())";  // Não balanceada
        String expressao3 = "()()()"; // Balanceada

        System.out.println("Expressão 1 está balanceada? " + verificaBalanceamento(expressao1));
        System.out.println("Expressão 2 está balanceada? " + verificaBalanceamento(expressao2));
        System.out.println("Expressão 3 está balanceada? " + verificaBalanceamento(expressao3));
    }
}


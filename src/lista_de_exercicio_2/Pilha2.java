// Escreva um programa para verificar se uma sequ�ncia de par�nteses (abertos e fechados) est� balanceada utilizando uma pilha.
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
        String expressao2 = "((())";  // N�o balanceada
        String expressao3 = "()()()"; // Balanceada

        System.out.println("Express�o 1 est� balanceada? " + verificaBalanceamento(expressao1));
        System.out.println("Express�o 2 est� balanceada? " + verificaBalanceamento(expressao2));
        System.out.println("Express�o 3 est� balanceada? " + verificaBalanceamento(expressao3));
    }
}


/*
 * 4- Implemente um algoritmo para avaliar express�es aritm�ticas em nota��o polonesa reversa
 * (tamb�m conhecida como nota��o p�s-fixa), utilizando uma pilha.
 * A express�o � fornecida como uma lista de tokens (n�meros e operadores aritm�ticos).
 * 
 * Nota��o Polonesa Inversa: https://pt.wikipedia.org/wiki/Nota%C3%A7%C3%A3o_polonesa_inversa
 */
package aula_11;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int quantidadeDeElementos = 0;
        ArrayList<String> elementos = new ArrayList<>();
        try {
            //Sugest�o: 5 elementos; Elementos: {"2", "1", "+", "3", "*"}
            quantidadeDeElementos = Integer.parseInt(JOptionPane.showInputDialog(
            		"Quantos elementos deseja adicionar � nota��o polonesa inversa?"));
            for (int i = 0; i < quantidadeDeElementos; i++) {
                String elemento = JOptionPane.showInputDialog("Escreva o elemento[+(i+1)+] que quer adicionar."
                		+ "N�meros ou operadores b�sicos.");
                elementos.add(elemento);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        String[] tokens = new String[quantidadeDeElementos];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = elementos.get(i);
        }
        JOptionPane.showMessageDialog(null, "Resultado da avalia��o da nota��o polonesa inversa: " + avaliarNPI(tokens));
    }

    public static int avaliarNPI(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

/**
	Criar uma classe java chamada Cliente
	A classe Cliente deverá conter os atributos: CPF e nome do tipo String
	Criar o metodo construtor que receba os parâmetros CPF e nome
	Criar o método toString() que retorne a String contendo nome e CPF do cliente 
	Criar uma fila de clientes.
	Criar uma pilha de clientes
	Adicionar 5 clientes na fila
	Imprimir a fila.
	Remover os clientes da fila e adicionar na pilha.
	Imprimir a pilha
	Verifique se a fila está vazia.
 */

package aula_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio1 {
	public static void main(String[] args) {
		Queue<Cliente> filaDeClientes = new LinkedList<Cliente>();
		Stack<Cliente> pilhaDeClientes = new Stack<Cliente>();
		Cliente clienteAtual;
		Scanner leitor = null;
		Integer tamanhoDaFila;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Quantos clientes deseja enfileirar?");
			tamanhoDaFila = leitor.nextInt();
			while(tamanhoDaFila.intValue() < 0) {
				System.out.println("Digite um valor maior do que zero.");
				tamanhoDaFila = leitor.nextInt();
			}
			for(int i = 0; i < tamanhoDaFila.intValue(); i++) {
				String nome,cpf;
				System.out.println("Qual o nome do cliente?");
				nome = leitor.next();
				if(nome.length() < 3 || nome.length() < 20) {
					System.out.println("Nome muito pequeno ou muito grande. Insira novamente.");
					nome = leitor.next();
				}
				System.out.println("Qual o CPF do cliente? Inclui pontos e traço");
				cpf = leitor.next();
				if(cpf.length() != 14) {
					System.out.println("Um CPF tem 14 caracteres. Insira novamente.");
					cpf = leitor.next();
				}
				filaDeClientes.offer(new Cliente(nome, cpf)); // Tambem pode ser add()
			}
			while(!filaDeClientes.isEmpty()) {
				clienteAtual = filaDeClientes.poll(); // Tambem pode ser remove()
				System.out.println(clienteAtual);
				pilhaDeClientes.push(clienteAtual);
			}
			while(!pilhaDeClientes.empty()) {
				clienteAtual = pilhaDeClientes.pop(); // Tambem pode ser remove()
				System.out.println(clienteAtual);
			}
			System.out.println("A fila está vazia?\n"+(filaDeClientes.isEmpty() ? "Sim, a fila está vazia" : "A fila possui elementos."));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

package pilha_livro;

import java.util.Stack;

public class Exemplo2 {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		System.out.println("Tamanho da pilha............:"+pilha.size());
		System.out.println("Pilha vazia no come�o............:"+pilha.empty());
		pilha.push("Casa");					pilha.push("Cinema");
		pilha.push("Oficina Mec�nica");		pilha.push("Zool�gico");
		pilha.push("Museu");				pilha.push("Parque");
		pilha.push("Sorveteria");
		System.out.println("Status atual da pilha............:"+pilha);
		System.out.println("Posi��o do elemento 'Museu'............:"+pilha.search("Museu"));
		System.out.println("Elemento no topo............:"+pilha.peek());
		System.out.println("Status atual da pilha............:"+pilha);
		pilha.pop();
		pilha.pop();
		System.out.println("Status atual da pilha............:"+pilha);
		System.out.println("Posi��o do elemento 'Sorveteria'..:"+pilha.search("Sorveteria"));
		System.out.println("Pilha vazia no final............:"+pilha.empty());
		System.out.println("Tamanho da pilha............:"+pilha.size());
		System.out.println("Status final da pilha............:"+pilha);
	}
}

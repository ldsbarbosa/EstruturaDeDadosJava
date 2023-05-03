/* P�gina 83 */
package pilha_livro;

import java.util.Stack;

public class Exemplo1 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		System.out.println("Inicio do passeio............:"+pilha);
		pilha.push("Casa");
		pilha.push("Cinema");
		pilha.push("Oficina Mec�nica");
		System.out.println("Local onde deixou a carteira: "+ pilha);
		pilha.push("Zool�gico");
		pilha.push("Museu");
		pilha.push("Parque");
		pilha.push("Sorveteria");
		System.out.println("Fim do passeio..................:"+pilha);
		System.out.println("--------------------------------------------");
		System.out.println("In�cio do caminho inverso.......:"+pilha);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Local onde deixou a carteira: "+pilha);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Fim do caminho inverso........:"+pilha);
	}
}

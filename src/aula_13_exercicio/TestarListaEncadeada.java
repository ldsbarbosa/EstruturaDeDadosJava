/*
 * - Criar lista encadeada de nomes 
 * - Adicionar 5 nomes na lista encadeada
 * - Imprima a lista encadeada
 * 
 * Gerador de nomes aleatorios: https://pt.fakenamegenerator.com/gen-random-br-br.php
 */
package aula_13_exercicio;

public class TestarListaEncadeada {
	public static void main(String[] args) {
		ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
		lista.adicionar("");
		lista.adicionar("");
		lista.adicionar("");
		lista.adicionar("");
		lista.adicionar("");
		lista.imprimir();
	}
}

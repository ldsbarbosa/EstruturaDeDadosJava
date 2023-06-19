/*
 * - Criar lista circular de nomes
 * - Adicionar 5 nomes na lista circular
 * - Percorrer a lista circular imprimindo os 5nomes
 * - Remover o primeiro nome que foi inclu�do
 * - Percorrer a lista circular imprimindo os 4 nomes
 * 
 * Gerador de nomes aleatorios: https://pt.fakenamegenerator.com/gen-random-br-br.php
 */
package aula_13_exercicio;

public class TestarListaCircular {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		lista.adicionar("Jos�");
		lista.adicionar("Jonas");
		lista.adicionar("Alberto");
		System.out.println("Lista original:");
		lista.imprimir();
		lista.remover("Alberto");
		System.out.println("Lista ap�s remover 20:");
		lista.imprimir();
	}
}

/*
 * - Criar lista duplamente encadeada de nomes
 * - Adicionar 5 nomes na lista duplamente encadeada
 * - Imprima a lista duplamente encadeada
 * - Remover o ultimo nome adicionado
 * - Imprima a lista duplamente encadeada apos remover o elemento
 * 
 * Gerador de nomes aleatorios: https://pt.fakenamegenerator.com/gen-random-br-br.php
 */
package aula_13_exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarListaDuplaEncadeada {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		String decisao = "";
		ArrayList<String> decisoesPossiveis = new ArrayList<>();
		decisoesPossiveis.add("Inicio");
		decisoesPossiveis.add("Meio");
		decisoesPossiveis.add("Final");
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			lista.adicionar("");
			lista.adicionar("");
			lista.adicionar("");
			lista.adicionar("");
			lista.adicionar("");
			System.out.println("Você deseja remover no Inicio, no Meio ou no Final?");
			decisao = leitor.next();
			while(!decisoesPossiveis.contains(decisao)) {
				System.out.println("Insira \'Inicio\', \'Meio\' ou \'Final\'");
				decisao = leitor.next();
			}
			switch(decisao){
				case "Inicio":
					lista.remover("");
					break;
				case "Meio":
					lista.remover("");
					lista.remover("");
					break;
				case "Final":
					lista.remover("");
					break;
			}
			lista.imprimir();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			leitor.close();
		}
	}
}

package aula_13;

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
			lista.adicionar(1);
			lista.adicionar(2);
			lista.adicionar(3);
			lista.adicionar(4);
			lista.adicionar(5);
			System.out.println("Você deseja remover no Inicio, no Meio ou no Final?");
			decisao = leitor.next();
			while(!decisoesPossiveis.contains(decisao)) {
				System.out.println("Insira \'Inicio\', \'Meio\' ou \'Final\'");
				decisao = leitor.next();
			}
			switch(decisao){
				case "Inicio":
					lista.remover(1);
					break;
				case "Meio":
					lista.remover(2);
					lista.remover(4);
					break;
				case "Final":
					lista.remover(5);
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

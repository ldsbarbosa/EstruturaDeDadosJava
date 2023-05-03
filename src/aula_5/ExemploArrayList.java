package aula_5;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		//Adicionando elementos ao ArrayList
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Preto");
		
		//Acessando elemtnos do ArrayList
		System.out.println("\nO segundo elemento do ArrayList"+ cores.get(1));
		
		//Iterando sobre os elementos do ArrayList
		System.out.println("Elementos do ArrayList: ");
		for(String cor : cores) {
			System.out.print(cor+" ");
		}
		
		//Removendo elementos do ArrayList
		cores.remove("Verde");
		System.out.println("\n\nElementos do ArrayList após remoção");
		for(String cor: cores) {
			System.out.print(cor+" ");
		}
		
		//Removendo elementos do ArrayList (por indice)
		cores.remove(1);
		System.out.println("\n\nElementos do ArrayList após remoção por indice");
		for(String cor: cores) {
			System.out.print(cor+" ");
		}
		
		
		//Mais cor
		cores.add("Violeta");
		cores.add("Cinza");
		System.out.println("\n\nAdicionando cores");
		for(String cor: cores) {
			System.out.print(cor+" ");
		}
		
		//Ordenando
		Collections.sort(cores);
		System.out.println("\n\nElementos do ArrayList após ordenação via Collections.sort()");
		for(String cor: cores) {
			System.out.print(cor+" ");
		}
		
		System.out.println("\n\nOutra forma de exibição de dados");
		// outra forma de escrever o for para listar elementos do array
		for(int i = 0; i < cores.size(); i++) {
			System.out.print(cores.get(i)+" ");
		}
	}

}

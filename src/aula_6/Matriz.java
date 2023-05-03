package aula_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> numeros = new ArrayList<ArrayList<Integer>>();
		Random aleatorio = new Random();
		int numeroMaiorQueDez = 0, linhas = 1, colunas = 1;
		ArrayList<Integer> arrayAtual;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Insira o número de linhas desejadas");
			linhas = leitor.nextInt();
			System.out.println("Insira o número de colunas desejadas");
			colunas = leitor.nextInt();
			for(int i = 0; i < linhas; i++) {
				arrayAtual = new ArrayList<Integer>();
				numeros.add(arrayAtual);
				for(int j = 0; j < colunas; j++) {
					numeroMaiorQueDez = aleatorio.nextInt(100);
					while(numeroMaiorQueDez < 10) {
						numeroMaiorQueDez = aleatorio.nextInt(100);
					}
					arrayAtual.add(Integer.valueOf(numeroMaiorQueDez));
				}
			}
			int contador = 1;
			for(ArrayList<Integer> array : numeros) {
				if (contador % 2 == 0) {
					Collections.sort(array, new Comparator<Integer>() {
					    @Override
					    public int compare(Integer o1, Integer o2) {
					        return o1.compareTo(o2);
					    }
					});
				}else {
					Collections.shuffle(array);
				}
				for(Integer numero : array) {
					System.out.print("Numero ["+numeros.indexOf(array)+"]["+array.indexOf(numero)+"]:");
					System.out.print(numero.intValue()+"\t\t");
				}
				System.out.println();
				contador++;
			}
		}finally {
			leitor.close();
		}
	}
}

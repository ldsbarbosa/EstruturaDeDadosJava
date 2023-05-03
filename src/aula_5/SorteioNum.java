package aula_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SorteioNum {

	public static void main(String[] args) {
		ArrayList<Integer> listaDeInteiros = new ArrayList<>();
		Random aleatorio = new Random();
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			int qtdNumero, numeroAdicionado = 0;
			
			System.out.println("Quantos números deseja sortear? Não pode ser maior do que 100");
			qtdNumero = leitor.nextInt();
			
			for(int i = 0; i < qtdNumero;i++) {
				numeroAdicionado = aleatorio.nextInt(100);
				while(listaDeInteiros.indexOf(numeroAdicionado) != -1) {
					numeroAdicionado = aleatorio.nextInt(100);
				} 
				listaDeInteiros.add(Integer.valueOf(numeroAdicionado));
			}
			Collections.sort(listaDeInteiros);
			for(Integer inteiros : listaDeInteiros) {
				System.out.println("Número ["+(listaDeInteiros.indexOf(inteiros)+1) +"]:\t"+inteiros.intValue());
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
		
	}

}

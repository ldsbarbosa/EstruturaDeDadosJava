package aula_11;

import java.util.Random;
import java.util.Stack;

public class PilhaNumeros {
	private Stack<Integer> pilhaDeNumerosPar = new Stack<Integer>();
	private Stack<Integer> pilhaDeNumerosImpar = new Stack<Integer>();
	
	public Stack<Integer> getPilhaDeNumerosPar() {
		return pilhaDeNumerosPar;
	}
	public Stack<Integer> getPilhaDeNumerosImpar() {
		return pilhaDeNumerosImpar;
	}
	
	public void gerarOsNumeros() {
		Random aleatorio = new Random();
		Integer numeroGerado;
		final int qtdNumerosGerar = 10;
		for (int i = 1; i <= qtdNumerosGerar; i++) {
			numeroGerado = Integer.valueOf(aleatorio.nextInt(101));
			if(numeroGerado % 2 == 0) {
				pilhaDeNumerosPar.push(numeroGerado);
			}else {
				pilhaDeNumerosImpar.push(numeroGerado);
			}
		}
	}
	
	public void desempilharEImprimir() {
		System.out.println("Pilha de números pares de tamanho {"+pilhaDeNumerosPar.size()+"}");
		int contador = 1;
		while(!pilhaDeNumerosPar.empty()) {
			System.out.println("Numero ["+contador+"] = "+pilhaDeNumerosPar.pop().toString());
			contador++;
		}
		
		System.out.println("##########\nPilha de números ímpares de tamanho {"+pilhaDeNumerosImpar.size()+"}");
		contador = 1;
		while(!pilhaDeNumerosImpar.empty()) {
			System.out.println("Numero ["+contador+"] = "+pilhaDeNumerosImpar.pop().toString());
			contador++;
		}
	}
	
}

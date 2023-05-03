/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 */
package aula_2;

public class Exercicio2 {
	public static void main(String[] args) {
		String[] dias = {"Dom","Seg","Ter","Qua","Qui","Sex","Sáb"};
		System.out.println("Dias na semana");
		for(int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		System.out.println("\n\nDias na semana inverso");
		for(int i = dias.length - 1; i >= 0; i--) {
			System.out.println(dias[i]);
		}
	}
}

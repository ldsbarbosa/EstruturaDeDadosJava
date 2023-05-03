package lista_de_exercicio_1;

import java.util.Random;

public class Exercicio_6_1 {
	public int geradorDeNumerosPrimos() {
		Random geradorAleatorio = new Random();
		int numeroPrimo = geradorAleatorio.nextInt(1000);
		
		for(int denominador = numeroPrimo - 1; denominador > 1; denominador--) {
			if(numeroPrimo % denominador == 0) {
				numeroPrimo = geradorAleatorio.nextInt(1001);
				denominador = numeroPrimo - 1;
			}
		}
		return numeroPrimo;
	}
}

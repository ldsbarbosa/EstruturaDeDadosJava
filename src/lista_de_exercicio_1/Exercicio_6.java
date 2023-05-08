/**
 * 6.	Gerar N números inteiros aleatórios de 0 a 1000 e armazene num vetor de 10 posições, de forma que seja colocado no vetor, apenas aqueles números primos.
 * 		(preencher todo o vetor)
 */
package lista_de_exercicio_1;

public class Exercicio_6 {
	public static void main(String[] args) {
		int[] numerosPrimos = new int[10];
		Exercicio_6_1 geradorDeNumeroPrimo = new Exercicio_6_1();
		
		for(int i = 0; i < 10; i++) {
			numerosPrimos[i] = geradorDeNumeroPrimo.geradorDeNumerosPrimos();
			System.out.print(numerosPrimos[i]+"\t");
			if((i+1) % 5 == 0) {
				System.out.print("\n");
			}
		}
	}
}

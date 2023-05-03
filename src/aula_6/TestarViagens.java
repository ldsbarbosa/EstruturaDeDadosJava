package aula_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestarViagens {

	public static void main(String[] args) {
		List<Viagem> listaDeViagens = new ArrayList<>();
		Scanner leitor = null;
		final int TAMANHO_DO_VETOR_DE_VIAGENS = 5;
		int qtdeDias, qtdePes;
		double preco;
		String dest;
		try {
			System.out.println("Cadastro de viagens!");
			System.out.println("Entre com os dados requisitados!");
			leitor = new Scanner(System.in);
			for(int i = 0; i < TAMANHO_DO_VETOR_DE_VIAGENS;i++) {
				System.out.println("Viagem ["+(i+1)+"]");
				System.out.println("Qual o destino da viagem?");
				dest = leitor.next();
				System.out.println("Quantas pessoas embarcar�o?");
				qtdePes = leitor.nextInt();
				System.out.println("Por quantos dias permanecer�o no local?");
				qtdeDias = leitor.nextInt();
				System.out.println("Qual o valor unit�rio da viagem?\nOu seja, se fosse s� uma pessoa e por s� um dia");
				preco = leitor.nextDouble();
				listaDeViagens.add(new Viagem((i+1), dest, qtdeDias, preco, qtdePes));
			}
			
			// Impress�o daquilo que foi inserido pelo usu�rio
			for(Viagem viagem : listaDeViagens) {
				viagem.imprimirDados();
			}
			
			// Impress�o daquilo que foi inserido pelo usu�rio, com exce��o do objeto na posi��o 1 em rela��o ao vetor
			// O vetor conta a partir do 0
			System.out.println("\n########\nImpress�o sem a segunda viagem!\n########\n");
			int cont = 0;
			for(Viagem viagem : listaDeViagens) {
				if(cont == 1) {
					listaDeViagens.remove(viagem);
					break;
				}else {
					cont++;
				}
			}
			Collections.sort(listaDeViagens);
			for(Viagem viagem : listaDeViagens) {
				viagem.imprimirDados();				
			}
			
		}finally {
			leitor.close();
		}
		
	}

}

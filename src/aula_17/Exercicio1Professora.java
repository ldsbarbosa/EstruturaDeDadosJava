package aula_17;

public class Exercicio1Professora {
	
	public static void main(String[] args) {
		
		int matriz[][] = {{0,-4,220},{-42,60,58},{7,0,0},{78,30,27}};
		
		for(int linha = 0; linha < matriz.length; linha++) { // ou i < 4
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {  // ou j < 3
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.print("\n");
		}
		
	}
	
}

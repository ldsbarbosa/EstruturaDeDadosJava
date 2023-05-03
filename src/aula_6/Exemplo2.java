package aula_6;

public class Exemplo2 {

	public static void main(String[] args) {
		int m[][] = new int[6][6];
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				m[i][j] = i + j;
				System.out.print(m[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}

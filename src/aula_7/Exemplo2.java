package aula_7;

public class Exemplo2 {
	public static void main(String[] args) {
		int m[][] = new int[6][6];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = j == m[i].length - (i + 1) ? 1 : 0;
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

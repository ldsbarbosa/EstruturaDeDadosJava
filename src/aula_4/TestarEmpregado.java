package aula_4;

import java.util.Scanner;

public class TestarEmpregado {

	public static void main(String[] args) {
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			// Estrutura de Dados do tipo - Vetor(array) de Empregados
			
			System.out.println("Quantos empregados deseja cadastrar?");
			int qtdEmpregados = leitor.nextInt();
			Empregado[] empregados = new Empregado[qtdEmpregados];
			
			//Estrutura de Repetição para entrada de dados
			int matricula;
			String nome;
			double salarioBruto;
			for(int i = 0; i < empregados.length; i++) {
				System.out.println("Digite a matrícula do empregado "+(i+1)+".");
				matricula = leitor.nextInt();
				System.out.println("Digite o nome do empregado "+(i+1)+".");
				nome = leitor.next();				
				System.out.println("Digite o salário bruto do empregado "+(i+1)+".");
				salarioBruto = leitor.nextDouble();
				empregados[i] = new Empregado(matricula, nome, salarioBruto);
			}
			
			//Estrutura de Repetição para saída de dados
			for(int i = 0; i < empregados.length; i++) {
				empregados[i].calcularINSS();
				empregados[i].calcularImposto();
				empregados[i].calcularSalarioLiquido();
				empregados[i].imprimirDados();
			}
		}catch(Exception e) {
			System.out.println("Terá de refazer a operação.\nExcecao:\n"+e.toString());
		}finally {
			leitor.close();
		}

	}

}

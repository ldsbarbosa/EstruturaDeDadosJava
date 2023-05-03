package aula_3;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			// Estrutura de Dados do tipo - Vetor(array) de Conta
			System.out.println("Quantas contas deseja cadastrar?\n");
			int qtdContas = leitor.nextInt();
			Conta[] contas = new Conta[qtdContas];
			
			//Estrutura de Repeti��o para entrada de dados
			String numConta, nome;
			double saldo;
			for(int i = 0; i < contas.length; i++) {
				System.out.println("Digite o nome do cliente\n");
				nome = leitor.next();
				System.out.println("Digite o n�mero da conta\n");
				numConta = leitor.next();
				System.out.println("Digite o saldo da conta\n");
				saldo = leitor.nextDouble();
				contas[i] = new Conta(nome, numConta, saldo);
			}
			
			//Estrutura de Repeti��o para deposito e saque
			boolean mudancaDeSaldo = true;
			int decisao;
			
			for(int i = 0; i < contas.length; i++) {
				System.out.println(contas[i].getNome()+", detendor da conta "+contas[i].getNumConta()+".");
				System.out.println("Voc� deseja mudar seu saldo por meio de saques ou depositos?\nSe sim, digite 1.\nSe n�o, digite 0.");
				decisao = leitor.nextInt();
				if(decisao == 0) {
					mudancaDeSaldo = false;
				}
				while(mudancaDeSaldo) {
					System.out.println("Digite 1 para saque.\nDigite 2 para dep�sito.");
					decisao = leitor.nextInt();
					if(decisao == 1) {
						System.out.println("Digite o valor de seu saque.\nLembre-se, ele n�o pode exceder o valor em conta.");
						contas[i].sacar(leitor.nextDouble());
					}
					if(decisao == 2) {
						System.out.println("Digite o valor de seu deposito.");
						contas[i].depositar(leitor.nextDouble());
					}
					System.out.println("Deseja fazer uma nova opera��o (1)\n Ou deseja finalizar a altera��o do saldo (2)?");
					decisao = leitor.nextInt();
					if(decisao == 2) {
						mudancaDeSaldo = false;
						break;
					}
				}
				mudancaDeSaldo = true;
			}
			//Estrutura de Repeti��o para sa�da de dados
			for(int i = 0; i < contas.length; i++) {
				contas[i].imprimirDados();
			}
		} finally {
			leitor.close();
		}
	}
}

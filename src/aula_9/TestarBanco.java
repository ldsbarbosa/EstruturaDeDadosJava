package aula_9;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarBanco {
	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
		int decisaoSistema = 0, decisaoOperacao = 0;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Sistema de banco.\nCaso deseje realizar alguma opera��o, tecle 1."
					+ "\nCaso n�o, tecle 0");
			decisaoSistema = leitor.nextInt();
			while(decisaoSistema == 1) {
				System.out.println("Opera��o [Adicionar Conta] - Tecle 1\n"
						+ "Opera��o [Buscar Conta] - Tecle 2\n"
						+ "Opera��o [Remover Conta] - Tecle 3\n"
						+ "Opera��o [Listar Conta] - Tecle 4\n");
				decisaoOperacao = leitor.nextInt();
				switch(decisaoOperacao) {
					case 1:
						adicionarConta(listaDeContas, leitor);
						break;
					case 2:
						Conta conta = buscarConta(listaDeContas, leitor);
						if(conta != null) {
							conta.toString();
							System.out.println("Conta achada com sucesso!");
						}else {
							System.out.println("A conta n�o existe, portanto,"
									+ "n�o foi poss�vel acessar seus dados.");
						}
						break;
					case 3:
						removerConta(listaDeContas, leitor);
						break;
					case 4:
						listarConta(listaDeContas);
						break;
					default:
						System.out.println("Escolha uma opera��o v�lida.");
						break;
				}
				System.out.println("\nCaso deseje realizar outra opera��o, tecle 1."
						+ "\nCaso n�o, tecle 0");
				decisaoSistema = leitor.nextInt();
			}
			System.out.println("Voc� saiu do sistema");
		}catch(Exception e) {
			
		}finally {
			leitor.close();
		}
	}
	private static void adicionarConta(ArrayList<Conta> listaDeContas, Scanner leitor) {
		int numero, tamanhoDaLista = listaDeContas.size();
		String titular;
		double saldo;
		//
		System.out.println("Digite o n�mero da conta");
		numero = leitor.nextInt();
		while(numero <= 0) {
			System.out.println("Digite novamente o n�mero da conta");
			numero = leitor.nextInt();
		}
		//
		System.out.println("Digite o nome do titular da conta");
		titular = leitor.next();
		while(titular.equals("")) {
			System.out.println("Digite novamente o nome do titular da conta");
			titular = leitor.next();
		}
		//
		System.out.println("Digite o saldo da conta");
		saldo = leitor.nextDouble();
		while (saldo < 0) {
			System.out.println("Digite o saldo novamente");
			saldo = leitor.nextDouble();
		}
		//
		listaDeContas.add(new Conta(numero,saldo,titular));
		if(tamanhoDaLista != listaDeContas.size()) {
			System.out.println("Conta adicionada com sucesso.");
		}else {
			System.out.println("Erro ao adicionar conta.");
		}
	}
	private static Conta buscarConta(ArrayList<Conta> listaDeContas, Scanner leitor) {
		int numero;
		System.out.println("Digite o n�mero da conta");
		numero = leitor.nextInt();
		for(Conta conta : listaDeContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
	private static void removerConta(ArrayList<Conta> listaDeContas, Scanner leitor) {
		int numero;
		boolean achouConta = false;
		System.out.println("Digite o n�mero da conta");
		numero = leitor.nextInt();
		for(Conta conta : listaDeContas) {
			if(conta.getNumero() == numero) {
				achouConta = !achouConta;
				System.out.println(conta.toString());
				listaDeContas.remove(conta);
				System.out.println("Conta removida com sucesso.");
				break;
			}
		}
		if(!achouConta) {
			System.out.println("A conta n�o existe, portanto, n�o foi removida");
		}
	}
	private static void listarConta(ArrayList<Conta> listaDeContas) {
		if(listaDeContas.size() == 0) {
			System.out.println("N�o h� contas cadastradas");
			return;
		}
		for(Conta conta : listaDeContas) {
			System.out.println(conta.toString());
		}
	}
}

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
			System.out.println("Sistema de banco.\nCaso deseje realizar alguma operação, tecle 1."
					+ "\nCaso não, tecle 0");
			decisaoSistema = leitor.nextInt();
			while(decisaoSistema == 1) {
				System.out.println("Operação [Adicionar Conta] - Tecle 1\n"
						+ "Operação [Buscar Conta] - Tecle 2\n"
						+ "Operação [Remover Conta] - Tecle 3\n"
						+ "Operação [Listar Conta] - Tecle 4\n");
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
							System.out.println("A conta não existe, portanto,"
									+ "não foi possível acessar seus dados.");
						}
						break;
					case 3:
						removerConta(listaDeContas, leitor);
						break;
					case 4:
						listarConta(listaDeContas);
						break;
					default:
						System.out.println("Escolha uma operação válida.");
						break;
				}
				System.out.println("\nCaso deseje realizar outra operação, tecle 1."
						+ "\nCaso não, tecle 0");
				decisaoSistema = leitor.nextInt();
			}
			System.out.println("Você saiu do sistema");
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
		System.out.println("Digite o número da conta");
		numero = leitor.nextInt();
		while(numero <= 0) {
			System.out.println("Digite novamente o número da conta");
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
		System.out.println("Digite o número da conta");
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
		System.out.println("Digite o número da conta");
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
			System.out.println("A conta não existe, portanto, não foi removida");
		}
	}
	private static void listarConta(ArrayList<Conta> listaDeContas) {
		if(listaDeContas.size() == 0) {
			System.out.println("Não há contas cadastradas");
			return;
		}
		for(Conta conta : listaDeContas) {
			System.out.println(conta.toString());
		}
	}
}

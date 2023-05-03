package aula_9_professora;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	ArrayList<Conta> contas = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void adicionarConta() {
		System.out.println("Informe o nome do cliente ");
		String nome = sc.next();
		System.out.println("Informe o numero da conta ");
		int num = sc.nextInt();

		Conta conta = new Conta(num, 0.0, nome);
		contas.add(conta);
	}

	public void buscarConta() {
	}

	public void removerConta() {
		int numContaEncerramento;
		System.out.println("Informe o numero da conta que deseja encerrar ");
		numContaEncerramento = sc.nextInt();
		boolean achou = false;
		for (Conta conta : contas) {
			if (conta.numConta == numContaEncerramento) {
				contas.remove(conta);
				achou = true;
				System.out.println("Conta apagada ");
			}
		}
		if (!achou) {
			System.out.println("Conta não existe");
		}
	}

	public void listarContas() {
		for (Conta conta : contas) {
			System.out.println("Numero da Conta....: " + conta.numConta + "\n" + "Cliente............: " + conta.titular
					+ "\n" + "Saldo..............: " + conta.saldo + "\n");
		}
	}
}

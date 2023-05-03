package aula_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	ArrayList<Conta> contas = new ArrayList<Conta>();
	Scanner sc = new Scanner(System.in);
	
	public void adicionarConta() {
		System.out.println("Informe o nome do cliente");
		String nome = sc.next();
		
		System.out.println("Informe o numero da conta");
		int numero = sc.nextInt();
		
		System.out.println("Informe o saldo da conta");
		double saldo = sc.nextDouble();
		Conta conta = new Conta(numero, saldo, nome);
		contas.add(conta);
	}
	public void buscarConta() {
		int numContaProcurada;
		System.out.println("Informe o numero da conta que deseja exibir");
		numContaProcurada = sc.nextInt();
		boolean achou = false;
		for(Conta conta: contas) {
			if(conta.getNumero() == numContaProcurada) {
				System.out.println(conta.toString());
				achou = true;
				break;
			}
		}
		if(!achou) {
			System.out.println("Não foi possível exibir, pois a conta não existe.");
		}
	}
	public void removerConta() {
		int numContaEncerramento;
		System.out.println("Informe o numero da conta que deseja encerrar");
		numContaEncerramento = sc.nextInt();
		boolean achou = false;
		for(Conta conta: contas) {
			if(conta.getNumero() == numContaEncerramento) {
				contas.remove(conta);
				achou = true;
				System.out.println("A conta foi apagada com sucesso");
				break;
			}
		}
		if(!achou) {
			System.out.println("Não foi possível deletar, pois a conta não existe.");
		}
	}
	public void listarContas(){
		for(Conta conta : contas) {
			System.out.println(conta.toString());
		}
	}
}

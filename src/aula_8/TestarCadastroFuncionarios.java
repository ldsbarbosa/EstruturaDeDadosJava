/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * 
 */
package aula_8;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarCadastroFuncionarios {
	
	public static void main(String[] args) {
		ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
		int permanenciaNoSistema = 1;
		Scanner leitor = null;
		char opcaoOperacoes = 'a';
		System.out.println("Sistema de controle de funcionários\n");
		try {
			System.out.println("Você deseja continuar(1) ou sair do sistema(2)?");
			leitor = new Scanner(System.in);
			permanenciaNoSistema = leitor.nextInt();
			while(permanenciaNoSistema != 1 && permanenciaNoSistema != 2) {
				System.out.println("Digite 1 ou 2.");
			}
			while(permanenciaNoSistema == 1) {
				System.out.println("Você deseja:\nCadastrar funcionário(a)"
						+ "\nRemover funcionário(b)"
						+ "\nBuscar funcionário(c)"
						+ "\nListar funcionário(d)");
				switch(opcaoOperacoes) {
					case 'a':
						cadastrarFuncionario(listaDeFuncionarios);
						break;
					case 'b':
						removerFuncionario(listaDeFuncionarios);
						break;
					case 'c':
						buscarFuncionario(listaDeFuncionarios);
						break;
					case 'd':
						listarFuncionario(listaDeFuncionarios);
						break;
				}
				System.out.println("Você deseja continuar(1) ou sair do sistema(2)?");
				permanenciaNoSistema = leitor.nextInt();
				while(permanenciaNoSistema != 1 && permanenciaNoSistema != 2) {
					System.out.println("Digite 1 ou 2.");
				}
			}
			System.out.println("Você saiu do sistema!");
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
	
	public static void cadastrarFuncionario(ArrayList<Funcionario> listaDeFuncionarios) {
		
		String nomeDoFuncionario = "", cargoDoFuncionario = "";
		int idadeDoFuncionario = 0;
		double salarioDoFuncionario = 0.0;
		
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Qual o nome do funcionário que deve ser cadastrado?");
			nomeDoFuncionario = leitor.next();
			System.out.println("Qual o cargo do funcionário?");
			cargoDoFuncionario = leitor.next();
			System.out.println("Qual o salario do funcionário?");
			salarioDoFuncionario = leitor.nextDouble();
			System.out.println("Qual a idade do funcionário?");
			idadeDoFuncionario = leitor.nextInt();
			if(listaDeFuncionarios.add(new Funcionario(nomeDoFuncionario,
					cargoDoFuncionario,salarioDoFuncionario,idadeDoFuncionario))) {
				System.out.println("Funcionário criado com sucesso!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
	
	public static void removerFuncionario(ArrayList<Funcionario> listaDeFuncionarios) {
		String nomeDoFuncionario = "";
		boolean deletouFuncionario = false;
		
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Qual o nome do funcionário que deve ser removido?");
			nomeDoFuncionario = leitor.next();
			for(Funcionario funcionarioDaLista : listaDeFuncionarios) {
				if(funcionarioDaLista.getNome().equals(nomeDoFuncionario)) {
					deletouFuncionario = listaDeFuncionarios.remove(funcionarioDaLista);
					System.out.println("Funcionário removido com sucesso.");
				}
			}
			if(!deletouFuncionario) {
				System.out.println("Funcionário não encontrado, portanto, não foi removido.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
	
	public static void buscarFuncionario(ArrayList<Funcionario> listaDeFuncionarios) {
		String nomeDoFuncionario = "";
		boolean achouFuncionario = false;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Qual o nome do funcionário que deve ser buscado?");
			nomeDoFuncionario = leitor.next();
			for(Funcionario funcionarioDaLista : listaDeFuncionarios) {
				if(funcionarioDaLista.getNome().equals(nomeDoFuncionario)) {
					System.out.println("Achou o funcionário!");
					achouFuncionario = true;
					funcionarioDaLista.imprimirDados();
				}
			}
			if(!achouFuncionario) {
				System.out.println("Funcionário não encontrado.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
	public static void listarFuncionario(ArrayList<Funcionario> listaDeFuncionarios) {
		if(listaDeFuncionarios.size() >= 0) {
			System.out.println("Lista de funcionários:\n");
			for(Funcionario funcionarioDaLista : listaDeFuncionarios) {
				funcionarioDaLista.imprimirDados();
			}
		}else {
			System.out.println("Não há funcionários cadastrados.");
		}		
	}
}

/**
 * @author Lucas da Silva Barbosa
 * Matr�cula: 202120194
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
		System.out.println("Sistema de controle de funcion�rios\n");
		try {
			System.out.println("Voc� deseja continuar(1) ou sair do sistema(2)?");
			leitor = new Scanner(System.in);
			permanenciaNoSistema = leitor.nextInt();
			while(permanenciaNoSistema != 1 && permanenciaNoSistema != 2) {
				System.out.println("Digite 1 ou 2.");
			}
			while(permanenciaNoSistema == 1) {
				System.out.println("Voc� deseja:\nCadastrar funcion�rio(a)"
						+ "\nRemover funcion�rio(b)"
						+ "\nBuscar funcion�rio(c)"
						+ "\nListar funcion�rio(d)");
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
				System.out.println("Voc� deseja continuar(1) ou sair do sistema(2)?");
				permanenciaNoSistema = leitor.nextInt();
				while(permanenciaNoSistema != 1 && permanenciaNoSistema != 2) {
					System.out.println("Digite 1 ou 2.");
				}
			}
			System.out.println("Voc� saiu do sistema!");
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
			System.out.println("Qual o nome do funcion�rio que deve ser cadastrado?");
			nomeDoFuncionario = leitor.next();
			System.out.println("Qual o cargo do funcion�rio?");
			cargoDoFuncionario = leitor.next();
			System.out.println("Qual o salario do funcion�rio?");
			salarioDoFuncionario = leitor.nextDouble();
			System.out.println("Qual a idade do funcion�rio?");
			idadeDoFuncionario = leitor.nextInt();
			if(listaDeFuncionarios.add(new Funcionario(nomeDoFuncionario,
					cargoDoFuncionario,salarioDoFuncionario,idadeDoFuncionario))) {
				System.out.println("Funcion�rio criado com sucesso!");
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
			System.out.println("Qual o nome do funcion�rio que deve ser removido?");
			nomeDoFuncionario = leitor.next();
			for(Funcionario funcionarioDaLista : listaDeFuncionarios) {
				if(funcionarioDaLista.getNome().equals(nomeDoFuncionario)) {
					deletouFuncionario = listaDeFuncionarios.remove(funcionarioDaLista);
					System.out.println("Funcion�rio removido com sucesso.");
				}
			}
			if(!deletouFuncionario) {
				System.out.println("Funcion�rio n�o encontrado, portanto, n�o foi removido.");
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
			System.out.println("Qual o nome do funcion�rio que deve ser buscado?");
			nomeDoFuncionario = leitor.next();
			for(Funcionario funcionarioDaLista : listaDeFuncionarios) {
				if(funcionarioDaLista.getNome().equals(nomeDoFuncionario)) {
					System.out.println("Achou o funcion�rio!");
					achouFuncionario = true;
					funcionarioDaLista.imprimirDados();
				}
			}
			if(!achouFuncionario) {
				System.out.println("Funcion�rio n�o encontrado.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
	public static void listarFuncionario(ArrayList<Funcionario> listaDeFuncionarios) {
		if(listaDeFuncionarios.size() >= 0) {
			System.out.println("Lista de funcion�rios:\n");
			for(Funcionario funcionarioDaLista : listaDeFuncionarios) {
				funcionarioDaLista.imprimirDados();
			}
		}else {
			System.out.println("N�o h� funcion�rios cadastrados.");
		}		
	}
}

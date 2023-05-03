/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * 
 */
package aula_8;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarEstoque {
	
	public static void main(String[] args) {
		ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
		int permanenciaNoSistema = 1;
		Scanner leitor  = null;
		System.out.println("Sistema de controle de produtos\n");
		
		try {
			System.out.println("Você deseja continuar(1) ou sair do sistema(2)?");
			leitor = new Scanner(System.in);
			permanenciaNoSistema = leitor.nextInt();
			while(permanenciaNoSistema != 1 && permanenciaNoSistema != 2) {
				System.out.println("Digite 1 ou 2.");
			}
			while(permanenciaNoSistema == 1) {
				controlarProdutos(listaDeProdutos);
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
	
	public static void controlarProdutos(ArrayList<Produto> listaDeProdutos) {
		char opcao = 'a';
		String nome = "", codigo = "";
		int quantidade;
		Scanner leitor  = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Você deseja:"
					+ "\na)Adicionar um novo produto ao estoque, efetivamente criando-o no estoque"
					+ "\nb)Adicionar um novo produto ao estoque, efetivamente criando-o no estoque"
					+ "\nc)Remover um produto do estoque, removendo-o completamente do estoque"
					+ "\nd)Remover um produto do estoque, subtraindo sua quantidade do estoque"
					+ "\ne)Listar todos os produtos em estoque.");
			opcao = leitor.next().charAt(0);
			while(opcao != 'a' && opcao != 'b' && opcao != 'c') {
				System.out.println("Opcao somente pode ser a, b ou c");
				opcao = leitor.next().charAt(0);
			}
			switch(opcao) {
				case 'a':
					System.out.println("Insira o nome do novo produto que deve ser introduzido no estoque");
					nome = leitor.next();
					System.out.println("Insira o código do produto.\nO código deve ser único.");
					codigo = leitor.next();
					System.out.println("Insira a quantidade do produto");
					quantidade = leitor.nextInt();
					listaDeProdutos.add(new Produto(nome, codigo, quantidade));
					break;
				case 'b':
					System.out.println("Insira o código do produto que deve ser incrementado.\nO código deve ser único.");
					codigo = leitor.next();
					System.out.println("Insira a quantidade a ser incrementada.\nO código deve ser único.");
					quantidade = leitor.nextInt();
					for(Produto produtoDaLista : listaDeProdutos) {
						if(produtoDaLista.getCodigo().equals(codigo)) {
							produtoDaLista.adicionarProduto(quantidade);
							System.out.println("Produto incrementado.");
							break;
						}
					}
					break;
				case 'c':
					System.out.println("Insira o código do produto que deve ser removido.\nO código deve ser único.");
					codigo = leitor.next();
					for(Produto produtoDaLista : listaDeProdutos) {
						if(produtoDaLista.getCodigo().equals(codigo)) {
							if(listaDeProdutos.remove(produtoDaLista)) {
								System.out.println("O produto foi removido");
							}
							break;
						}
					}
					break;
				case 'd':
					System.out.println("Insira o código do produto que deve ser decrementado.\nO código deve ser único.");
					codigo = leitor.next();
					System.out.println("Insira a quantidade a ser decrementada.\nO código deve ser único.");
					quantidade = leitor.nextInt();
					for(Produto produtoDaLista : listaDeProdutos) {
						if(produtoDaLista.getCodigo().equals(codigo)) {
							produtoDaLista.subtrairProduto(quantidade);
							System.out.println("Produto decrementado.");
							break;
						}
					}
					break;
				case 'e':
					System.out.println("##Listagem de todos os produtos##");
					for(Produto produto : listaDeProdutos) {
						produto.imprimirDados();
					}
					break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
}
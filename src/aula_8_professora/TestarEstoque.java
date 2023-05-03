package aula_8_professora;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarEstoque {
	
	static ArrayList<Produto> estoque =new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao = 0;
		
		do {
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Adicionar um novo produto");
			System.out.println("2 - Remover um produto");
			System.out.println("3 - Listar todos os produtos");
			System.out.println("4 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:  adicionarProduto();
			             break;
				case 2:  removerProduto();
		        		 break; 
				case 3:  imprimirEstoque();
		                 break;
				case 4: System.out.println("FIM");
		        		break;
		        default : System.out.println("Você digitou um numero qualquer");
			}
		}while (opcao != 4);
		

	}
	
	private static void imprimirEstoque() {
		for (Produto produto: estoque) {
			produto.imprimirDados();
		}
		
	}

	private static void removerProduto() {
		/*int posicao;
		System.out.println("Informe a Posição que deseja remover ");
		posicao = sc.nextInt();
		if (posicao >= 0 && posicao < estoque.size()) {
			estoque.remove(posicao);
			System.out.println("Produto removido do estoque");
		}else {
			System.out.println("Posição Inválida");
		}*/
		
		//implementação para apagar pela posicao
		
		int cod;
		System.out.println("Informe codigo do produto para apagar");
	    cod = sc.nextInt();
	    boolean achou = false;
	    for (Produto produto : estoque) {
	    	if (cod == produto.codigo) {
	    		estoque.remove(produto);
	    		System.out.println("Produto removido do estoque");
	    		achou = true;
	    		break;
	    	}
	    }
	    if (!achou) {
	    	System.out.println("Produto não existe no estoque");
	    }
		
		
		
		
	}

	private static void adicionarProduto() {
	    int cod;
	    String nome;
	    int quantidade;
	    System.out.println("Informe codigo do produto");
	    cod = sc.nextInt();
	    System.out.println("Informe o nome do produto");
	    nome = sc.next();
	    System.out.println("Informe a quantidade");
	    quantidade = sc.nextInt();
	    
	    estoque.add(new Produto(cod, nome, quantidade));
	}
		
		
	
	
	

}

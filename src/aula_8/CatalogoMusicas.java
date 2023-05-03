/**
 * @author Lucas da Silva Barbosa
 * Matrícula: 202120194
 * 
 */
package aula_8;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoMusicas {

	public static void main(String[] args) {
		ArrayList<Musica> listaDeMusicas = new ArrayList<Musica>();
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
				System.out.println("Você deseja:\nCadastrar música(a)"
						+ "\nRemover música(b)"
						+ "\nListar música(c)");
				switch(opcaoOperacoes) {
					case 'a':
						cadastrarMusica(listaDeMusicas);
						break;
					case 'b':
						removerMusica(listaDeMusicas);
						break;
					case 'c':
						listarMusica(listaDeMusicas);
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

	private static void listarMusica(ArrayList<Musica> listaDeMusicas) {
		if(listaDeMusicas.size() >= 0) {
			System.out.println("##Listagem de músicas##");
			for(Musica musica : listaDeMusicas) {
				musica.imprimirDados();
			}
		}else {
			System.out.println("Não há músicas.");
		}		
	}

	private static void removerMusica(ArrayList<Musica> listaDeMusicas) {
		String tituloDaMusica = "";
		boolean conseguiuRemover = false;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Qual o titulo da música que deve ser removida?");
			tituloDaMusica = leitor.next();
			for(Musica musica : listaDeMusicas) {
				if(musica.getTitulo().equals(tituloDaMusica)) {
					conseguiuRemover = listaDeMusicas.remove(musica);
					System.out.println("Música removida com sucesso!");
					break;
				}
			}
			if(!conseguiuRemover) {
				System.out.println("A música não foi removida, pois não foi encontrada.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}

	private static void cadastrarMusica(ArrayList<Musica> listaDeMusicas) {
		String tituloDaMusica = "", artistaDaMusica = "", albumDaMusica = "";
		int duracaoDaMusica = 0;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Qual o titulo da música que deve ser cadastrada?");
			tituloDaMusica = leitor.next();
			System.out.println("Qual o artista da música?");
			artistaDaMusica = leitor.next();
			System.out.println("Qual o album da música?");
			albumDaMusica = leitor.next();
			System.out.println("Qual a duração, em segundos, da música?");
			duracaoDaMusica = leitor.nextInt();
			if(listaDeMusicas.add(new Musica(tituloDaMusica,
					artistaDaMusica,albumDaMusica,duracaoDaMusica))) {
				System.out.println("Música criada com sucesso!");
			}else {
				System.out.println("A música não foi criada. Tente novamente");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
}

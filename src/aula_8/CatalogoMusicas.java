/**
 * @author Lucas da Silva Barbosa
 * Matr�cula: 202120194
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
		System.out.println("Sistema de controle de funcion�rios\n");
		try {
			System.out.println("Voc� deseja continuar(1) ou sair do sistema(2)?");
			leitor = new Scanner(System.in);
			permanenciaNoSistema = leitor.nextInt();
			while(permanenciaNoSistema != 1 && permanenciaNoSistema != 2) {
				System.out.println("Digite 1 ou 2.");
			}
			while(permanenciaNoSistema == 1) {
				System.out.println("Voc� deseja:\nCadastrar m�sica(a)"
						+ "\nRemover m�sica(b)"
						+ "\nListar m�sica(c)");
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

	private static void listarMusica(ArrayList<Musica> listaDeMusicas) {
		if(listaDeMusicas.size() >= 0) {
			System.out.println("##Listagem de m�sicas##");
			for(Musica musica : listaDeMusicas) {
				musica.imprimirDados();
			}
		}else {
			System.out.println("N�o h� m�sicas.");
		}		
	}

	private static void removerMusica(ArrayList<Musica> listaDeMusicas) {
		String tituloDaMusica = "";
		boolean conseguiuRemover = false;
		Scanner leitor = null;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Qual o titulo da m�sica que deve ser removida?");
			tituloDaMusica = leitor.next();
			for(Musica musica : listaDeMusicas) {
				if(musica.getTitulo().equals(tituloDaMusica)) {
					conseguiuRemover = listaDeMusicas.remove(musica);
					System.out.println("M�sica removida com sucesso!");
					break;
				}
			}
			if(!conseguiuRemover) {
				System.out.println("A m�sica n�o foi removida, pois n�o foi encontrada.");
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
			System.out.println("Qual o titulo da m�sica que deve ser cadastrada?");
			tituloDaMusica = leitor.next();
			System.out.println("Qual o artista da m�sica?");
			artistaDaMusica = leitor.next();
			System.out.println("Qual o album da m�sica?");
			albumDaMusica = leitor.next();
			System.out.println("Qual a dura��o, em segundos, da m�sica?");
			duracaoDaMusica = leitor.nextInt();
			if(listaDeMusicas.add(new Musica(tituloDaMusica,
					artistaDaMusica,albumDaMusica,duracaoDaMusica))) {
				System.out.println("M�sica criada com sucesso!");
			}else {
				System.out.println("A m�sica n�o foi criada. Tente novamente");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
}

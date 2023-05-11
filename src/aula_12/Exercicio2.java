/**
	1-	Criar uma Classe chamada Pessoa com os atributos id(Inteiro), nome(String) e idade(Inteiro)
	2-	Criar duas filas: FilaNormal e FilaPreferencial
	3-	Adicionar 10 pessoas e o adicionar uma nova pessoa verifique se a idade for maior ou igual 60 anos
		dever� ser adicionada na filaPreferencial, caso contr�rio dever� ser adicionada na FilaNormal.
	4-	Criar o m�todo atendimentoNormal que dever� remover uma pessoa da filaNormal
	5-	Criar o m�todo atendimentoPreferencial que dever� remover uma pessoa da filaPreferencial
	6-	Criar o m�todo que informe quantas pessoas tem em cada fila
 * 
 */
package aula_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Queue<Pessoa> filaNormal = new LinkedList<Pessoa>(), filaPreferencial = new LinkedList<Pessoa>();
		Pessoa pessoaAtual;
		Scanner leitor = null;
		Integer tamanhoDaFilaNormal, id = 1;
		try {
			leitor = new Scanner(System.in);
			System.out.println("Quantas pessoas v�o entrar na fila?");
			tamanhoDaFilaNormal = leitor.nextInt();
			while(tamanhoDaFilaNormal.intValue() < 0) {
				System.out.println("Digite um valor maior do que zero.");
				tamanhoDaFilaNormal = leitor.nextInt();
			}
			
			for(int i = 0; i < tamanhoDaFilaNormal.intValue(); i++) {
				String nome;
				Integer idade;
				System.out.println("Qual o nome da pessoa ["+(i+1)+"]?");
				nome = leitor.next();
				System.out.println("Qual a idade da pessoa ["+(i+1)+"]?");
				idade = leitor.nextInt();
				pessoaAtual = new Pessoa(id, nome, idade);
				if(idade.intValue() >= 60) {
					filaPreferencial.offer(pessoaAtual); // Tambem pode ser add()
				}else {
					filaNormal.offer(pessoaAtual); // Tambem pode ser add()
				}
			}
			
			int decisao = 1,operacao = 0;
			System.out.println("Sistema de gest�o de pessoas");
			while(decisao != 0) {
				System.out.println("Qual opera��o deseja realizar?");
				System.out.println("1-Atendimento normal\n2-Atendimento preferencial\n3-Confer�ncia de tamanho de filas");
				operacao = leitor.nextInt();
				while(operacao < 1 || operacao > 3) {
					System.out.println("Para escolha de decis�es,"
							+ "n�o � permitido valores abaixo de zero e acima de tr�s.");
					operacao = leitor.nextInt();
				}
				switch(operacao) {
					case 1:
						atendimentoNormal(filaNormal);
						break;
					case 2:
						atendimentoPreferencial(filaPreferencial);
						break;
					case 3:
						ArrayList<Integer> qtdPessoasNasFilas = contarPessoasNasFilas(filaNormal, filaPreferencial);
						for(Integer qtd : qtdPessoasNasFilas) {
							int indice = qtdPessoasNasFilas.indexOf(qtd);
							if(indice == 0) {
								System.out.println("Fila Normal: "+ qtd.toString());
							}else {
								System.out.println("Fila Preferencial: "+ qtd.toString());
							}
						}
						break;
					default:
						break;
				}
				System.out.println("Deseja fazer outra opera��o?");
				decisao = leitor.nextInt();
				while(decisao < 0 || decisao > 1) {
					System.out.println("Para decis�o de entrada/sa�da do sistema,"
							+ "n�o � permitido valores abaixo de zero e acima de um.");
					decisao = leitor.nextInt();
				}
			}
			System.out.println("Voc� saiu do sistema! At� mais!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void atendimentoNormal(Queue<Pessoa> filaNormal) {
		if(!filaNormal.isEmpty()) {
			Pessoa pessoa = filaNormal.poll();
			System.out.println("FN - Atendimento bem sucedido! Dados da pessoa abaixo.");
			System.out.println(pessoa);
		}else {
			System.out.println("A fila normal est� vazia.");
		}
	}
	
	public static void atendimentoPreferencial(Queue<Pessoa> filaPreferencial) {
		if(!filaPreferencial.isEmpty()) {
			Pessoa pessoa = filaPreferencial.poll();
			System.out.println("FP - Atendimento bem sucedido! Dados da pessoa abaixo.");
			System.out.println(pessoa);
		}else {
			System.out.println("A fila preferencial est� vazia.");
		}
	}
	
	public static ArrayList<Integer> contarPessoasNasFilas(Queue<Pessoa> filaNormal, Queue<Pessoa> filaPreferencial){
		ArrayList<Integer> quantidadeDePessoasNasFilas = new ArrayList<Integer>();
		if(filaNormal.isEmpty()) {
			quantidadeDePessoasNasFilas.add(0);
		} else {
			quantidadeDePessoasNasFilas.add(filaNormal.size());
		}
		
		if(filaPreferencial.isEmpty()) {
			quantidadeDePessoasNasFilas.add(0);
		} else {
			quantidadeDePessoasNasFilas.add(filaPreferencial.size());
		}
		return quantidadeDePessoasNasFilas;
	}
}

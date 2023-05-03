package aula_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class TestarListaTarefas {
	public static void main(String[] args) {
		ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
		int qtdTarefas = 0, qtdTarefasConcluidas = 0, idTarefa;
		Random aleatorio = new Random();
		Scanner leitor = null;
		String descricao;
		
		try {
			leitor = new Scanner(System.in);
			
			// Primeira tarefa, índice zero, segunda tarefa, índice um, assim sucessivamente.
			// Quantas tarefas
			System.out.println("Quantas tarefas deseja cadastrar?");
			qtdTarefas = leitor.nextInt(); // Pode ser 3
			while(qtdTarefas >= 10 || qtdTarefas < 0) {
				System.out.println("\nO número máximo de tarefas é 10 e o número mínimo é 1. Entre novamente com os dados.");
				qtdTarefas = leitor.nextInt();
			}
			
			// Descrição das tarefas
			for(int i = 0; i < qtdTarefas; i++) {
				System.out.println("\nQual a descrição da "+(i+1)+"º tarefa ?");
				descricao = leitor.next();
				listaDeTarefas.add(new Tarefa(i,descricao));
			}
			
			// Quantas tarefas concluidas
			System.out.println("\nQuantas tarefas estão concluidas?");
			qtdTarefasConcluidas = leitor.nextInt();
			while(qtdTarefasConcluidas > listaDeTarefas.size() || qtdTarefasConcluidas < 0) {
				System.out.println("\nA quantidade de tarefas não pode ser maior do que o tamanho do vetor ou nula. Entre novamente com os dados.");
				qtdTarefasConcluidas = leitor.nextInt();
			}
			
			// Impressão inicial. Sem ordenação e com situações incompletas.
			System.out.println("\nTAREFAS\nImpressão inicial.");
			for(Tarefa tarefa : listaDeTarefas) {
				System.out.println(tarefa.toString());
			}
			
			// Id das tarefas concluidas
			int[] idDasTarefasConcluidas = new int[qtdTarefasConcluidas];
			for(int i = 0; i < idDasTarefasConcluidas.length; i++) {
				System.out.println("\nQual o identificador da "+(i+1)+"º tarefa concluida? Caso seja mais de um, cite na ordem da entrada das tarefas.");
				idDasTarefasConcluidas[i] = leitor.nextInt();
			}
			
			// Concluindo tarefas de fato
			int contadorConcluido = 0;
			for(Tarefa tarefa : listaDeTarefas) {
				if(contadorConcluido >= idDasTarefasConcluidas.length) {
					break;
				}
				for(int i = 0; i < idDasTarefasConcluidas.length; i++) {
					if(tarefa.getIdTarefa() == idDasTarefasConcluidas[i]) {
						tarefa.setConcluido(true);
						contadorConcluido++;
					}
				}
			}
			
			//Ordenando as tarefas
			Collections.sort(listaDeTarefas, new Comparator<Tarefa>(){
				@Override
				public int compare(Tarefa o1, Tarefa o2) {
					return o1.getDescricao().compareTo(o2.getDescricao());
				}
			});
			
			//Imprimindo de tarefas ordenadas e com algumas tarefas a mais concluidas
			System.out.println("\nTAREFAS\nOrdenado conforme a ordem do dicionário para o nome da atividade.");
			for(Tarefa tarefa : listaDeTarefas) {
				System.out.println(tarefa.toString());
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			leitor.close();
		}
	}
}

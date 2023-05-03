package aula11;

import java.util.LinkedList;
import java.util.Queue;

public class TestarFilaTarefa {

	public static void main(String[] args) {
		Queue<Tarefa> filaDeTarefas = new LinkedList<>();
		int tempoTotal = 0;
		filaDeTarefas.add(new Tarefa("Levantar", 30));
		filaDeTarefas.add(new Tarefa("Vestir roupa", 10));
		filaDeTarefas.add(new Tarefa("Sair do quarto", 30));
		filaDeTarefas.add(new Tarefa("Ir no banheiro", 20));
		filaDeTarefas.add(new Tarefa("Fazer café", 10));
		
		for(Tarefa tarefa : filaDeTarefas) {
			System.out.println(tarefa.toString()+"\n");
		}
		
		for(int i = 0; i < 3; i++) {
			tempoTotal += filaDeTarefas.poll().getTempo();
		}
		System.out.println("\nTempo total das tarefas removidas: "+tempoTotal);
		System.out.println("\nTarefas restantes abaixo:");
		for(Tarefa tarefa : filaDeTarefas) {
			System.out.println(tarefa.toString()+"\n");
		}
	}

}

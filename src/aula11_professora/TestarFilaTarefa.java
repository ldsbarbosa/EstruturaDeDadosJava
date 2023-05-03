package aula11_professora;

import java.util.LinkedList;
import java.util.Queue;

public class TestarFilaTarefa {

	public static void main(String[] args) {
		Queue<Tarefa> listaTarefas= new LinkedList<>();
		listaTarefas.add(new Tarefa("estudar", 30));
		listaTarefas.add(new Tarefa("jogar",10));
		listaTarefas.add(new Tarefa("academia",30));
		listaTarefas.add(new Tarefa("lavar louça",10));
		listaTarefas.add(new Tarefa("ler", 20));
	    
	    
	    for (Tarefa tarefa: listaTarefas) {
	    	tarefa.imprimirDados();
	    }
	    
	    int tempoGasto=0;
	    Tarefa proximaTarefa ;
	    proximaTarefa = listaTarefas.peek();
	    tempoGasto =tempoGasto+proximaTarefa.tempo;
	    listaTarefas.remove();
	    
	    proximaTarefa = listaTarefas.peek();
	    tempoGasto =tempoGasto+proximaTarefa.tempo;
	    listaTarefas.remove();
	    
	    proximaTarefa = listaTarefas.peek();
	    tempoGasto =tempoGasto+proximaTarefa.tempo;
	    listaTarefas.remove();
	    
	    System.out.println("tempo gasto nas tarefas removidas "+tempoGasto+" minutos ");

	    System.out.println("Tarefas não removidas ");

	    for (Tarefa tarefa: listaTarefas) {
	    	tarefa.imprimirDados();
	    }
	    
	    
	}

}

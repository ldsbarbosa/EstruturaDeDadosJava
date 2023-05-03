package aula_5;

public class Tarefa implements Comparable<Tarefa>{
	private int idTarefa;
	private String descricao;
	private boolean concluido;
	
	public Tarefa(int idTarefa, String descricao, boolean concluido) {
		this.idTarefa = idTarefa;
		this.descricao = descricao;
		this.concluido = concluido;
	}
	
	public Tarefa(int idTarefa, String descricao) {
		this.idTarefa = idTarefa;
		this.descricao = descricao;
		this.concluido = false;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isConcluido() {
		return concluido;
	}
	public void setConcluido(boolean concluido) { //Concluir Tarefa
		this.concluido = concluido;
	}

	public int getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}

	@Override
	public String toString() { // Imprimir Tarefa
		String situacao = concluido ? "Concluída" : "Incompleta";
		return "Tarefa "+ idTarefa + "\n \t Atividade: " + descricao + "\n \t Situação: " + situacao;
	}

	@Override
	public int compareTo(Tarefa tarefa) {
		return toString().compareTo(tarefa.toString());
	}	
}

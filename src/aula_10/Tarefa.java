package aula_10;

public class Tarefa {
	private String nomeTarefa;
	private int tempo;
	
	public Tarefa(String nomeTarefa, int tempo) {
		this.nomeTarefa = nomeTarefa;
		this.tempo = tempo;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	@Override
	public String toString() { // Imprimir dados
		return "Nome: " + nomeTarefa + "|| Tempo, em minutos: " + tempo;
	}
	
	
	
}

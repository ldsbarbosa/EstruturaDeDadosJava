package aula11_professora;

public class Tarefa {
	
	public String nome;
	public int tempo;
	
	public Tarefa(String nome, int tempo) {
		this.nome=nome;
		this.tempo=tempo;
	}
	
	public void imprimirDados() {
		System.out.println(nome+ " = "+tempo+" minutos");
	}

}

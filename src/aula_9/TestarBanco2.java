package aula_9;

public class TestarBanco2 {
	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.adicionarConta();
		banco.adicionarConta();
		banco.listarContas();
		banco.removerConta();
		banco.removerConta();
		banco.listarContas();
		banco.buscarConta();
		banco.buscarConta();
	}
}

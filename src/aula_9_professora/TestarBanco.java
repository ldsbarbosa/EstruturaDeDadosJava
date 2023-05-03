package aula_9_professora;

public class TestarBanco {

	public static void main(String[] args) {
		Banco itau = new Banco();
		itau.adicionarConta();
		itau.adicionarConta();
		itau.listarContas();
		itau.removerConta();
		itau.removerConta();
		itau.listarContas();
	}

}

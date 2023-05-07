package aula_11;

import java.util.Stack;

public class PilhaFuncionarios {
	private Stack<Funcionario> pilhaDeFuncionarios = new Stack<Funcionario>();
	// private Stack<Funcionario> pilhaDeFuncionarios = new Stack<>();

	public void empilharFuncionario(String nome, String cargo) {
		Funcionario func = new Funcionario(nome, cargo);
		pilhaDeFuncionarios.push(func); // add() também funciona pois é de List.
	}

	public void desempilharEImprimir() {
		if (!pilhaDeFuncionarios.empty()) {
			System.out.println(pilhaDeFuncionarios.pop());
		} else {
			System.out.println("A pilha está vazia.");
		}
	}

	public Stack<Funcionario> getPilhaDeFuncionarios() {
		return pilhaDeFuncionarios;
	}
}

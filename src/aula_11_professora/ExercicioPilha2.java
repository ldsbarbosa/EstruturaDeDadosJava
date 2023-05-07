package aula_11_professora;

import java.util.Stack;

public class ExercicioPilha2 {

	public static void main(String[] args) {
		Stack<Funcionario> pilhaFuncionarios = new Stack<>();
		pilhaFuncionarios.push(new Funcionario("João", "Gerente"));
		pilhaFuncionarios.push(new Funcionario("Maria", "Assistente"));
		pilhaFuncionarios.push(new Funcionario("Jéssica", "Diretora"));
		pilhaFuncionarios.push(new Funcionario("Pedro", "Estagiário"));
		
		while ( ! pilhaFuncionarios.empty()) {
			System.out.println("Removendo da pilha: "+pilhaFuncionarios.pop());
		}
		

	}

}

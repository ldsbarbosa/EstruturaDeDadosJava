package aula_11_professora;

import java.util.Stack;

public class ExercicioPilha2 {

	public static void main(String[] args) {
		Stack<Funcionario> pilhaFuncionarios = new Stack<>();
		pilhaFuncionarios.push(new Funcionario("Jo�o", "Gerente"));
		pilhaFuncionarios.push(new Funcionario("Maria", "Assistente"));
		pilhaFuncionarios.push(new Funcionario("J�ssica", "Diretora"));
		pilhaFuncionarios.push(new Funcionario("Pedro", "Estagi�rio"));
		
		while ( ! pilhaFuncionarios.empty()) {
			System.out.println("Removendo da pilha: "+pilhaFuncionarios.pop());
		}
		

	}

}

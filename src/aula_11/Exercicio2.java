// Coment�rio da profa.: Aspas simples � mais utilizada em Banco de Dados. Prefer�ncia por aspas duplas para String.
package aula_11;

public class Exercicio2 {

	public static void main(String[] args) {
		// � Criar uma classe Funcion�rio com os atributos nome e cargo;
		// � Criar um m�todo construtor para instanciar objetos da classe Funcionario
		// � Criar uma classe PilhaFuncionarios
		// � Declare uma Pilha do tipo Funcionario
		PilhaFuncionarios pilhaDeFun = new PilhaFuncionarios();
		
		// � Adicione na Pilha de Funcionarios:
		// � Jo�o � Gerente
		pilhaDeFun.empilharFuncionario("Jo�o", "Gerente");
		
		// � Maria � Assistente
		pilhaDeFun.empilharFuncionario("Maria", "Assistente");
		
		// � J�ssica � Diretora
		pilhaDeFun.empilharFuncionario("J�ssica", "Diretora");
		
		// � Pedro � Estagi�rio
		pilhaDeFun.empilharFuncionario("Pedro", "Estagi�rio"); // Primeiro a ser exibido
		// � Esvazie a pilha imprimindo todos os dados dos funcionarios
		while (!pilhaDeFun.getPilhaDeFuncionarios().empty()) {
			pilhaDeFun.desempilharEImprimir();
		}
	}
}

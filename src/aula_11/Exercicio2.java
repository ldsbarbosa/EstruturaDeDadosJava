// Comentário da profa.: Aspas simples é mais utilizada em Banco de Dados. Preferência por aspas duplas para String.
package aula_11;

public class Exercicio2 {

	public static void main(String[] args) {
		// • Criar uma classe Funcionário com os atributos nome e cargo;
		// • Criar um método construtor para instanciar objetos da classe Funcionario
		// • Criar uma classe PilhaFuncionarios
		// • Declare uma Pilha do tipo Funcionario
		PilhaFuncionarios pilhaDeFun = new PilhaFuncionarios();
		
		// • Adicione na Pilha de Funcionarios:
		// • João – Gerente
		pilhaDeFun.empilharFuncionario("João", "Gerente");
		
		// • Maria – Assistente
		pilhaDeFun.empilharFuncionario("Maria", "Assistente");
		
		// • Jéssica – Diretora
		pilhaDeFun.empilharFuncionario("Jéssica", "Diretora");
		
		// • Pedro – Estagiário
		pilhaDeFun.empilharFuncionario("Pedro", "Estagiário"); // Primeiro a ser exibido
		// • Esvazie a pilha imprimindo todos os dados dos funcionarios
		while (!pilhaDeFun.getPilhaDeFuncionarios().empty()) {
			pilhaDeFun.desempilharEImprimir();
		}
	}
}

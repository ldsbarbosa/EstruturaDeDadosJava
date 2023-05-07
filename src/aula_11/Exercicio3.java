package aula_11;

public class Exercicio3 {

	public static void main(String[] args) {
//		• Criar uma classe PilhaNumeros;
		PilhaNumeros pilhaDeNumeros = new PilhaNumeros();
//		• Declarar duas pilha de dados do tipo inteiros
//		• pilhaPar
//		• pilhaImpar
//		• Gerar 10 números entre 1 e 100, caso o numero seja par colocar na
//		pilhaPar, caso contrário colocar na pilhaImpar
		pilhaDeNumeros.gerarOsNumeros();
//		• Ao final remover os elementos das pilhas, imprimindo cada elemento
		pilhaDeNumeros.desempilharEImprimir();

	}

}

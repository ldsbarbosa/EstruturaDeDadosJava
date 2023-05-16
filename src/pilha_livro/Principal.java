package pilha_livro;

public class Principal {
	public static void main(String[] args) {
		// A pilha está da direita para a esquerda
		// Direita => Base, Esquerda => Topo
		Pilha pilha = new Pilha();
		pilha.tamanho(10);
		pilha.empilhar(5);
		pilha.empilhar(3);
		pilha.desempilhar();
		pilha.empilhar(7);
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.empilhar(9);
		pilha.empilhar(7);
		pilha.empilhar(3);
		pilha.empilhar(5);
		pilha.desempilhar();
		pilha.imprimir();
	}
}

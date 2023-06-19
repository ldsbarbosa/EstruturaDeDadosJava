/**
 * A busca bin�ria � um algoritmo de busca eficiente utilizado para encontrar um elemento em uma cole��o ordenada,
 * como um vetor ou uma lista. Ele � baseado na t�cnica de divis�o e conquista, reduzindo repetidamente o espa�o
 * de busca pela metade at� encontrar o elemento desejado ou determinar que o elemento n�o est� presente.
 * 
 * A busca bin�ria � especialmente �til quando a cole��o de dados est� ordenada, pois ela explora essa
 * propriedade para otimizar a busca. Diferentemente de outros tipos de busca, como a busca linear,
 * que percorre os elementos sequencialmente at� encontrar o alvo ou chegar ao final da cole��o,
 * a busca bin�ria � capaz de reduzir drasticamente o n�mero de compara��es necess�rias.
 * 
 * O algoritmo da busca bin�ria segue os seguintes passos:
 * 
 * 1. Inicialmente, estabelece-se um intervalo de busca que engloba todo o vetor ordenado.
 * 2. Calcula-se o elemento do meio desse intervalo.
 * 3. Compara-se o elemento do meio com o elemento desejado.
 * 		Se forem iguais, o elemento foi encontrado e a busca termina com sucesso.
 * 		Se o elemento do meio for menor que o elemento desejado, descarta-se a metade
 * 			inferior do intervalo e a busca continua na metade superior.
 * 		Se o elemento do meio for maior que o elemento desejado, descarta-se a metade superior
 * 			do intervalo e a busca continua na metade inferior.
 * 4. Repete-se os passos 2 e 3 at� encontrar o elemento desejado ou determinar que ele n�o est� presente no vetor.
 * 
 * A principal diferen�a da busca bin�ria em rela��o � busca linear � a sua efici�ncia.
 * Enquanto a busca linear tem uma complexidade de tempo O(n), onde n � o tamanho da cole��o,
 * a busca bin�ria tem uma complexidade de tempo O(log n), o que a torna muito mais r�pida em cole��es grandes.
 * A busca bin�ria � especialmente vantajosa quando h� a necessidade de fazer v�rias buscas em uma mesma cole��o,
 * pois o custo da ordena��o inicial � compensado pela efici�ncia das buscas subsequentes.
 * 
 * No entanto, � importante ressaltar que a busca bin�ria requer que os elementos estejam ordenados.
 * Caso contr�rio, o algoritmo n�o funcionar� corretamente. Al�m disso, a busca bin�ria tamb�m requer
 * acesso direto aos elementos, o que pode ser um desafio em algumas estruturas de dados, como listas encadeadas.
 * Portanto, a escolha da busca bin�ria depende do contexto e das caracter�sticas dos dados a serem buscados.
 */
package aula_15;

public class BuscaBinaria {
	public static int pesquisaBinaria(int[] vetor, int numero) {
		int esquerda = 0; // Inicio
		int direita = vetor.length - 1; // Final

		while (esquerda <= direita) {
			int meio = esquerda + (direita - esquerda) / 2;

			if (vetor[meio] == numero) {
				return meio; // o n�mero foi encontrado, retorna o �ndice
			}

			if (vetor[meio] < numero) {
				esquerda = meio + 1; // descarta a metade esquerda
			} else {
				direita = meio - 1; // descarta a metade direita
			}
		}

		return -1; // o n�mero n�o foi encontrado
	}

	public static void main(String[] args) {
		int[] vetor = { 12, 14, 16, 18, 19, 21 };
		int numeroProcurado = 19;

		int indice = pesquisaBinaria(vetor, numeroProcurado);

		if (indice != -1) {
			System.out.println("O n�mero " + numeroProcurado + " foi encontrado no �ndice " + indice + ".");
		} else {
			System.out.println("O n�mero " + numeroProcurado + " n�o foi encontrado no vetor.");
		}
	}
}

/**
 * A busca binária é um algoritmo de busca eficiente utilizado para encontrar um elemento em uma coleção ordenada,
 * como um vetor ou uma lista. Ele é baseado na técnica de divisão e conquista, reduzindo repetidamente o espaço
 * de busca pela metade até encontrar o elemento desejado ou determinar que o elemento não está presente.
 * 
 * A busca binária é especialmente útil quando a coleção de dados está ordenada, pois ela explora essa
 * propriedade para otimizar a busca. Diferentemente de outros tipos de busca, como a busca linear,
 * que percorre os elementos sequencialmente até encontrar o alvo ou chegar ao final da coleção,
 * a busca binária é capaz de reduzir drasticamente o número de comparações necessárias.
 * 
 * O algoritmo da busca binária segue os seguintes passos:
 * 
 * 1. Inicialmente, estabelece-se um intervalo de busca que engloba todo o vetor ordenado.
 * 2. Calcula-se o elemento do meio desse intervalo.
 * 3. Compara-se o elemento do meio com o elemento desejado.
 * 		Se forem iguais, o elemento foi encontrado e a busca termina com sucesso.
 * 		Se o elemento do meio for menor que o elemento desejado, descarta-se a metade
 * 			inferior do intervalo e a busca continua na metade superior.
 * 		Se o elemento do meio for maior que o elemento desejado, descarta-se a metade superior
 * 			do intervalo e a busca continua na metade inferior.
 * 4. Repete-se os passos 2 e 3 até encontrar o elemento desejado ou determinar que ele não está presente no vetor.
 * 
 * A principal diferença da busca binária em relação à busca linear é a sua eficiência.
 * Enquanto a busca linear tem uma complexidade de tempo O(n), onde n é o tamanho da coleção,
 * a busca binária tem uma complexidade de tempo O(log n), o que a torna muito mais rápida em coleções grandes.
 * A busca binária é especialmente vantajosa quando há a necessidade de fazer várias buscas em uma mesma coleção,
 * pois o custo da ordenação inicial é compensado pela eficiência das buscas subsequentes.
 * 
 * No entanto, é importante ressaltar que a busca binária requer que os elementos estejam ordenados.
 * Caso contrário, o algoritmo não funcionará corretamente. Além disso, a busca binária também requer
 * acesso direto aos elementos, o que pode ser um desafio em algumas estruturas de dados, como listas encadeadas.
 * Portanto, a escolha da busca binária depende do contexto e das características dos dados a serem buscados.
 */
package aula_15;

public class BuscaBinaria {
	public static int pesquisaBinaria(int[] vetor, int numero) {
		int esquerda = 0; // Inicio
		int direita = vetor.length - 1; // Final

		while (esquerda <= direita) {
			int meio = esquerda + (direita - esquerda) / 2;

			if (vetor[meio] == numero) {
				return meio; // o número foi encontrado, retorna o índice
			}

			if (vetor[meio] < numero) {
				esquerda = meio + 1; // descarta a metade esquerda
			} else {
				direita = meio - 1; // descarta a metade direita
			}
		}

		return -1; // o número não foi encontrado
	}

	public static void main(String[] args) {
		int[] vetor = { 12, 14, 16, 18, 19, 21 };
		int numeroProcurado = 19;

		int indice = pesquisaBinaria(vetor, numeroProcurado);

		if (indice != -1) {
			System.out.println("O número " + numeroProcurado + " foi encontrado no índice " + indice + ".");
		} else {
			System.out.println("O número " + numeroProcurado + " não foi encontrado no vetor.");
		}
	}
}

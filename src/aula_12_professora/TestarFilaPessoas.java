package aula_12_professora;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestarFilaPessoas {
	public static void main(String[] args) {
		Queue<Pessoa> filaNormal= new LinkedList<>();
		Queue<Pessoa> filaPreferencial= new LinkedList<>();
		
		System.out.println("Entrada de Dados");
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		
		for (int i=1; i<=4;i++) {
			System.out.println("Digite o nome");
			nome= sc.next();
			System.out.println("Digite a idade");
			idade = sc.nextInt();
			if (idade >= 60) {
				filaPreferencial.add(new Pessoa(i, nome, idade));
			}else
			{
				filaNormal.add(new Pessoa(i, nome, idade));
			}
		}
		
		
		//imprimir a filaPreferencial
		System.out.println("fila Preferencial");
		for (Pessoa pessoa : filaPreferencial) {
			System.out.println(pessoa);
		}
		
		//imprimir a Normal
		System.out.println("fila Normal");
		for (Pessoa pessoa : filaNormal) {
			System.out.println(pessoa);
		}
		
		
		System.out.println("Total de pessoas na fila preferencial "+filaPreferencial.size());
		System.out.println("Total de pessoas na fila normal "+filaNormal.size());
		
		String resposta;
		System.out.println("Deseja chamar da Fila Preferencial ? (S/N)");
		resposta = sc.next();
		
		if (resposta.equals("S")) {
			filaPreferencial.remove();
		}else {
			filaNormal.remove();
		}
		
		System.out.println("Total de pessoas na fila preferencial "+filaPreferencial.size());
		System.out.println("Total de pessoas na fila normal "+filaNormal.size());
		
	}
	
	
}

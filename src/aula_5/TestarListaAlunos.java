package aula_5;

import java.util.ArrayList;

public class TestarListaAlunos {

	public static void main(String[] args) {
		ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
		
		listaDeAlunos.add(new Aluno(4001,"José",1,7));
		listaDeAlunos.add(new Aluno(4002,"Maria",6,8));
		listaDeAlunos.add(new Aluno(4003,"Eduardo",4,6));
		listaDeAlunos.add(new Aluno(4004,"Bernardo",3,8));
		listaDeAlunos.add(new Aluno(4005,"Geraldo",2,1));
		
		for(Aluno aluno : listaDeAlunos) {
			System.out.println(aluno.imprimirDados());
		}
		System.out.println("\n########\n########\n########\n");
		listaDeAlunos.remove(1);
		listaDeAlunos.remove(3);
		for(Aluno aluno : listaDeAlunos) {
			System.out.println(aluno.imprimirDados());
		}
	}

}

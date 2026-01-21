package com.elenilson.cursojava.aula33labs;

import java.util.Scanner;

public class TesteAluno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno:");
		aluno.setNome(scan.nextLine());
		
		System.out.println("Entre com a matricula:");
		aluno.setMatricula(scan.nextLine());		
		
		System.out.println("Entre com a disciplina:");
		aluno.setNomeCurso(scan.nextLine());
		
		aluno.setDisciplinas( new String[3]);
		aluno.setNotas(new double[3][4]);
		

		for(int i = 0; i <aluno.getDisciplinas().length ; i++ ) {
			System.out.println("Digite o nome da "+ (i +1) + "º disciplina"  );
			aluno.setNomeDisciplinasPos(i, scan.nextLine());
				
		}
		for(int i = 0; i < aluno.getNotas().length ; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno.getDisciplinas()[i]);
			for(int j = 0; j < aluno.getNotas()[i].length ; j++) {
				System.out.println("Entre com a " + (j +1) +"º nota");
				aluno.setNotas(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostarInfo();
		
		System.out.println();
		
	
		for(int i = 0; i < aluno.getDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " foi aprovado");
			}else {
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " foi reprovado");
			}
		}
		scan.close();
	}
}

package com.elenilson.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer03 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno:");
		aluno.nome = scan.nextLine();
		
		System.out.println("Entre com a matricula:");
		aluno.matricula = scan.nextLine();		
		
		System.out.println("Entre com a disciplina:");
		aluno.nomeCurso = scan.nextLine();
		
		aluno.disciplinas = new String[3];
		aluno.notas = new double [3][4];
		
	
		for(int i = 0; i <aluno.disciplinas.length; i++ ) {
			System.out.println("Digite o nome da "+ (i +1) + "º disciplina"  );
			aluno.disciplinas[i] = scan.nextLine();			
		}
		
		for(int i = 0; i < aluno.notas.length; i++) {
			System.out.println("Obtendo notas da disciplina: " + aluno.disciplinas[i]);
			for(int j = 0; j < aluno.notas[i].length; j++) {
				System.out.println("Entre com a " + (j +1) +"º nota");
				aluno.notas[i][j] = scan.nextDouble();				
			}
		}
		
		aluno.mostarInfo();
		
		System.out.println();
		
		for(int i = 0; i < aluno.disciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " foi aprovado");
			}else {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " foi reprovado");
			}
		}
		
		scan.close();
	}

}

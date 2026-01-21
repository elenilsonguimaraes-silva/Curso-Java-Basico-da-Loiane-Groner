package com.elenilson.cursojava.aula36labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Curso curso = new Curso();
		System.out.println("Curso");
		System.out.println("Digite o nome do Curso.");
		curso.setNome(scan.nextLine()); 
		System.out.println("Digite o horário:");
		curso.setHorario(scan.nextLine());

		// Tem um Professor
		Professor professor = new Professor();
		System.out.println("Digite o nome do Professor:");
		professor.setNomeProfessor(scan.nextLine());
		System.out.println("Digite o departamento do professor:");
		professor.setDepartamento(scan.nextLine());
		System.out.println("Digite email do professor:");
		professor.setEmail(scan.nextLine());
		curso.setProfessor(professor);

		// Tem um Aluno
		Aluno[] alunos = new Aluno[2];
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = new Aluno();
			System.out.println("Digite o nome do "+ (i+ 1) +"º Aluno:");
			aluno.setNomeAluno(scan.nextLine());
			System.out.println("Digite a matricula do aluno " + aluno.getNomeAluno());
			aluno.setMatricula(scan.nextLine());
			aluno.lancarNotas();
			System.out.println();
			alunos[i] = aluno;

		}
		curso.setAlunos(alunos);
		curso.obterInfoCurso();
		System.out.println();
		for (int i = 0; i < alunos.length; i++) {
			curso.obterMediaAluno(i);
		}
		curso.obterMediaTurma();
	}

}

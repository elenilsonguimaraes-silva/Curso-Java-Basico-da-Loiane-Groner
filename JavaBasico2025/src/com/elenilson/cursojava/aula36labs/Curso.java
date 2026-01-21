package com.elenilson.cursojava.aula36labs;

public class Curso {

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	private double obterMedia(int pos) {
		double media = 0;
		double soma = 0;
		if (this.professor != null && this.alunos != null) {
			for (int i = 0; i < alunos[pos].getNotas().length; i++) {
				soma += alunos[pos].getNotas()[i];
			}
			media = soma / alunos[pos].getNotas().length;
		}
		return media;
	}
	public void obterInfoCurso() {
		System.out.println("Curso: " + this.getNome());
		System.out.println("Horario: " + this.getHorario());
		this.getProfessor().obterInfo();
	}

	public void obterMediaAluno(int pos) {	
		if(this. alunos != null) {
			System.out.println("A média do aluno(a): " + alunos[pos].getNomeAluno() + " é: " + this.obterMedia(pos));
			if (this.obterMedia(pos) >= 7) {
				System.out.println("O aluno(a): " + this.alunos[pos].getNomeAluno() + " está Aprovado!");
			} else {
				System.out.println("O aluno(a): " + this.alunos[pos].getNomeAluno() + " está reprovado!");
			}			
		}
		System.out.println();
	}

	public void obterMediaTurma() {
		double soma = 0;
		if(this.alunos != null) {
			for (int i = 0; i < alunos.length; i++) {
				soma += obterMedia(i);
			}	
			System.out.println("A média da turma é: " + (soma / alunos.length));
		}			
	}

}

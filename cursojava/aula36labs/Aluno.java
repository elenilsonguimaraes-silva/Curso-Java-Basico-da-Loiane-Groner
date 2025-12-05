package com.elenilson.cursojava.aula36labs;

import java.util.Scanner;

public class Aluno {

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomeAluno, String matricula, double[] notas) {
		super();
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.notas = new double[4];
	}

	private String nomeAluno;
	private String matricula;
	private double[] notas;

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void lancarNotas() {
		Scanner scan = new Scanner(System.in);
		this.notas = new double[4];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Entre com a " + (i + 1) + "º nota");
			notas[i] = scan.nextDouble();
		}
	}
	
	public void obterInfo() {
		System.out.println("Nome do Aluno(a): " + this.getNomeAluno());
		System.out.println("Matricula: " + this.getMatricula());
	}

}

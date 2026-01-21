package com.elenilson.cursojava.aula33labs;

public class Aluno {
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] disciplinas;;
	private double[][] notas;;
	
	
	
	public Aluno() {
		disciplinas = new String[3];
		notas = new double[3][4];
	}
	
	
	public Aluno(String nome, String matricula, String nomeCurso, String[] disciplinas, double[][] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.disciplinas = new String[3];
		this.notas = new double[3][4];
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public String[] getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}


	public double[][] getNotas() {
		return notas;
	}


	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	public void mostarInfo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Nome do curso: " + this.getNomeCurso());
		
		for(int i = 0; i < this.disciplinas.length; i++) {
			System.out.println("Notas da disciplina " + this.disciplinas[i]);
			for(int j = 0; j < this.notas[i].length; j++) {
				System.out.print(this.notas[i][j] + " ");
			} 
			System.out.println();
		}
	}

	public boolean verificarAprovado(int indice) {
		double soma = 0;
		int i = 0;
		for( i = 0; i < this.notas[indice].length; i++) {
			soma+= this.notas[indice][i];
		}
		
		double media = soma / i;
		if (media >= 7) {
			return true;
		}
			return false;		
	}
	
	public void setNomeDisciplinasPos(int pos, String nomeDisciplina) {
		this.disciplinas[pos] = nomeDisciplina;
	}
	
	public void setNotas(int posI, int posJ, double nota) {
		this.notas[posI][posJ] = nota;
	}
	


}

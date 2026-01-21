package com.elenilson.cursojava.aula37;

public class Aluno  extends Pessoa{
	private String[] cursos;
	private String[] notas;
	
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		double media = 0;
		return media;
	}
	
	public double verificarAprovado() {
		return 0;
	}
	
}

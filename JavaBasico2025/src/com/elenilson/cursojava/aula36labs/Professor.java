package com.elenilson.cursojava.aula36labs;

public class Professor {

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String nomeProfessor, String departamento, String email) {
		super();
		this.nomeProfessor = nomeProfessor;
		this.departamento = departamento;
		this.email = email;
	}

	private String nomeProfessor;
	private String departamento;
	private String email;

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void obterInfo() {
		System.out.println("Professor: " + this.getNomeProfessor());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Email do Professor: " + this.getEmail());
	}

}

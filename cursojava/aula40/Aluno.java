package com.elenilson.cursojava.aula40;

public class Aluno  extends Pessoa{
	private String curso;
	private double[] notas;
	

	
	public Aluno() {}
	public Aluno(String nome, String endereco, String telefone, String cpf, String curso) {
		super(nome, endereco, telefone, cpf);
		this.curso = curso;
		
	}
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	public void metodoQualquer() {
		super.setCpf("3459999777");
		super.getCpf();
		
	}
	
	public String obterEtiquetaEndereco(){
		String s = "Endereço do Aluno: ";
		s += super.getEndereco();
		return s;
		
	}
	
}

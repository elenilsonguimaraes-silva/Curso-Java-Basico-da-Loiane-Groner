package com.elenilson.cursojava.aula43labs.exer03;

public class Animal {
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
		this.numeroPatas = 4;
	}
	public Animal(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	private String nome;
	private double comprimento;
	private int numeroPatas;;
	private String cor;
	private String ambiente;
	private double velocidade;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	@Override
	public String toString() {
		String s ="";
		
		s+= "Animal:" + nome + "\nComprimento: " + comprimento + "cm\nNumero de Patas: " + numeroPatas + "\nCor: " + cor
				+ "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + " m/s";
		s+="\n---------------------------";
		return s;
	}
	
	
	

}

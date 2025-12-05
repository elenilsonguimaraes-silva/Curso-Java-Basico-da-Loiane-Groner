package com.elenilson.cursojava.aula43labs.exer03;

public class Mamifero extends Animal {

	public Mamifero() {
		this.setCor("castanho");
		this.setAlimento("Mel");
		
	}

	public Mamifero(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
		this.alimento = alimento;
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String alimento) {
		super();		
		this.alimento = alimento;
	}

	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s ="";
		
		s+= "Animal:" + this.getNome() + "\nComprimento: " + this.getComprimento() + " cm\nNumero de Patas: " + this.getNumeroPatas()
		+ "\nCor: " + this.getCor()+ "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: " + this.getVelocidade() + " m/s" +
				"\nAlimento: " + this.getAlimento();
		s+="\n---------------------------";
		return s;
	}

}

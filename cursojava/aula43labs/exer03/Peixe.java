package com.elenilson.cursojava.aula43labs.exer03;

public class Peixe extends Animal{

	public Peixe() {
		this.setNumeroPatas(0);
		this.setAmbiente("Mar");
		this.setCor("cizenta");
		this.setCaracteristicas("Barbatabas e cauda");
	}

	public Peixe(String nome, double comprimento, int numeroPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
		// TODO Auto-generated constructor stub
	}

	public Peixe(String caracteristicas) {
		super();
		this.caracteristicas = caracteristicas;
	}

	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s ="";
		
		s+= "Animal:" + this.getNome() + "\nComprimento: " + this.getComprimento() + " cm\nNumero de Patas: " + this.getNumeroPatas()
		+ "\nCor: " + this.getCor()+ "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: " + this.getVelocidade() + " m/s" +
				"\nCaracteristicas: " + this.getCaracteristicas();
		s+="\n---------------------------";
		return s;
	}
	
	
	

}

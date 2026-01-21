package com.elenilson.cursojava.aula46labs;

public class Circulo extends Figura2D{
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", calcularArea()=" + calcularArea() + ", toString()=" + super.toString()
				+ "]";
	}

	

	

	

}

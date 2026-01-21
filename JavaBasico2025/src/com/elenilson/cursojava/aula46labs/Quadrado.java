package com.elenilson.cursojava.aula46labs;

public class Quadrado extends Figura2D{

	public Quadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		
		return Math.pow(lado, 2);

	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", calcularArea()=" + calcularArea() + ", toString()=" + super.toString()
				+ "]";
	}


}

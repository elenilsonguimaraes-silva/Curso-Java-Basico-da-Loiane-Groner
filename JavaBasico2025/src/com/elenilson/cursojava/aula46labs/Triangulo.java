package com.elenilson.cursojava.aula46labs;

public class Triangulo extends Figura2D{

	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	private double altura;
	private double base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		
		return (this.base * this.altura) / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", base=" + base + ", calcularArea()=" + calcularArea() + ", toString()="
				+ super.toString() + "]";
	}

	

}

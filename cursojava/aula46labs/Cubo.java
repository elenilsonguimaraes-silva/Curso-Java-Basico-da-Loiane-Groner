package com.elenilson.cursojava.aula46labs;

public class Cubo extends Figura3D{

	public Cubo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cubo(int lado) {
		super();
		this.lado = lado;
	}

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {

		return Math.pow(lado, 2) * 6;
	}

	@Override
	public double calcularVolume() {

		return Math.pow(lado, 3);

	}

	@Override
	public String toString() {
		return "Cubo [lado=" + lado + ", calcularArea()=" + calcularArea() + ", calcularVolume()=" + calcularVolume()
				+ ", toString()=" + super.toString() + "]";
	}

	

}

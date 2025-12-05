package com.elenilson.cursojava.aula46labs;

public class Cilindro extends Figura3D {

	public Cilindro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}

	private double raio;
	private double altura;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		return (Math.PI * ( Math.pow(raio, 2) * altura));
	}

	@Override
	public double calcularArea() {
		 double areaBase = Math.PI * (Math.pow(raio, 2));
		 double areaLateral = 2 * Math.PI * raio *altura;
		 double areaTotal = ( 2 * areaBase) + areaLateral;
		 return areaTotal;
		
	}

	@Override
	public String toString() {
		return "Cilindro [raio=" + raio + ", altura=" + altura + ", calcularVolume()=" + calcularVolume()
				+ ", calcularArea()=" + calcularArea() + ", toString()=" + super.toString() + "]";
	}

}

package com.elenilson.cursojava.aula46labs;

public class Piramide extends Figura3D {

	public Piramide() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piramide(String nome, String cor) {
		super(nome, cor);
		// TODO Auto-generated constructor stub
	}

	public Piramide(double altura, double arestaBase, double apotema, int numPoliBase, Figura2D base) {
		super();
		this.altura = altura;
		this.arestaBase = arestaBase;
		this.apotema = apotema;
		this.numPoliBase = numPoliBase;
		this.base = base;
	}

	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPoliBase;

	public int getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	private Figura2D base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura) / 3;
		}
		return 0;
	}

	@Override
	public double calcularArea() {
		if (base != null) {
			return (numPoliBase * ((arestaBase * apotema) / 2)) + base.calcularArea();
		}
		return 0;

	}

	@Override
	public String toString() {
		return "Piramide [altura=" + altura + ", arestaBase=" + arestaBase + ", apotema=" + apotema + ", numPoliBase="
				+ numPoliBase + ", base=" + base + ", calcularVolume()=" + calcularVolume() + ", calcularArea()="
				+ calcularArea() + ", toString()=" + super.toString() + "]";
	}

	

}

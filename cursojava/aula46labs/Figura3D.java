package com.elenilson.cursojava.aula46labs;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica{
	

	public Figura3D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Figura3D(String nome, String cor) {
		super(nome, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Figura3D [getNome()=" + getNome() + ", getCor()=" + getCor() + ", toString()=" + super.toString() + "]";
	}

	

	
	

}

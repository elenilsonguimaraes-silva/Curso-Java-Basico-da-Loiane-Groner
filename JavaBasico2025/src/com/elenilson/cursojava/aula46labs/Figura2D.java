package com.elenilson.cursojava.aula46labs;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial{

	public Figura2D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Figura2D(String nome, String cor) {
		super(nome, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Figura2D [getNome()=" + getNome() + ", getCor()=" + getCor() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	

}

package com.elenilson.cursojava.aula43labs.exer02;

public abstract class Contribuinte {
	
	private String nome;
	private double renda;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRenda() {
		return renda;
	}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public abstract double calcularImposto();

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", renda=" + renda + "]";
	}

	
	
	
	
	

}

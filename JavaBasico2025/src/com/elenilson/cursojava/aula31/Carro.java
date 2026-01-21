package com.elenilson.cursojava.aula31;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros; // Número de passageiros
	double capCombustivel; // Capacimdade de tanque de combustível
	double consumoCombustivel; // Consumo de combustível por km
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro: " + modelo + " é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorCombustivel(double km) {
		return km/this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {

		return this.divideKmPorCombustivel(km);
	}



}

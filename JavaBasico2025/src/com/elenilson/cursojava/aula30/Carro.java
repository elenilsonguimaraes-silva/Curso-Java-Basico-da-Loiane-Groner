package com.elenilson.cursojava.aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros; // Número de passageiros
	double capCombustivel; // Capacidade de tanque de combustível
	double consumoCombustivel; // Consumo de combustível por km
	
	

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	public Carro(String marca, String modelo) {
		this(marca, modelo , 10);
		System.out.println("chamando o construtor com 2 paramêtros");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("chamando o construtor com 3 paramêtros");

	}
	public Carro() {}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro: " + modelo + " é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");

		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdeCombustivel = km / this.consumoCombustivel;

		return qtdeCombustivel;
	}

	


}

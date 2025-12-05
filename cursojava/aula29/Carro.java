package com.elenilson.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros; // Número de passageiros
	double capCombustivel; // Capacidade de tanque de combustível
	double consumoCombustivel; // Consumo de combustível por km
	
	Carro(){
		System.out.println("Classe Carro foi instanciada");
		numPassageiros = 4;
	}
	Carro(String marca_){
		marca = marca_;
	}
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
		
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro: " + modelo + " é: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdeCombustivel = km / consumoCombustivel;

		return qtdeCombustivel;
	}

}

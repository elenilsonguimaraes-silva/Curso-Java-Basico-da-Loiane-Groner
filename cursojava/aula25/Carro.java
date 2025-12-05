package com.elenilson.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;			//Número de passageiros
	double capCombustivel;		//Capacidade de tanque de combustível
	double consumoCombustivel;	//Consumo de combustível por km
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro: " + modelo + " é: " + capCombustivel * consumoCombustivel + " km");		
	}
	
	double obterAutonomia() {
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdeCombustivel = km / consumoCombustivel;
		
		return qtdeCombustivel;
	}
}

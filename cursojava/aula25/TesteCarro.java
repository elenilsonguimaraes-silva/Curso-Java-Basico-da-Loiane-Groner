package com.elenilson.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 5;
		
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro: " + van.modelo + " é: " + autonomia + " km");
		System.out.println("A autonomia do carro: " + van.modelo + " é: " + van.obterAutonomia() + " km");
		
		double qtdeCombustivel10 = van.calcularCombustivel(10);
		double qtdeCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdeCombustivel10 =  " + qtdeCombustivel10);
		System.out.println("qtdeCombustivel15 =  " + qtdeCombustivel15);
	}

}

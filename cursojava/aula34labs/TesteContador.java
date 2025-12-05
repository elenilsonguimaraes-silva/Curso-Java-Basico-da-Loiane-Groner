package com.elenilson.cursojava.aula34labs;

public class TesteContador {
	static void imprimirValor() {
		System.out.println("O contador vale: " + Contador.retornarContador());
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 imprimirValor();		 
		 Contador.incrementarContador();
		 imprimirValor();		 
		 Contador.incrementarContador();
		 Contador.incrementarContador();	 
		 Contador.incrementarContador();
		 imprimirValor();
		 
		 Contador contador = new Contador();
		 Contador contador2 = new Contador();
		 imprimirValor();
		 
		 Contador.zerarContador();
		 imprimirValor();
		 Contador.incrementarContador();
		 imprimirValor();
		 Contador.incrementarContador();
		 imprimirValor();
		

	}
	
	 
	

}

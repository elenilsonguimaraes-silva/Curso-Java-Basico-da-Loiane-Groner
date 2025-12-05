package com.elenilson.cursojava.aula34labs;

public   class  Contador {
	
	public  Contador() {
		contador++;
		
	}
	
	private static int contador = 0;
	
	public static void zerarContador(){
		contador = 0;
		
	}
	
	public static int incrementarContador() {
		contador++;
		return contador;
	}
	
	public static int retornarContador() {
		return contador;
	}
	

}

package com.elenilson.cursojava.aula35labs;

public class Somatorio {
	
	public static int somarNumeros(int numero) {
		if(numero == 1) {
			return 1;
		}
		return numero  + somarNumeros(numero - 1) ;
	}
}

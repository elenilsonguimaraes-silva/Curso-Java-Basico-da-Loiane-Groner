package com.elenilson.cursojava.aula52labs;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}

}

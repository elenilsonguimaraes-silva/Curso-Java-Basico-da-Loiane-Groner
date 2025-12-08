package com.elenilson.cursojava.aula52.labs;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}

}

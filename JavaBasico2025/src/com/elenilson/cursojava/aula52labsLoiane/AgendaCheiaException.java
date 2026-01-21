package com.elenilson.cursojava.aula52labsLoiane;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}

}

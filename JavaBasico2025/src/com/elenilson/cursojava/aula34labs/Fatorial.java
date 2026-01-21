package com.elenilson.cursojava.aula34labs;

public class Fatorial {
	
	private static int num = 0;
	
	public Fatorial() {
		
	}

	public Fatorial(int num) {
		super();
		this.num = this.fatorial(num);
	}

	public static int fatorial(int num) {
		int fat = 1;
		for(int i = 1; i <= num; i++) {
			fat*= i;
		}
		return fat;		
	}	
	public int retornarFatorial(int num) {
		int numero  = fatorial(num);
		return numero;
	}
}

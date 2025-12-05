package com.elenilson.cursojava.aula27.labs;

public class ContaCorrente {
	String codigo;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	
	
	boolean realizarSaque(double valorASacar) {
		if(saldo >= valorASacar) {
			saldo -= valorASacar ;
			return true;
		}else {
			if(especial) {
				double limite = limiteEspecial + saldo;
				if(limite >= valorASacar) {
					saldo -= valorASacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}			
		}		
	}
	void consultarSaldo() {
		System.out.println("Saldo atual da conta " + codigo + " = " + saldo);	
	}
	void depositar(double valorDepositado) {
			
		saldo += valorDepositado;
		
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	
		
}

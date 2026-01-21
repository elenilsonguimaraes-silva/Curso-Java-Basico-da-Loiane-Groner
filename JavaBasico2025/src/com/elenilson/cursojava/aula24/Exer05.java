package com.elenilson.cursojava.aula24;

public class Exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaCorrente.codigo = "123456";
		contaCorrente.agencia = "1234";
		contaCorrente.especial = true;
		contaCorrente.limiteEspecial = 500;
		contaCorrente.saldo = -10;
		
		System.out.println("Saldo da conta " + contaCorrente.codigo +" = " + contaCorrente.saldo);
		

	}

}

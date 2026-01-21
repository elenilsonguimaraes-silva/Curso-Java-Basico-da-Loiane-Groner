package com.elenilson.cursojava.aula33labs;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente contaCorrente = new ContaCorrente("123456", "1234", true, 500, 0, -10);
		/*
		contaCorrente.codigo = "123456";
		contaCorrente.agencia = "1234";
		contaCorrente.especial = true;
		contaCorrente.limiteEspecial = 500;
		contaCorrente.valorEspecialUsado = 0;
		contaCorrente.saldo = -10;
		*/
		
		
		contaCorrente.consultarSaldo();

		 
		boolean saqueEfetuado = contaCorrente.realizarSaque(10); 
		
		if(saqueEfetuado) {
		
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultarSaldo();

		}else {
			System.out.println("Saque não realizado. Saldo insuficiente!");
		}
		
		saqueEfetuado = contaCorrente.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaCorrente.consultarSaldo();

		}else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}
		
		System.out.println("Depósito de 500 reais");
		contaCorrente.depositar(500);
		contaCorrente.consultarSaldo();
		if(contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
		
		contaCorrente.realizarSaque(600);
		contaCorrente.consultarSaldo();
		if(contaCorrente.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}

	}

}

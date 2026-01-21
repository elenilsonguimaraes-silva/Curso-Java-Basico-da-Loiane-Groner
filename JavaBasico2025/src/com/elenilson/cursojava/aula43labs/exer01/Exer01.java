package com.elenilson.cursojava.aula43labs.exer01;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Teste ContaPoupança***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Elenilson", "22222", 0, 29);
		System.out.println(contaPoupanca);
		contaPoupanca.depositar(100);
		System.out.println(contaPoupanca);
		System.out.println(realizarSaque(contaPoupanca, 50));
		System.out.println(contaPoupanca);
		System.out.println(realizarSaque(contaPoupanca, 70));
		System.out.println(contaPoupanca);
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = R$" + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado!");
		}
		System.out.println(contaPoupanca);
		
		System.out.println();
		
		System.out.println("***Teste ContaEspecial***");
		
		ContaEspecial contaEspecial = new ContaEspecial("Elenilson", "33333", 0);
		
		contaEspecial.setLimite(50);
		
		contaEspecial.toString();
		
		contaEspecial.depositar(100);
		
		System.out.println(contaEspecial);
		
		System.out.println(realizarSaque(contaEspecial, 50));
		
		System.out.println(contaEspecial.toString());
		
		System.out.println(realizarSaque(contaEspecial, 70));
		
		System.out.println(contaEspecial);
		
		System.out.println(realizarSaque(contaEspecial, 80));
		
		System.out.println(contaEspecial);
		
		
		
	}
	public static String realizarSaque(ContaPoupanca conta, double valorASacar) {
		if ((conta.getSaldo() - valorASacar) >= 0) {
			conta.sacar(valorASacar);
			return "Saque Realizado, novo saldo= " + conta.getSaldo();
		} else {
			return "Operação inválida! Saldo insuficiente.";
		}
	}
	public static String realizarSaque(ContaEspecial conta, double valorASacar) {
		if (conta.sacar(valorASacar)) {			
			return "Saque Realizado, novo saldo= " + conta.getSaldo();
		} else {
			return "Operação inválida! Saldo insuficiente.";
		}
	}
	

}

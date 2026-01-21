package com.elenilson.cursojava.aula43labsLoianeExer01;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", getNomeCliente()=" + getNomeCliente() + ", getNumConta()="
				+ getNumConta() + ", getSaldo()=" + getSaldo() + "]";
	}

	public boolean sacar(double valor) {
		
		double saldoComLimite = this.getSaldo() + limite;
		
		if(saldoComLimite - valor >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	

}

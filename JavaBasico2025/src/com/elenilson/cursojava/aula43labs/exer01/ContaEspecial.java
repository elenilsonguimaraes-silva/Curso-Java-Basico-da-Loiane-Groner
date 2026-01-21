package com.elenilson.cursojava.aula43labs.exer01;

public class ContaEspecial extends ContaBancaria {

	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaEspecial(String nomecliente, String numConta, double saldo) {
		super(nomecliente, numConta, saldo);
		// TODO Auto-generated constructor stub
	}

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valorASacar) {
		
		double saldoComLimite = this.getLimite() + this.getSaldo();
		if((saldoComLimite -valorASacar)>=0) {
			this.setSaldo(this.getSaldo() - valorASacar);
			return true;			
		}
		return false;
		
	}
	

	@Override
	public boolean depositar(double deposito) {
		if(deposito > 0) {
			this.setSaldo(this.getSaldo() + deposito);
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", getNomecliente()=" + getNomecliente() + ", getNumConta()="
				+ getNumConta() + ", getSaldo()=" + getSaldo() + "]";
	}

}

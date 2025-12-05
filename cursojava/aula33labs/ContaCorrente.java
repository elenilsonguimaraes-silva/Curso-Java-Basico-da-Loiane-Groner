package com.elenilson.cursojava.aula33labs;

public class ContaCorrente {
	
	private String codigo;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;
	
	public ContaCorrente() {}
	
	

	public ContaCorrente(String codigo, String agencia, boolean especial, double limiteEspecial,
			double valorEspecialUsado, double saldo) {
		super();
		this.codigo = codigo;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.valorEspecialUsado = valorEspecialUsado;
		this.saldo = saldo;
	}



	private String getCodigo() {
		return codigo;
	}

	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	private String getAgencia() {
		return agencia;
	}

	private void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	private boolean isEspecial() {
		return especial;
	}

	private void setEspecial(boolean especial) {
		this.especial = especial;
	}

	private double getLimiteEspecial() {
		return limiteEspecial;
	}

	private void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	private double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	private void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean realizarSaque(double valorASacar) {
		if(this.getSaldo() >= valorASacar) {
			this.setSaldo(this.getSaldo() - valorASacar);
			return true;
		}else {
			if(this.isEspecial()) {
				double limite = this.getLimiteEspecial() + this.getSaldo();
				if(limite >= valorASacar) {
					this.setSaldo(this.getSaldo() - valorASacar);
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
		System.out.println("Saldo atual da conta " + this.getCodigo() + " = " + this.getSaldo());	
	}
	void depositar(double valorDepositado) {
			
		this.setSaldo(this.getSaldo() + valorDepositado);
		
	}
	
	boolean verificarUsoChequeEspecial() {
		return this.isEspecial();
	}
	
		

}

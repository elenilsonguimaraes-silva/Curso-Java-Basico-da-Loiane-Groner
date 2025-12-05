package com.elenilson.cursojava.aula43labs.exer02;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double calcularImposto() {

		if (this.getRenda() > 0 && this.getRenda() <= 1400) {
			return 0;
		}
		if (this.getRenda() > 1400 && this.getRenda() <= 2100) {
			return (this.getRenda() * 0.1) - 100;
		}
		if (this.getRenda() > 2100 && this.getRenda() <= 2800) {
			return (this.getRenda() * 0.15) - 270;
		}
		if (this.getRenda() > 2800 && this.getRenda() <= 3600) {
			return (this.getRenda() * 0.25) - 500;
		}

		return (this.getRenda() * 0.3) - 700;

	}

	@Override
	public String toString() {
		return "PessoaFisica [" + super.toString() + "cpf= " + cpf +
				", calcularImposto()=" + calcularImposto()  + "]";
	}

	
	

	

}

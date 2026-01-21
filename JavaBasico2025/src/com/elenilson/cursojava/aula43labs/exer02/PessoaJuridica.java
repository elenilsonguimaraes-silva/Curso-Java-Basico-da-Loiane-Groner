package com.elenilson.cursojava.aula43labs.exer02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double calcularImposto() {
		return this.getRenda()  * 0.1;
	}

	@Override
	public String toString() {
		return "PessoaJuridica ["+ super.toString() + "cnpj= " + cnpj + "]";
	}

	
	
	

}

package com.elenilson.cursojava.aula43labsLoianeExer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPopanca [diaRendimento=" + diaRendimento + ", getNomeCliente()=" + getNomeCliente()
				+ ", getNumConta()=" + getNumConta() + ", getSaldo()=" + getSaldo() + "]";
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * rendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
	
	

}

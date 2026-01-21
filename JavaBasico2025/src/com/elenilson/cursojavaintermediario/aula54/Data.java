package com.elenilson.cursojavaintermediario.aula54;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private DiaSemana diaSemama;
	
	public Data() {
		super();
	}
	
	
	public Data(int dia, int mes, int ano, DiaSemana diaSemama) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaSemama = diaSemama;
	}


	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public DiaSemana getDiaSemama() {
		return diaSemama;
	}
	public void setDiaSemama(DiaSemana diaSemama) {
		this.diaSemama = diaSemama;
	}
	

}
